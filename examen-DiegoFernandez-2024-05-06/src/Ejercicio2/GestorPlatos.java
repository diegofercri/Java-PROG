package ejercicio2;

import java.io.*;
import java.util.*;

public class GestorPlatos {
    private ArrayList<Plato> platos;

    public GestorPlatos() {
        this.platos = new ArrayList<>();
    }

    public void anadirPlato(Plato plato) {
        this.platos.add(plato);
    }

    public void eliminarPlato(Plato plato) {
        this.platos.remove(plato);
    }

    public ArrayList<Plato> obtenerListaDePlatos() {
        return this.platos;
    }
}
