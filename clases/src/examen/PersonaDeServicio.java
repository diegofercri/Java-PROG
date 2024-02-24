package examen;

public class PersonaDeServicio extends Empleado {

	public enum Seccion{
		Biblioteca, Decanato, Secretaria
	}
	
	protected Seccion seccion;

	public PersonaDeServicio(String dni, String nombre, int anioIncorporacion, int despacho, Seccion seccion) {
		super(dni, nombre, anioIncorporacion, despacho);
		this.seccion = seccion;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "PersonaDeServicio: " + super.toString() + ", seccion=" + seccion;
	}
	
	
}
