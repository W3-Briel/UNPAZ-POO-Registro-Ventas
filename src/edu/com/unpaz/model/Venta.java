package edu.com.unpaz.model;

public class Venta {
	private int nroVenta;
	private String cliente;
	private double importe;
	private String medioDePago;
	
	public Venta(int nroVenta,String cliente,double importe,	String medioDePago) {
		this.nroVenta = nroVenta;
		this.cliente = cliente;
		this.importe = importe;
		this.medioDePago = medioDePago;
	}
	
	public int getNroVenta() {
		return nroVenta;
	}
	public void setNroVenta(int nroVenta) {
		this.nroVenta = nroVenta;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	public String toString() {
		return String.format("nroVenta: %s, importe: %s, medioPago: %s",
								this.nroVenta,this.importe,this.medioDePago);
	}
}
