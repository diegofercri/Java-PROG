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
			System.out.print("Error insertando el contacto");
			e.printStackTrace();
		}
	}
	
	public void updateEmail(Habitante h) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "UPDATE contacto SET email=? WHERE nombre=?";
			
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
			System.out.print("Error actualizando el contacto");
			e.printStackTrace();
		}
		
	}
	
	public void updateEdad(Habitante h) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "UPDATE contacto SET edad=? WHERE nombre=?";
			
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
			System.out.print("Error actualizando el contacto");
			e.printStackTrace();
		}
		
	}
	
	public void updatePoblacion(Habitante h) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "UPDATE contacto SET poblacion=? WHERE nombre=?";
			
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
			System.out.print("Error actualizando el contacto");
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Contacto> get() {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		ArrayList<Contacto> Contactos = new ArrayList<Contacto>();
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT nombre, telefono FROM contacto";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				Contactos.add(new Contacto(resultado.getString(1), resultado.getLong(2)));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo los contactos");
			e.printStackTrace();
		}
		
		return Contactos;
	}
	
	public Contacto getContacto(String nombre) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		Contacto c = null;
		
		try {
			// Usando un PreparedStatement
			String sql = "SELECT nombre, telefono FROM contacto WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			
			ResultSet resultado = sentencia.executeQuery();
			
			if (resultado.next()) {
				c = new Contacto(resultado.getString(1), resultado.getLong(2));
			}
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error obteniendo el contacto");
			e.printStackTrace();
		}
		
		return c;
	}
	
	public void delete(Contacto c) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "DELETE FROM contacto WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(1, c.getNombre());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error borrando el contacto");
			e.printStackTrace();
		}
		
	}
}
