package facultad;

public class PersonalServicio extends Empleado {
    protected String seccion;

    public PersonalServicio(String nombre, String apellidos, String dni, int numDespacho, String seccion) {
        super(nombre, apellidos, dni, numDespacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return this.seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    @Override
	public String toString() {
		return "Estudiante: " + super.toString() + ", seccion=" + seccion;
	}
}
