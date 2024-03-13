package banco;

public class CuentaCorriente {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "{" + " numeroCuenta='" + getNumeroCuenta() + "'" + ", titular='" + getTitular() + "'" + ", saldo='" + getSaldo() + "'" + "}";
    }

    public void ingreso(double cantidad) {
        this.saldo += cantidad;
    }

    public void reintegro(double cantidad) throws SaldoInsuficienteException {
        if (this.saldo < cantidad) {
			throw new SaldoInsuficienteException("No hay fondos suficientes");
        } else {
            this.saldo -= cantidad;
        }
    }
}