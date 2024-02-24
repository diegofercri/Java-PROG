package examen;

import java.util.ArrayList;

public class Facultad {

	private ArrayList<Persona> personal;

	public Facultad(ArrayList<Persona> personal) {
		super();
		this.personal = personal;
	}

	public Facultad() {
		super();
		this.personal = new ArrayList<Persona>();
	}

	public ArrayList<Persona> getPersonal() {
		return personal;
	}

	public void setPersonal(ArrayList<Persona> personal) {
		this.personal = personal;
	}

	public void add(Persona persona) {
		this.personal.add(persona);
	}
	
	public void remove(Persona persona) {
		this.personal.remove(persona);
	}
	
	@Override
	public String toString() {
		String resultado = "Personal de la Facultad: \n";
		for (Persona persona : personal) {
			resultado += persona + "\n";
		}
		return resultado;
	}
	
	/*
	 * metodo getAlumnosPorCurso(), que retorna una lista con todos los alumnos 
	 * que pertenecen a un curso concreto 
	 */
	public ArrayList<Estudiante> getAlumnosPorCurso( Estudiante.Curso curso){
		ArrayList<Estudiante> listaPorCurso = new ArrayList<Estudiante>();
		for (Persona persona : personal) {
			if(persona instanceof Estudiante && ((Estudiante)persona).getCurso() == curso ) {
				listaPorCurso.add((Estudiante) persona);
			}
		}
		return listaPorCurso;
	}
	
	/*
	 * metodo getPersonalPorDespacho() al que le pasamos un numero de despacho 
	 * y nos retorna una lista con las personas que lo comparten
	 */
	public ArrayList<Empleado> getPersonalPorDespacho( int despacho){
		ArrayList<Empleado> listaPorDespacho = new ArrayList<Empleado>();
		for (Persona persona : personal) {
			if(persona instanceof Empleado && ((Empleado)persona).getDespacho() == despacho ) {
				listaPorDespacho.add( (Empleado) persona);
			}
		}
		return listaPorDespacho;
	}
	
}
