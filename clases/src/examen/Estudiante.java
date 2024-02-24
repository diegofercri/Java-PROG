package examen;

public class Estudiante extends Persona{

	public enum Curso{
		Primero, Segundo, Tercero, Cuarto
	}
	
	protected Curso curso;

	public Estudiante(String dni, String nombre, Curso curso) {
		super(dni, nombre);
		this.curso = curso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudiante: " + super.toString() + ", curso=" + curso;
	}
	
	
}
