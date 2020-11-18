package Estrategias;

import juegoCartas.Atributo;
import juegoCartas.Carta;

public class EstrategiaTimbero implements Estrategia {

	public Atributo elegirAtributo(Carta carta) {
		Atributo atributoRandom = carta.getAtributoRandom();
		return atributoRandom;
	}

	
}
