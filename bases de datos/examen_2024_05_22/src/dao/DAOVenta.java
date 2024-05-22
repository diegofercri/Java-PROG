package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Venta;

public class DAOVenta {
	public DAOVenta() {
		super();
	}
	
	// El DAOVenta con los métodos: 
	// add()
	// get() que retorna todos los objetos Venta
	// get() que retorna una venta pasando como parámetro una referencia
	// get() que retorna todos los objetos Venta de un vendedor cuyo código se pasa como parámetro
	
	public void add(Venta v) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "INSERT INTO Venta VALUES(?,?,?)";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setInt(1, v.getReferencia());
			sentencia.setDate(2, v.getFechaVenta());
			sentencia.setString(3, v.getVendedor());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error insertando el Venta");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Venta> get() {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		ArrayList<Venta> listaVentas = new ArrayList<Venta>();
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT referencia, fechaVenta, vendedor FROM Venta";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				listaVentas.add(new Venta(resultado.getInt(1), resultado.getDate(2), resultado.getString(3)));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo Lista Ventas");
			e.printStackTrace();
		}
		
		return listaVentas;
	}
	
	public Venta get(int referencia) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		Venta v = null;
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT referencia, fechaVenta, vendedor FROM Venta WHERE referencia = ?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setInt(1, referencia);
			
			ResultSet resultado = sentencia.executeQuery();
			
			if (resultado.next()) {
				v = new Venta(resultado.getInt(1), resultado.getDate(2), resultado.getString(3));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo el Venta");
			e.printStackTrace();
		}
		
		return v;
	}
	
	public Venta get(String codigo) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		Venta v = null;
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT referencia, fechaVenta, vendedor FROM Venta, Vendedor WHERE Venta.vendedor = Vendedor.codigo AND Vendedor.codigo = ?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, codigo);
			
			ResultSet resultado = sentencia.executeQuery();
			
			if (resultado.next()) {
				v = new Venta(resultado.getInt(1), resultado.getDate(2), resultado.getString(3));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo el Venta");
			e.printStackTrace();
		}
		
		return v;
	}
}
