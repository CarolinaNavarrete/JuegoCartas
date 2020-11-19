package Estrategias;
import JuegoCartas.Carta;
import JuegoCartas.Atributo;

public interface Estrategia {

	Atributo elegirAtributo(Carta carta);
}
