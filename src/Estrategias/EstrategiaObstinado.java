package Estrategias;

import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class EstrategiaObstinado implements Estrategia {
	
	
	@Override
	public Atributo elegirAtributo(Carta carta) {
		Atributo retornoAtri = carta.getAtributoObstinado();
		return retornoAtri;
	
	}

}
