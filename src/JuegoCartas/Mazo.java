package JuegoCartas;

	import java.util.ArrayList;
	import java.util.Collections;

	public class Mazo {
		//Variable
		private String nombreMazo;
		private int cantidadCartasMax;
		private ArrayList <Carta> mazo;

		//Constructor
		public Mazo(String nombreMazo, int cantidadCartasMax){
			this.nombreMazo= nombreMazo;
			this.cantidadCartasMax= cantidadCartasMax;
			mazo = new ArrayList<Carta>();
		}
		
		//Metodos Get and Set para obtener y setear la cantidad max de cartas
		public int getCantidadCartasMax() {
			return cantidadCartasMax;
		}

		public String getNombreMazo() {
			return nombreMazo;
		}

		public void setNombreMazo(String nombreMazo) {
			this.nombreMazo = nombreMazo;
		}

		public void setCantidadCartasMax(int cantidadCartasMax) {
			this.cantidadCartasMax = cantidadCartasMax;
		}

		//Cuando creamos el mazo le ponemos el tope de "cantidadCartasMax" para que se sumen
		//al mazo y controlamos que la carta corresponda al mazo
		public void agregarCarta(Carta c){
			if(mazo.size()<cantidadCartasMax){
				if(mazo.isEmpty())
					mazo.add(c);
				else{
					if(mazo.get(0).verificarAtributos(c))
						mazo.add(c);
				}			
			}else{
				System.out.println("La carta ingresada no corresponde al mazo o el " +
						"mazo esta lleno");
			}
		}
		
		//Funcionalidades
		/*Mezcla el mazo de manera aleatoria*/
		private void mezclarMazo() {
			Collections.shuffle(mazo);
		}
		
		/*Reparte el mazo en partes iguales, si el numero es impar el j1 tiene una carta 
		 * extra*/
		public void repartirMazo(Jugador j1, Jugador j2){
			mezclarMazo();
			for(int i=mazo.size()-1; i>=0;i--){
				if (i%2==0){
					j1.recibirCarta(mazo.remove(i));
				}else{
					j2.recibirCarta(mazo.remove(i));
				}
			}
		}
		
		//Realiza la copia del mazo
		public Mazo copiaContenido(){
			Mazo copia= new Mazo(nombreMazo, cantidadCartasMax);
			for (Carta c : mazo) {
				copia.agregarCarta(c.copiaContenido());
			}
			return copia;
		}
}
