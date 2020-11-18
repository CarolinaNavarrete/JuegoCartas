package JuegoCartas;
import Estrategias.*;
import Pocima.*;

public class Jugador implements Estrategia {

		private String nombre;
	//	private ArrayList<Carta> cartas;
		private Mazo cartasJugador;
		private Estrategia estrategias;
		
		//Constructor
		public Jugador(String nombre){
			this.nombre = nombre;
			cartasJugador = new Mazo();
			estrategias = new Estrategia();
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
		
		
		public int getCantCartas(){
			return cartas.size();
		}
		
		public Mazo getCartasJugador() {
			return cartasJugador;
		}

		public void setCartasJugador(Mazo cartasJugador) {
			this.cartasJugador = cartasJugador;
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
		
		//public String seleccionarAtributo(){
		//	if(this.tieneCartas()){
		//		Carta c = cartas.get(0);
	//			// HACER ESTRATEGIA
		//	}
	//		return cartas.get(0).getAtributoAleatorio();
	//	}
		
		 public String seleccionarAtributo() {
		        if (this.cartasJugador.tieneCartasDisponibles()) {
		            Carta c = cartasJugador.getCartaJugable();
		            Atributo atributoSeleccionado = estrategias.elegirAtributo(c);
		            if (atributoSeleccionado != null) {
		                return atributoSeleccionado.getNombre();
		            }
		        }
		        return null;
		    }
		// PREGUNTAR
		/*public void addPocimaAcarta(Pocima pocima) {
			int i=(int) Math.floor(Math.random()* cartas.size());
			Carta cartaAux =cartas.get(i);
			cartaAux.setPocima(pocima);
		}
*/
		@Override
		public Atributo elegirAtributo(Carta carta) {
			
			return estrategias.elegirAtributo(carta);
		}
		
		
		
		
}
