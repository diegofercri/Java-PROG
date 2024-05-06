package ejercicio1;

import java.util.ArrayList;

public class Cliente {
    private Integer id;
    private ArrayList<Integer> destinos;

    public Cliente(int id) {
        this.id = id;
        this.destinos = new ArrayList<Integer>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getDestinos() {
        return this.destinos;
    }

    public void setDestinos(ArrayList<Integer> destinos) {
        this.destinos = destinos;
    }

    public int getContadorLlamadas() {
        return this.destinos.size();
    }

    @Override
    public String toString() {
        return getId() + ":" + getContadorLlamadas() + ":" + getDestinos().toString().replace("[", "").replace("]", "").replace(",","");
    }

}
