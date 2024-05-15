package entidades;

import java.util.ArrayList;

public class Poblacion {
	private String nombre;
	private int numHabitantes;
	
	public Poblacion(String nombre, int numHabitantes) {
		super();
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitantes() {
		return numHabitantes;
	}

	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}

	@Override
	public String toString() {
		return "Poblacion [nombre=" + nombre + ", numHabitantes=" + numHabitantes + "]";
	}
	
}
