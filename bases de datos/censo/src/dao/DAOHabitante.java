package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Habitante;

public class DAOHabitante {
	
	public DAOHabitante() {
		super();
	}
	
	public void add(Habitante h) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "INSERT INTO habitante VALUES(?,?,?,?)";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(1, h.getNombre());
			sentencia.setString(2, h.getEmail());
			sentencia.setInt(3, h.getEdad());
			sentencia.setString(4, h.getPoblacion());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error insertando el habitante");
			e.printStackTrace();
		}
	}
	
	public void updateEmail(Habitante h) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "UPDATE habitante SET email=? WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(2, h.getNombre());
			sentencia.setString(1, h.getEmail());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error actualizando el habitante");
			e.printStackTrace();
		}
		
	}
	
	public void updateEdad(Habitante h) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "UPDATE habitante SET edad=? WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(2, h.getNombre());
			sentencia.setInt(1, h.getEdad());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error actualizando el habitante");
			e.printStackTrace();
		}
		
	}
	
	public void updatePoblacion(Habitante h) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "UPDATE habitante SET poblacion=? WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(2, h.getNombre());
			sentencia.setString(1, h.getPoblacion());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error actualizando el habitante");
			e.printStackTrace();
		}
		
	}
	
	
	public ArrayList<Habitante> getHabitantes() {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		ArrayList<Habitante> Habitantes = new ArrayList<>();
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT nombre, email, edad, poblacion FROM habitante";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				Habitantes.add(new Habitante(resultado.getString(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4)));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo los habitantes");
			e.printStackTrace();
		}
		
		return Habitantes;
	}
	
	public ArrayList<Habitante> getHabitantesPorPoblacion(String nombre) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		ArrayList<Habitante> Habitantes = new ArrayList<>();
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT nombre, email, edad, poblacion FROM habitante WHERE poblacion=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				Habitantes.add(new Habitante(resultado.getString(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4)));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo los habitantes");
			e.printStackTrace();
		}
		
		return Habitantes;
	}
	
	public Habitante getHabitante(String nombre) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		Habitante h = null;
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT nombre, email, edad, poblacion FROM habitante WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			
			ResultSet resultado = sentencia.executeQuery();
			
			if (resultado.next()) {
				h = new Habitante(resultado.getString(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo el habitante");
			e.printStackTrace();
		}
		
		return h;
	}
	
	public void delete(Habitante h) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "DELETE FROM habitante WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(1, h.getNombre());
			
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
