package facultad;

public class Profesor extends Empleado {
    protected String departamento;

    public Profesor(String nombre, String apellidos, String dni, int numDespacho, String departamento) {
        super(nombre, apellidos, dni, numDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
	public String toString() {
		return "Profesor: " + super.toString() + ", departamento=" + departamento;
	}
}
