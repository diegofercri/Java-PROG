package entidades;

import java.sql.Date;

public class Inmueble {

	private int referencia;
	private Date fechaAlta;
	private String tipo;
	private String provincia;
	private int superficie;
	private float precio;
	
	public Inmueble(int referencia, Date fechaAlta, String tipo, String provincia, int superficie, float precio) {
		super();
		this.referencia = referencia;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.provincia = provincia;
		this.superficie = superficie;
		this.precio = precio;
	}
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Inmueble [referencia=" + referencia + ", fechaAlta=" + fechaAlta + ", tipo=" + tipo + ", provincia="
				+ provincia + ", superficie=" + superficie + ", precio=" + precio + "]";
	}
	
	
}
