package vehiculos;

public class Automovil extends Vehiculo {
	
	private static int cantidadCreados=0;
	
	private int puestos;
	
	public Automovil(String placa,String nombre, int precio, int peso, Fabricante fabri, int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD", fabri);
		this.puestos = puestos;
		Automovil.cantidadCreados+=1;
		
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	
	public static int getCantidadCreados() {
		return Automovil.cantidadCreados;
	}
}
