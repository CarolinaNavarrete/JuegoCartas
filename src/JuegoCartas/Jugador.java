package juegoCartas;
import Estrategias.*;
import Pocima.*;

import java.util.ArrayList;
public class Jugador implements Estrategia {

		private String nombre;
		private Estrategia estrategias;
		protected Mazo cartasJugador;
		
		//Constructor
		public Jugador(String nombre){
			this.nombre = nombre; 
			cartasJugador = new Mazo();
		}
		
		//Metodos GET and SET de los atributos
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		//Modificar estrategia
		public void setEstrategia(Estrategia estrategia) {
			this.estrategias = estrategia;
		}

		public Estrategia getEstrategias() {
			return estrategias;
		}
		

		//Metodos para el juego
		public void recibirCarta(Carta carta) {
			cartas.add(carta);
		}
		
		public Mazo tomarCarta(){
			//Toma una carta y me la saca de mi mazo
			return cartas.remove(0);
		}
		
		public boolean tieneCartas(){
			/*El isEmpty si esta vacio me devuelve true, por eso lo niego para que me de false si esta vacio.*/
			return !cartas.isEmpty();
		}
		
		public String seleccionarAtributo(){
			if(this.tieneCartas()){
				Mazo c = cartas.get(0);
			}
			return cartas.get(0).getAtributoAleatorio();
		}
		
		public void addPocimaAcarta(Pocima pocima) {
			int i=(int) Math.floor(Math.random()* cartas.size());
			Mazo cartaAux =cartas.get(i);
			cartaAux.setPocima(pocima);
		}

		public Atributo elegirAtributo(Carta carta) {
			return estrategias.elegirAtributo(carta);
		}	
}
