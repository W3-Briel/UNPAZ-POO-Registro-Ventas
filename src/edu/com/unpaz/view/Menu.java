package edu.com.unpaz.view;

import java.util.Scanner;

import edu.com.unpaz.controller.IReportesController;

public class Menu {
	
	private IReportesController reportes;
	public Menu (IReportesController repVentasContr){
		this.reportes = repVentasContr;
	}
	
	public void consola() {
		Scanner sc = new Scanner(System.in);
		
		boolean menu = true;
		while (menu) {
			
			System.out.println("===== GESTOR DE VENTAS =====");
			System.out.println("que deseas realizar;\n \t1 - reportar ventas de un cliente \n \t2 - observar total recudado\n \t3 - observar total de ventas");
			System.out.println("\t4 - reporte recudado por cada medio\n\nEnvie cualquier otra opcion para salir: ");
			
			char option = sc.next().charAt(0);
			
			switch(option) {
			  case '1':
				  System.out.println("ingresar el nombre del cliente, respetando mayusculas: ");
				  String cliente = sc.next();
				  reportes.buscarVentasCliente(cliente);
			    break;
			  case '2':
				  reportes.totalRecaudado();
			    break;
			  case '3':
				  reportes.totalVentas();
				break;
			  case '4':
				  reportes.recaudadoPorMedio();
				  break;
			  default:
			    menu = false;
			}

//			Thread.sleep(4000);
		}
	};
}
