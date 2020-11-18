package Estrategias;

import juegoCartas.Atributo;
import juegoCartas.Carta;

public class EstrategiaObstinado implements Estrategia {
	private String cabala;
	
	
	public EstrategiaObstinado(String cabala) {
		this.cabala= cabala;
	}
	
	public Atributo elegirAtributo(Carta carta) {
		for(Atributo atributoIndex : carta.getAtributosCarta()) {
			if(atributoIndex.getNombre().equals(cabala))
				return atributoIndex;
		}
		return null;
	
	}

}
