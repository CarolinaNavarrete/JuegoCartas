package Estrategias;

import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class EstrategiaTimbero implements Estrategia {

	public Atributo elegirAtributo(Carta carta) {
		Atributo atributoRandom = carta.getAtributoRandom();
		return atributoRandom;
	}

	
}
