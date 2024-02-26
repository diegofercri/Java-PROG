package banco;

import java.util.ArrayList;

public class Pasivo {
    private ArrayList<Prestamo> prestamos;

    public Pasivo(ArrayList<Prestamo> prestamos) {
        super();
        this.prestamos = prestamos;
    }

    public Pasivo() {
        super();
        this.prestamos = new ArrayList<Prestamo>();
    }

    public ArrayList<Prestamo> getPrestamos() {
        return this.prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    // Metodos

    public void add(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public void remove(Prestamo prestamo) {
        this.prestamos.remove(prestamo);
    }

    @Override
    public String toString() {
        String resultado = "Prestamos:\n";
        for (Prestamo prestamo : prestamos) {
            resultado += prestamo + "\n";
        }
        return resultado;
    }

    public StringBuilder getPrestamosFijos() {
        StringBuilder listaAlum = new StringBuilder("Prestamos fijos:\n");
        for (Prestamo prestamo : prestamos) {
            if (prestamo instanceof Fijo) {
                listaAlum.append(prestamo + "\n");
            }
        }
        return listaAlum;
    }

    public StringBuilder getPrestamosVariables() {
        StringBuilder listaAlum = new StringBuilder("Prestamos variables:\n");
        for (Prestamo prestamo : prestamos) {
            if (prestamo instanceof Variable) {
                listaAlum.append(prestamo + "\n");
            }
        }
        return listaAlum;
    }

    // Con ArrayList

    public ArrayList<Fijo> getPrestamosFijosArray() {
        ArrayList<Fijo> listaFijos = new ArrayList<Fijo>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo instanceof Fijo) {
                listaFijos.add((Fijo) prestamo);
            }
        }
        return listaFijos;
    }

    public ArrayList<Variable> getPrestamosVariablesArray() {
        ArrayList<Variable> listaVariables = new ArrayList<Variable>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo instanceof Variable) {
                listaVariables.add((Variable) prestamo);
            }
        }
        return listaVariables;
    }
}
