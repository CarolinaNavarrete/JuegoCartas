package Pocima;
import juegoCartas.Atributo;
import juegoCartas.Carta;

public class PocimaValorFijo extends Pocima {
	private int valor;
	
	public PocimaValorFijo(String nombre, int valor) {
		super(nombre);
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public double aplicar(Atributo atributo) {
		double valorAtributo = this.getValor();
		return valorAtributo;
	}
}
