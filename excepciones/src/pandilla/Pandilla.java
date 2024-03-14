package pandilla;

import java.util.ArrayList;

public class Pandilla {
    private int capacidad;
    private ArrayList<Amigo> amigos;

    public Pandilla(int cantidad) {
        this.capacidad = cantidad;
        this.amigos = new ArrayList<Amigo>();
    }

    public int getcapacidad() {
        return this.capacidad;
    }

    public void add(Amigo amigo) throws PandillaCompletaException, NoMeGustaTuNombreException {
        if (amigo.getNombre().toLowerCase().endsWith("s")) {
            throw new NoMeGustaTuNombreException("Tu nombre es un mierdon");
        } else if (this.capacidad == this.amigos.size()) {
            throw new PandillaCompletaException("Ya somos muchos amigos");
        } else {
            this.amigos.add(amigo);
            System.out.println("Amigo anadido");
        }
    }

    public void remove(Amigo amigo) {
        this.amigos.remove(amigo);
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("Amigos del grupo: ");
        for (Amigo amigo : this.amigos) {
            resultado.append("\n").append(amigo.toString());
        }
        resultado.append("\nTotal de amigos: ").append(this.amigos.size());
        return resultado.toString();
    }
}
