package banco;

public class Prestamo {
    String titular;
    double cantidad;
    int duracion;
    double cuota;

    public Prestamo(String titular, double cantidad, int duracion) {
        this.titular = titular;
        this.cantidad = cantidad;
        this.duracion = duracion;
        this.cuota = 
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "{" +
            " titular='" + getTitular() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", duracion='" + getDuracion() + "'" +
            "}";
    }


}
