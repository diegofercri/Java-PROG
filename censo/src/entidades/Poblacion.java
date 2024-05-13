package entidades;

import java.util.ArrayList;

public class Poblacion {
	private String nombre;
	private int numHabitantes;
	private ArrayList<Habitante> Habitantes;
	
	public Poblacion(String nombre, int numHabitantes, ArrayList<Habitante> habitantes) {
		super();
		this.nombre = nombre;
		this.numHabitantes = habitantes.size();
		Habitantes = habitantes;
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

	public ArrayList<Habitante> getHabitantes() {
		return Habitantes;
	}

	public void setHabitantes(ArrayList<Habitante> habitantes) {
		Habitantes = habitantes;
	}
	
	public void addHabitante(Habitante h) {
		
	}

	@Override
	public String toString() {
		return "Poblacion [nombre=" + nombre + ", numHabitantes=" + numHabitantes + ", Habitantes=" + Habitantes + "]";
	}
	
}
