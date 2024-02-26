package banco;

public class Fijo extends Prestamo {
    double interes;
    
    public Fijo(String titular, double cantidad, int duracion, double interes) {
        super(titular, cantidad, duracion);
        this.interes = interes;
    }

    public double getInteres() {
        return this.interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " interes='" + getInteres() + "'" +
            "}";
    }
}