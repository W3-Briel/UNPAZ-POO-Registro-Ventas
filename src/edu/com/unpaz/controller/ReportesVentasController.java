package edu.com.unpaz.controller;

import edu.com.unpaz.service.IReportesVentasServ;

public class ReportesVentasController  implements IReportesController{
	private IReportesVentasServ reportes;
	
	public ReportesVentasController(IReportesVentasServ reportesServ) {
		this.reportes = reportesServ;
	}
	
	public void totalVentas() {
		System.out.println("hay un total de " + reportes.totalVentas() + " ventas");
		System.out.println("");
	}
	
	public void totalRecaudado() {
		System.out.println("hay un total recaudado de: " + reportes.totalRecaudado());
		System.out.println("");
	}
	
	public void recaudadoPorMedio() {
		System.out.println("lo recudado por cada medio es:");
		System.out.println(reportes.recaudadoPorMedio());
		System.out.println("");
	}
	
	public void buscarVentasCliente(String cliente) {
		System.out.println("el cliente " + cliente + " posee las siguientes ventas: ");
		System.out.println(reportes.buscarVentasCliente(cliente));
		System.out.println();
	}
}
