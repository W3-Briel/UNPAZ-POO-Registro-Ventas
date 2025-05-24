package edu.com.unpaz.service;

import java.util.List;

import edu.com.unpaz.model.Venta;
import edu.com.unpaz.repo.ILeerData;

public class RegistroVentaServ implements IRegistroVentaServ{
	private ILeerData repoVentas;
	
	public RegistroVentaServ(ILeerData repo) {
		this.repoVentas = repo;
	}
	
	public List<Venta> getVentas() {
		return this.repoVentas.getData();
	}
}