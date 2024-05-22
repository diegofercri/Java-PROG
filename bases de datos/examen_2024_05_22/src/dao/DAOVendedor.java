
package dao;
import java.sql.*;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Vendedor;


public class DAOVendedor{

	public ArrayList<Vendedor> get(){
		ArrayList<Vendedor> lista=new ArrayList<Vendedor>();

		try{
			Connection conexion=new DBConnection().getConexion();

			String sql="SELECT * FROM vendedor ORDER BY codigo";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.execute();
			ResultSet resultado=plataforma.getResultSet();

			while(resultado.next()){
				Vendedor v=new Vendedor(resultado.getString("codigo"), resultado.getString("nombre"));
				lista.add(v);
			}

			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando vendedores");
			e.printStackTrace();
		}

		return lista;
	}

	public Vendedor get(String codigo){
		Vendedor v=null;

		try{
			Connection conexion=new DBConnection().getConexion();
			
			String sql="SELECT * FROM vendedor WHERE codigo LIKE ?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setString(1, codigo);
			plataforma.execute();
			ResultSet resultado=plataforma.getResultSet();


			if(resultado.next()){
				v=new Vendedor(resultado.getString("codigo"), resultado.getString("nombre"));

			}

			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando vendedor");
		}

		return v;

	}


}
