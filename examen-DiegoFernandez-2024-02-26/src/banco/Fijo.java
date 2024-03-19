package banco;

public class Fijo extends Prestamo {
    protected double interes;
    protected double cuota;
    
    public Fijo(String titular, double cantidad, double duracion, double interes) {
        super(titular, cantidad, duracion);
        this.interes = interes;
        this.cuota = cuota();
    }

    public double getInteres() {
        return this.interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getCuota() {
        return this.cuota;
    }

    public double cuota() {
        return (this.capital * this.interes) / (1 - Math.pow(1 + this.interes, -(this.duracion * 12)));
    }

    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " interes='" + getInteres() + "'" +
            " cuota='" + getCuota() + "'" +
            "}";
    }
}