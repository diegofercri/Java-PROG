package entidades;

import java.sql.Date;

public class Venta {

	private int referencia;
	private Date fechaVenta;
	private String vendedor;
	
	public Venta(int referencia, Date fechaVenta, String vendedor) {
		super();
		this.referencia = referencia;
		this.fechaVenta = fechaVenta;
		this.vendedor = vendedor;
	}
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	@Override
	public String toString() {
		return "Venta [referencia=" + referencia + ", fechaVenta=" + fechaVenta + ", vendedor=" + vendedor + "]";
	}
	
	
}
