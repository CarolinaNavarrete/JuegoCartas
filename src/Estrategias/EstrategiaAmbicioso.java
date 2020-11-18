package Estrategias;

import juegoCartas.Atributo;
import juegoCartas.Carta;

public class EstrategiaAmbicioso implements Estrategia{

	public Atributo elegirAtributo(Carta carta) {
		Atributo atributoMejor = carta.getAtributoMaxValor();
		return atributoMejor;
	}

}
