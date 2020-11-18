package Pocima;
import juegoCartas.Atributo;
import juegoCartas.Carta;


public abstract class Pocima {
	private String nombre;
	
	public Pocima(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double aplicar(Atributo atributo);
	
}
