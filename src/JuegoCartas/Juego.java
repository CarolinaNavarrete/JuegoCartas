package JuegoCartas;

public class Juego {
	//Atributos
		private Jugador j1;
		private Jugador j2;
		private Mazo cartas;
		private int maxRondas;
 
		
		
		/*Constructor (hago que el constructor de la clase me genere un juego con
		 * dos jugadores y un tipo determinado de mazo*/ 
		public Juego(Jugador j1, Jugador j2, Mazo cartas, int maxRondas){
			this.j1 = j1;
			this.j2 = j2;
			this.cartas = cartas;
			this.maxRondas = maxRondas;
		}
		
		//Metodos set && get
		public int getMaxRondas() {
			return maxRondas;
		}

		public void setMaxRondas(int maxRondas) {
			this.maxRondas = maxRondas;
		}

		//Metodos de la clase
		public void jugar(){
			int rondasJugadas=1;
			Carta c1;
			Carta c2;
			double puntaje1;
			double puntaje2;
			boolean ganoJ1=true;
			String nombreAtributo;
			
			//Reparto el mazo entre los jugadores
			System.out.println("QUE COMIENCE EL JUEGO");
			cartas.repartirMazo(j1, j2);
			while(maxRondas>=rondasJugadas && j1.tieneCartas() && j2.tieneCartas()){
				//Arranca el jug 1 tomando una carta
				System.out.println("------- Ronda " + rondasJugadas + " -------");
				if(ganoJ1){
					nombreAtributo= j1.seleccionarAtributo();
				}else{
					nombreAtributo= j2.seleccionarAtributo();
				}
				c1= j1.tomarCarta();
				puntaje1= c1.getValorAtributo(nombreAtributo);
				System.out.println("La carta de " + j1.getNombre() + " es " + c1.getNombre() + " con "+ nombreAtributo + 
						" " +puntaje1);
				c2= j2.tomarCarta();
				puntaje2= c2.getValorAtributo(nombreAtributo);
				System.out.println("La carta de " + j2.getNombre() + " es " + c2.getNombre() + " con "+ nombreAtributo + 
						" " +puntaje2);
				
				//compara los valores del atributo (mayor se lleva 2 cartas y arranca la ronda)	
				if(puntaje1>puntaje2){
					j1.recibirCarta(c1);
					j1.recibirCarta(c2);
					ganoJ1=true;
					System.out.println("GANO J1");
				}else if(puntaje1<puntaje2){
					j2.recibirCarta(c1);
					j2.recibirCarta(c2);
					ganoJ1=false;
					System.out.println("GANO J2");
				}else{
					j1.recibirCarta(c1);
					j2.recibirCarta(c1);
					System.out.println("EMPATARON");
				}
				rondasJugadas++;
				System.out.println(j1.getNombre()+ " posee ahora " + j1.getCantCartas() + " cartas y " + j2.getNombre()+ " posee ahora " + j2.getCantCartas() + " cartas");
			}
		}

}
