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

    public void add(Persona persona) {
		this.personal.add(persona);
	}
	
	public void remove(Persona persona) {
		this.personal.remove(persona);
	}

}
