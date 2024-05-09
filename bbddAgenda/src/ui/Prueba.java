package ui;

import dao.DAOContacto;
import entidades.Contacto;

public class Prueba {

	public static void main(String[] args) {
		DAOContacto daoContacto = new DAOContacto();
		daoContacto.add(new Contacto("Julian", 759632589));
		//daoContacto.update(new Contacto("Diego", 655812589));
		//System.out.print(daoContacto.get());
	}

}
