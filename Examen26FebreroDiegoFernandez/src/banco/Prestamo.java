package banco;

public abstract class Prestamo {
    protected String titular;
    protected double capital;
    protected double duracion;

    protected Prestamo(String titular, double capital, double duracion) {
        this.titular = titular;
        this.capital = capital;
        this.duracion = duracion;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCapital() {
        return this.capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "{" +
            " titular='" + getTitular() + "'" +
            ", capital='" + getCapital() + "'" +
            ", duracion='" + getDuracion() + "'" +
            "}";
    }
}