package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Inmueble;
import entidades.Venta;

public class DAOInmueble {
    public DAOInmueble() {
		super();
	}
	
	// add()
    // get() que retorna todos los objetos Inmueble
    // getlistaInmueblesSinVender()  que  retorna  los  listainmuebles  que  todavía  no  se  han vendido
	
	public void add(Inmueble i) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "INSERT INTO Inmueble VALUES(?,?,?,?,?,?)";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setInt(1, i.getReferencia());
			sentencia.setDate(2, i.getFechaAlta());
            sentencia.setString(3, i.getTipo());
            sentencia.setString(4, i.getProvincia());
            sentencia.setInt(5, i.getSuperficie());
            sentencia.setFloat(6, i.getPrecio());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error insertando el Inmueble");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Inmueble> get() {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		ArrayList<Inmueble> listaInmuebles = new ArrayList<Inmueble>();
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT referencia, fechaAlta, tipo, provincia, superficie, precio FROM Inmueble";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				listaInmuebles.add(new Inmueble(resultado.getInt(1), resultado.getDate(2), resultado.getString(3), resultado.getString(4), resultado.getInt(5), resultado.getFloat(6)));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo Lista Inmuebles");
			e.printStackTrace();
		}
		
		return listaInmuebles;
	}

	public ArrayList<Inmueble> getInmueblesSinVenver() {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		ArrayList<Inmueble> listaInmuebles = new ArrayList<Inmueble>();
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT referencia, fechaAlta, tipo, provincia, superficie, precio FROM Inmueble WHERE referencia NOT IN (SELECT referencia FROM Venta)";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				listaInmuebles.add(new Inmueble(resultado.getInt(1), resultado.getDate(2), resultado.getString(3), resultado.getString(4), resultado.getInt(5), resultado.getFloat(6)));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo Lista Inmuebles");
			e.printStackTrace();
		}
		
		return listaInmuebles;
	}
}
