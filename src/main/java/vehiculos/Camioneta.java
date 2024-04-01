package vehiculos;

public class Camioneta extends Vehiculo {
	
	private static int cantidadVehiculosCreados=0;
	private boolean volco;
	
	public Camioneta(String placa,int puertas, String nombre, int precio, int peso, Fabricante fabri, boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4", fabri);
		this.volco= volco;
		Camioneta.cantidadVehiculosCreados+=1;
	}
	
	//MÉTODOS SETTER Y GETTER
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public boolean isVolco() {
		return volco;
	}
	
	public static int getCantidadCreados( ) {
		return Camioneta.cantidadVehiculosCreados;
	}
	
	public static void sumaCantidadVehiculos() {
		cantidadVehiculosCreados++;
	}

}
