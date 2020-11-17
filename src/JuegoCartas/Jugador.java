package JuegoCartas;
import Estrategias.*;
import Pocima.*;

import java.util.ArrayList;
public class Jugador implements Estrategia {

		private String nombre;
		private ArrayList<Carta> cartas;
		private Estrategia estrategias;
		
		//Constructor
		public Jugador(String nombre,Estrategia estrategia){
			this.nombre = nombre; 
			this.estrategias = estrategia;
			cartas = new ArrayList<Carta>();
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
		

		//Metodos get, add, remove de cartas
		public ArrayList<Carta> getCartas() {
			ArrayList<Carta> mazoJugador= new ArrayList<Carta>();
			for (Carta mj : cartas) {
				mazoJugador.add(mj);
			}
			return mazoJugador;
		}
		
		
		public int getCantCartas(){
			return cartas.size();
		}
		
		//Metodos para el juego
		public void recibirCarta(Carta c1){
			cartas.add(c1);
		}
		
		public Carta tomarCarta(){
			//Toma una carta y me la saca de mi mazo
			return cartas.remove(0);
		}
		
		public boolean tieneCartas(){
			/*El isEmpty si esta vacio me devuelve true, por eso lo niego para que me de false si esta vacio.*/
			return !cartas.isEmpty();
		}
		
		public String seleccionarAtributo(){
			if(this.tieneCartas()){
				Carta c = cartas.get(0);
				// HACER ESTRATEGIA
			}
			return cartas.get(0).getAtributoAleatorio();
		}
		
		public void addPocimaAcarta(Pocima pocima) {
			int i=(int) Math.floor(Math.random()* cartas.size());
			Carta cartaAux =cartas.get(i);
			cartaAux.setPocima(pocima);
		}

		@Override
		public Atributo elegirAtributo(Carta carta) {
			
			return estrategias.elegirAtributo(carta);
		}
		
		
		
		
}
