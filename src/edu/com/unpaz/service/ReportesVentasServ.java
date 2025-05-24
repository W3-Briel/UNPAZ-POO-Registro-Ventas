package edu.com.unpaz.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.com.unpaz.model.Venta;

public class ReportesVentasServ implements IReportesVentasServ{
	private IRegistroVentaServ regVentas;
	
	public ReportesVentasServ(IRegistroVentaServ regVentas) {
		this.regVentas = regVentas;
	}
	
	public List<Venta> buscarVentasCliente(String cliente) {
		return regVentas.getVentas()
						.stream()
						.filter(v -> v.getCliente().equals(cliente))
						.toList();
	}
	
	public double totalRecaudado() {
		return this.regVentas.getVentas()
							.stream()
							.mapToDouble(v -> v.getImporte())
							.sum();
	};

	public Map<String, Double> recaudadoPorMedio(){
		Map<String,Double> medioRecaudado = new HashMap<String,Double>();
		
		this.regVentas.getVentas()
					.stream()
					.forEach(v -> {
						String medio = v.getMedioDePago();
						
						if (medioRecaudado.containsKey(medio)) {
							Double current = medioRecaudado.get(medio);
							medioRecaudado.put(medio, current + v.getImporte());
						} else {
							medioRecaudado.put(medio, v.getImporte());
						}
					});
		
		return medioRecaudado;
	}
	
	public int totalVentas() {
		return this.regVentas.getVentas().size();
	}
}