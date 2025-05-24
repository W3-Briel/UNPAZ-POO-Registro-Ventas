package edu.com.unpaz.repo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import edu.com.unpaz.model.Venta;

public class LeerDataRepo implements ILeerData{
	private Path path = Paths.get("C:\\Users\\Angel\\OneDrive\\Desktop\\data.txt");
	
	public List<Venta> getData(){
		List<Venta> ventas = new ArrayList<Venta>();
		
		try {
			Files.lines(this.path)
				.map(line -> {
				String[] separados = line.split(",");
				
				if (separados.length != 4) throw new Error("sucedio un error al parsear los datos");
				
				Venta tmp = new Venta(
									Integer.parseInt(separados[0]),
									separados[1],
									Double.parseDouble(separados[2]),
									separados[3].strip());
				return tmp;
				})
				.forEach(line -> ventas.add((Venta) line));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return ventas;
	}
}
