package Pocima;
import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class PocimaValorFijo extends Pocima {
	private int valor;
	
	public PocimaValorFijo(String nombre, int valor) {
		super(nombre);
		this.valor = valor;
	}
	

	public double aplicar(Atributo atributo) {
		return this.valor;
	}
}
