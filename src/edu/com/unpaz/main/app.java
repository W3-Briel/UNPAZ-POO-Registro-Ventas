package edu.com.unpaz.main;

import edu.com.unpaz.controller.ReportesVentasController;
import edu.com.unpaz.repo.LeerDataRepo;
import edu.com.unpaz.service.RegistroVentaServ;
import edu.com.unpaz.service.ReportesVentasServ;
import edu.com.unpaz.view.Menu;

public class app {

	public static void main(String[] args) {
		// intentando aplicar composition root
		
		//repo
		LeerDataRepo data = new LeerDataRepo();
		
		//serv
		RegistroVentaServ registro = new RegistroVentaServ(data);
		ReportesVentasServ reportes = new ReportesVentasServ(registro);
		
		//controller
		ReportesVentasController reportesController = new ReportesVentasController(reportes);
		
		//view
		Menu menu = new Menu(reportesController);
		
		menu.consola();
	}
}
