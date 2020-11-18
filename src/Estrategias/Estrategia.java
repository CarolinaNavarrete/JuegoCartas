package Estrategias;
import juegoCartas.Carta;
import juegoCartas.Atributo;

public interface Estrategia {

	Atributo elegirAtributo(Carta carta);
}
