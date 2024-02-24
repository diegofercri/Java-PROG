package facultad;

import java.time.LocalDateTime;

public class Empleado extends Persona {
    protected int anioIncorportacion;
    protected int numDespacho;

    public Empleado(String nombre, String apellidos, String dni, int numDespacho) {
        super(nombre, apellidos, dni);
        this.anioIncorportacion = LocalDateTime.now().getYear();
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorportacion() {
        return this.anioIncorportacion;
    }

    public int getNumDespacho() {
        return this.numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
	public String toString() {
		return "Estudiante: " + super.toString() + ", AnioIncorporacion=" + anioIncorportacion + ", NumDespacho=" + numDespacho;
	}
}
