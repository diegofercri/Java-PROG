package banco;

public class Variable extends Prestamo {
    protected double interes;
    protected double euribor;
    protected double diferencial;
    protected double revision;
    protected double cuota;

    public Variable(String titular, double cantidad, double duracion, double euribor, double diferencial) {
        super(titular, cantidad, duracion);
        this.euribor = euribor;
        this.diferencial = diferencial;
        this.interes = this.euribor + this.diferencial;
        this.revision = 6;
        this.cuota = cuota();
    }

    public Variable(String titular, double cantidad, double duracion, double euribor) {
        super(titular, cantidad, duracion);
        this.euribor = euribor;
        this.diferencial = 0.075;
        this.interes = this.euribor + this.diferencial;
        this.revision = 6;
        this.cuota = cuota();
    }

    public double getInteres() {
        return this.interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getEuribor() {
        return this.euribor;
    }

    public void setEuribor(double euribor) {
        this.euribor = euribor;
    }

    public double getDiferencial() {
        return this.diferencial;
    }

    public void setDiferencial(double diferencial) {
        this.diferencial = diferencial;
    }

    public double getRevision() {
        return this.revision;
    }

    public void setRevision(double revision) {
        this.revision = revision;
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
            ", euribor='" + getEuribor() + "'" +
            ", diferencial='" + getDiferencial() + "'" +
            ", revision='" + getRevision() + "'" +
            ", cuota='" + getCuota() + "'" +
            "}";
    }
}
