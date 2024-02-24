package examen;

public abstract class Empleado extends Persona{

	protected int aniooIncorporacion;
	protected int despacho;
	
	public Empleado(String dni, String nombre, int aniooIncorporacion, int despacho) {
		super(dni, nombre);
		this.aniooIncorporacion = aniooIncorporacion;
		this.despacho = despacho;
	}

	public int getAniooIncorporacion() {
		return aniooIncorporacion;
	}

	public void setAniooIncorporacion(int aniooIncorporacion) {
		this.aniooIncorporacion = aniooIncorporacion;
	}

	public int getDespacho() {
		return despacho;
	}

	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		return super.toString() + ", aniooIncorporacion=" + aniooIncorporacion + ", despacho="
				+ despacho;
	}
	
}
