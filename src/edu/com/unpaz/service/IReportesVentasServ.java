package edu.com.unpaz.service;

import java.util.List;
import java.util.Map;

import edu.com.unpaz.model.Venta;

public interface IReportesVentasServ {
	int totalVentas();
	double totalRecaudado();
	Map<String, Double> recaudadoPorMedio();
	List<Venta> buscarVentasCliente(String cliente);
}
