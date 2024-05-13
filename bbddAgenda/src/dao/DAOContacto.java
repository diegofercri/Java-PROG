package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Contacto;

public class DAOContacto {
	
	/*
	 * Gestor encargado de la tabla contacto.
	 * Deberia saber hacer un insert, update, delete y select
	 * Transformara los objetos en sentencias sql y viceversa
	 */
	
	public DAOContacto() {
		super();
	}
	
	// Metodo para guardar un objeto en la tabla
	// Metodo para actualizar un objeto en la tabla
	// Metodo para eliminar un objeto de la tabla
	// Metodo para obtener todos los objetos de la tabla
	// Metodo para obtener un objeto concreto dado su nombre
	
	public void add(Contacto c) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "INSERT INTO contacto VALUES(?,?)";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(1, c.getNombre());
			sentencia.setLong(2, c.getTelefono());
			
			// Ejecutamos
			sentencia.executeUpdate();
			
			// Cerramos la conexion
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.print("Error insertando el contacto");
			e.printStackTrace();
		}
	}
	
	public void update(Contacto c) {
		// Obtenemos la conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			// Usando un PreparedStatement
			String sql = "UPDATE contacto SET telefono=? WHERE nombre=?";
			
			// Creamos el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			// Sustituimos las interrogaciones
			sentencia.setString(2, c.getNombre());
			sentencia.setLong(1, c.getTelefono());
			
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
