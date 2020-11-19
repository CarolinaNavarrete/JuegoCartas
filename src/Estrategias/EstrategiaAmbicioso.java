package Estrategias;

import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class EstrategiaAmbicioso implements Estrategia{

	public Atributo elegirAtributo(Carta carta) {
		Atributo atributoMejor = carta.getAtributoMaxValor();
		return atributoMejor;
	}

}
