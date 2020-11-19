package JuegoCartas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import Pocima.Pocima;

	import java.util.ArrayList;
import java.util.Collections;

	public class Mazo {
		//Variable
		private String nombreMazo;
		private int cantidadCartasMax;
		private ArrayList <Carta> mazo;

		//Constructor
		public Mazo(){
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
		
		public int getCantidadCartas(){
			return mazo.size();
		}
		
		public Carta remove(){
			if(mazo != null)
				return mazo.remove(0);
			else
				return null;
		}
		
		public boolean tieneCarta() {
			return mazo.size()>0;
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
		public void mezclarMazo() {
			Collections.shuffle(mazo);
		}
		
		public Carta primerCarta(){
			return mazo.get(0);
		}
	
		public void addPocimaAcarta(Pocima pocima) {
			int i = (int) Math.floor(Math.random() * mazo.size());
			Carta cartaAux = mazo.get(i);
			cartaAux.setPocima(pocima);//carta tiene Pocima, no elementoPocima
		}
		
		//Realiza la copia del mazo
		public Mazo copiaContenido(){
			Mazo copia= new Mazo();
			for (Carta c : mazo) {
				copia.agregarCarta(c.copiaContenido());
			}
			return copia;
		}
		
		 public void cargarMazo(String jsonFile) {  //preguntar en qué afecta que sea o no static ésta funcion
		        //URL url = getClass().getResource(jsonFile);
		        File jsonInputFile = new File(jsonFile);
		        InputStream is;
		        //Mazo mazo = new Mazo(); 
		        try {
		            is = new FileInputStream(jsonInputFile);
		            // Creo el objeto JsonReader de Json.
		            JsonReader reader = Json.createReader(is);
		            // Obtenemos el JsonObject a partir del JsonReader.
		            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
		            for (JsonObject cartaJson : cartas.getValuesAs(JsonObject.class)) {
		                String nombreCarta = cartaJson.getString("nombre");
		                Carta unaCarta = new Carta(nombreCarta);
		                JsonObject atributos = (JsonObject) cartaJson.getJsonObject("atributos");
		                //String atributosStr = "";
		                for (String nombreAtributo:atributos.keySet()) {
		                	Atributo unAtributo = new Atributo(nombreAtributo, atributos.getInt(nombreAtributo));
		                    unaCarta.addAtributo(unAtributo);
		                	//atributosStr = atributosStr + nombreAtributo + ": " +
		                            //atributos.getInt(nombreAtributo) + "; ";
		                }
		                this.addCarta(unaCarta);
		                //System.out.println(nombreCarta+"\t\t\t"+atributosStr);
		            }
		            reader.close();
		            this.chequearMazo();
		        } catch (FileNotFoundException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		    }
}
