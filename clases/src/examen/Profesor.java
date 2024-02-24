package examen;

public class Profesor extends Empleado{
	
	public enum Departamento{
		Lenguajes, Matemeticas, Arquitectura, Sistemas
	}
	
	protected Departamento departamento;

	public Profesor(String dni, String nombre, int anioIncorporacion, int despacho, Departamento departamento) {
		super(dni, nombre, anioIncorporacion, despacho);
		this.departamento = departamento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesor: " + super.toString() + ", departamento=" + departamento;
	}
	
	
}
