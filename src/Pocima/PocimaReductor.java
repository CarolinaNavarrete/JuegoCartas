package Pocima;

import JuegoCartas.Atributo;
import JuegoCartas.Carta;


public class PocimaReductor extends Pocima {
	private double porcentaje;
	
	public PocimaReductor (String nombre, double porcentaje) {
		super(nombre);
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double aplicar(Atributo atributo){
		double valor = atributo.getValor();
	     double disminucion = (valor * this.porcentaje) / 100;
	     return valor - disminucion;
	}
}
