package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Poblacion;

public class DAOPoblacion {
	public DAOPoblacion() {
		super();
	}
	
	public void add(Poblacion p) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "INSERT INTO poblacion VALUES(?,?)";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(1, p.getNombre());
			sentencia.setInt(2, p.getNumHabitantes());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error insertando el habitante");
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<Poblacion> getPoblaciones() {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		ArrayList<Poblacion> Poblaciones = new ArrayList<>();
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT nombre, numeroHabitantes FROM poblacion";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				Poblaciones.add(new Poblacion(resultado.getString(1), resultado.getInt(2)));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo los habitantes");
			e.printStackTrace();
		}
		
		return Poblaciones;
	}
	
	public Poblacion getPoblacion(String nombre) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		Poblacion p = null;
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT nombre, numeroHabitantes FROM poblacion WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			
			ResultSet resultado = sentencia.executeQuery();
			
			if (resultado.next()) {
				p = new Poblacion(resultado.getString(1), resultado.getInt(2));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo el habitante");
			e.printStackTrace();
		}
		
		return h;
	}
	
	public void delete(Poblacion p) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "DELETE FROM poblacion WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(1, p.getNombre());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error borrando el habitante");
			e.printStackTrace();
		}
		
	}
}
