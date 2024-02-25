package facultad;

public class PersonaServicio extends Empleado {
    protected String seccion;

    public PersonaServicio(String nombre, String apellidos, String dni, int numDespacho, String seccion) {
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
		return "Personal de Servicio: " + super.toString() + ", seccion=" + seccion;
	}
}
