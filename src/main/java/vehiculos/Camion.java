package vehiculos;

public class Camion extends Vehiculo{
	
	private static int cantidadCreados=0;
	private int ejes;
	
	public Camion(String placa, int puertas, int velocidad, String nombre, int precio, int peso, String traccion, Fabricante fabri, int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabri);
		this.ejes= ejes;
		Camion.cantidadCreados+=1;
	}
	
	
	public void setEjes(int ejes) {
		this.ejes= ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public static int getCantidadCreados() {
		return Camion.cantidadCreados;
	}
}
