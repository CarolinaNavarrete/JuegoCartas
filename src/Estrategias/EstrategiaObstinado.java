package Estrategias;

import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class EstrategiaObstinado implements Estrategia {
	private String cabala;
	
	
	public EstrategiaObstinado(String cabala) {
		this.cabala= cabala;
	}
	
	@Override
	public Atributo elegirAtributo(Carta carta) {
		for(Atributo atributoIndex : carta.getAtributosCarta()) {
			if(atributoIndex.getNombre().equals(cabala))
				return atributoIndex;
		}
		return null;
	
	}

}
