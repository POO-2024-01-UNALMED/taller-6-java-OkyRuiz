package vehiculos;

public class Vehiculo {
    private static int cantidadVehiculos=0;
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	
	
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
