package facultad;

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
		return this.personal;
	}

	public void setPersonal(ArrayList<Persona> personal) {
		this.personal = personal;
	}

	// Metodos

	public void add(Persona persona) {
		this.personal.add(persona);
	}

	public void remove(Persona persona) {
		this.personal.remove(persona);
	}

	@Override
	public String toString() {
		String resultado = "Personal de la Facultad:\n";
		for (Persona persona : personal) {
			resultado += persona + "\n";
		}
		return resultado;
	}

	public StringBuilder getAlumnosPorCurso(String curso) {
		StringBuilder listaAlum = new StringBuilder("Alumnos de " + curso + ":\n");
		for (Persona persona : personal) {
			if (persona instanceof Estudiante && ((Estudiante) persona).getCurso().equals(curso)) {
				listaAlum.append(persona + "\n");
			}
		}
		return listaAlum;
	}

	public StringBuilder getPersonalPorDespacho(int numDespacho) {
		StringBuilder listaEmp = new StringBuilder("Empleados del despacho " + numDespacho + ":\n");
		for (Persona persona : personal) {
			if (persona instanceof Empleado && ((Empleado) persona).getNumDespacho() == numDespacho) {
				listaEmp.append(persona + "\n");
			}
		}
		return listaEmp;
	}


	// Con ArrayList
	
	public ArrayList<Estudiante> getAlumnosPorCursoArray(String curso) {
		ArrayList<Estudiante> listaPorCurso = new ArrayList<Estudiante>();
		for (Persona persona : personal) {
			if (persona instanceof Estudiante && ((Estudiante) persona).getCurso().equals(curso)) {
				listaPorCurso.add((Estudiante) persona);
			}
		}
		return listaPorCurso;
	}

	public ArrayList<Empleado> getPersonalPorDespachoArray(int numDespacho) {
		ArrayList<Empleado> listaPorDespacho = new ArrayList<Empleado>();
		for (Persona persona : personal) {
			if (persona instanceof Empleado && ((Empleado) persona).getNumDespacho() == numDespacho) {
				listaPorDespacho.add((Empleado) persona);
			}
		}
		return listaPorDespacho;
	}

}
