package banco;

public class Variable extends Prestamo {
    double interes;
    double euribor;
    double diferencial;
    int revision;

    public Variable(String titular, double cantidad, int duracion, double euribor, double diferencial) {
        super(titular, cantidad, duracion);
        this.euribor = euribor;
        this.diferencial = diferencial;
        this.interes = this.euribor + this.diferencial;
        this.revision = 6;
    }

    public Variable(String titular, double cantidad, int duracion, double euribor) {
        super(titular, cantidad, duracion);
        this.euribor = euribor;
        this.diferencial = 0.75;
        this.interes = this.euribor + this.diferencial;
        this.revision = 6;
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

    public int getRevision() {
        return this.revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " interes='" + getInteres() + "'" +
            ", euribor='" + getEuribor() + "'" +
            ", diferencial='" + getDiferencial() + "'" +
            ", revision='" + getRevision() + "'" +
            "}";
    }
    
}
