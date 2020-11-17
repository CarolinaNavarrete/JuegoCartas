package Estrategias;

import java.util.ArrayList;

import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class EstrategiaTimbero implements Estrategia {

	@Override
	public Atributo elegirAtributo(Carta carta) {

		ArrayList<Atributo> atributos = carta.getAtributosCarta();
		int i = (int) Math.floor(Math.random() * atributos.size());
		return atributos.get(i);
	}
}
