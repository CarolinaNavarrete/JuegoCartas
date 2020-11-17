package Estrategias;

import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class EstrategiaAmbicioso implements Estrategia{

	@Override
	public Atributo elegirAtributo(Carta carta) {
		Atributo atributoMejor = new Atributo(null,0);
		for(Atributo atributoIndex:carta.getAtributosCarta())
			if(atributoIndex.getValor()>atributoMejor.getValor())
				atributoMejor=atributoIndex;
		
		return atributoMejor;
	}

}
