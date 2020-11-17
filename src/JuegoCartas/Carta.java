package JuegoCartas;

import java.util.ArrayList;
import java.util.Collections;
import Pocima.Pocima;
public class Carta {


		//Variablas
		private String nombre;
		private ArrayList<Atributo> atributosCarta;
		private Pocima pocima;
		
		//Constructor del objeto Carta
		public Carta(String nombre) {
			this.nombre = nombre;
			atributosCarta = new ArrayList<Atributo>();
			this.pocima = null;
		}
		
		//GET and SET de las variables
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public boolean tienePocima(){
			return this.pocima!=null;
		}
		
		
		public Pocima getPocima() {
			return pocima;
		}

		public void setPocima(Pocima pocima) {
			this.pocima = pocima;
		}
		

		//Metodos get, add y remove de los atributos de la carta
		//DEVUELVE EL LISTADO DE ATRIBUTOS mediante una copia
		public ArrayList<Atributo> getAtributosCarta() {
			ArrayList<Atributo> copia = new ArrayList<Atributo>();
			for (Atributo atributo : atributosCarta) {
				copia.add(atributo.copiaContenido());
			}
			return copia;
		}
		
		//Me devuelve la cantidad de atributos de la carta
		public int getCantidadAtributo(){
			return atributosCarta.size();
		}
		
		//Obtener el valor de una carta por nombre del atributo
		public double getValorAtributo(String atributo){
			for(int i=0; i<atributosCarta.size();i++){
				Atributo aux =atributosCarta.get(i);
				if(aux.getNombre().equals(atributo)){
					return aux.getValor();
				}
			}
			return -1;
		}
		
		
		//Obtener los nombres de los atributos
		public ArrayList<String> getNombresAtributo(){
			ArrayList<String> nombresAtributo = new ArrayList<String>();
			for(int i=0; i<atributosCarta.size();i++){
				nombresAtributo.add(atributosCarta.get(i).getNombre());
			}
			return nombresAtributo;
		}
		

		//Controlo que el atributo no se repita en la carta
		private boolean tieneAtributo(Atributo atributo) {
		    	if (atributo!=null)
		    	  return atributosCarta.contains(atributo);
		    	else
		    		 return false;
		    	//El contains lo de definimos en el objeto Atributo
		  }
		
		//Incorporo un atributo
		public void addAtributo(Atributo atributo){
	    	if (!this.tieneAtributo(atributo)){
	    		atributosCarta.add(atributo);
	    	}	
		}
		
		//Elimino un atributo
		public void removeAtributo(Atributo atributo){
			if(atributo!=null)
				atributosCarta.remove(atributo);
		}
		
		//Verifico que tengan los mismos Atributos
		public boolean verificarAtributos(Carta c1){
			//Verificar que la cantidad de atributos sea la misma y que sean los mismos atributos
			if(c1.getCantidadAtributo() == this.getCantidadAtributo()){
				for (Atributo aux : atributosCarta) {
					if(!c1.tieneAtributo(aux))
						return false;
				}
				return true;
			}
			else
				return false;
		}
		
		//JUEGO
		public String getAtributoAleatorio(){
			String atributoRandom;
			int numeroRandom= (int)(Math.random()*this.getCantidadAtributo());
			atributoRandom= atributosCarta.get(numeroRandom).getNombre();	
			return atributoRandom;
		}
		
		//Retorno la copia de las Cartas
		public Carta copiaContenido(){
			Carta copia= new Carta(nombre);
			for (Atributo a : atributosCarta) {
				copia.addAtributo(a.copiaContenido());
			}
			return copia;
		}
		//Metodo que me imprime el nombre y los atibutos de mi carta
		@Override
		public String toString() {
			return "La carta " + nombre + "posee los siguientes atributos: " + atributosCarta;
		}
		
		

}
