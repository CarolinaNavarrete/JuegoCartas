package JuegoCartas;
import Estrategias.*;
import Pocima.*;

public class Jugador implements Estrategia {

		private String nombre;
		private Mazo cartasJugador;
		private Estrategia estrategias;
		
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
		

		//Metodos get, remove de cartas
		public Mazo getCartasJugador() {
			return cartasJugador;
		}

		public void setCartasJugador(Mazo cartasJugador) {
			this.cartasJugador = cartasJugador;
		}

		//Metodos para el juego
		public void recibirCarta(Carta c1){
			cartasJugador.agregarCarta(c1);
		}
		
		public Carta tomarCarta(){
			//Toma una carta y me la saca de mi mazo
			return cartasJugador.remove();
		}
		
		public boolean tieneCartas(){
			return cartasJugador.tieneCarta();
		}
		
		
		//VOLVER A PREGUNTAR
		public String seleccionarAtributo(){
			Carta carta = cartasJugador.primerCarta();
			Atributo atributoSeleccionado = this.elegirAtributo(carta);
			String nombreAtributo = atributoSeleccionado.getNombre();
			return nombreAtributo;
		}
		
		public Atributo elegirAtributo(Carta carta) {
			return estrategias.elegirAtributo(carta);
		}

		public void addPocimaAcarta(Pocima pocima) {
			cartasJugador.addPocimaAcarta(pocima);
		}
		
		
		
		
		
}
