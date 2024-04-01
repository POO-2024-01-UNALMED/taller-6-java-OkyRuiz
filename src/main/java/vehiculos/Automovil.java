package vehiculos;

public class Automovil extends Vehiculo {
	
	private static int cantidadVehiculosCreados=0;
	private int puestos;
	
	public Automovil(String placa,String nombre, int precio, int peso, Fabricante fabri, int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD", fabri);
		this.puestos = puestos;
		Automovil.cantidadVehiculosCreados+=1;
		
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	
	public static int getCantidadVehiculosCreados() {
		return Automovil.cantidadVehiculosCreados;
	}
	
	public static void sumaCantidadVehiculos() {
		cantidadVehiculosCreados++;
	}
}
