package facultad;

public class Estudiante extends Persona {
    protected String curso;

    public Estudiante(String nombre, String apellidos, String dni, String curso) {
        super(nombre, apellidos, dni);
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
	public String toString() {
		return "Estudiante: " + super.toString() + ", curso=" + curso;
	}
}
