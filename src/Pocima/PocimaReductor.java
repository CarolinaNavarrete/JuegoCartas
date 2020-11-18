package Pocima;

import juegoCartas.Atributo;
import juegoCartas.Carta;


public class PocimaReductor extends Pocima {
	private double porcentaje;
	
	public PocimaReductor (String nombre, double porcentaje) {
		super(nombre);
		this.porcentaje = porcentaje;
	}
	
	
	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}


	@Override
	public double aplicar(Atributo atributo){
		double valorAtributo = atributo.getValor();
		return valorAtributo -= valorAtributo * this.getPorcentaje() / 100;
	}
}
