package vehiculos;

public class Vehiculo {
	
	protected static int cantidadVehiculos=0;
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	
	
	public Vehiculo(String placa, int puertas, int velocidad, String nombre, int precio, int peso, String traccion, Fabricante fabri) {
		
		this.placa=placa;
		this.puertas= puertas;
		this.velocidadMaxima= velocidad;
		this.nombre= nombre;
		this.precio= precio;
		this.peso= peso;
		this.traccion= traccion;
		this.fabricante= fabri;
	}
	

}
S