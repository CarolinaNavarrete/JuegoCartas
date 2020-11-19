package JuegoCartas;
import Pocima.*;
import Estrategias.*;


	

		public class Main {
			public static void main(String[] args) {
				Mazo m1 = new Mazo();
				
				
				Atributo a1 = new Atributo("Fuerza", 800);
				Atributo a2 = new Atributo("Velocidad", 1200);
				Atributo a3 = new Atributo("Peleas ganadas", 100);
				Atributo a4 = new Atributo("Resistencia", 500);
				Atributo a5 = new Atributo("Fuerza", 600);
				Atributo a6 = new Atributo("Velocidad", 1400);
				Atributo a7 = new Atributo("Peleas ganadas", 600);
				Atributo a8 = new Atributo("Resistencia", 1400);
				Atributo a9 = new Atributo("Peleas ganadas", 300);
				Atributo a10 = new Atributo("Resistencia", 1400);
				
				Carta c1 = new Carta("superman");
				Carta c2 = new Carta("hombre araña");
				Carta c3 = new Carta("hulk");
				Carta c4 = new Carta("iron man");
				Carta c5 = new Carta("thor");
				
				c1.addAtributo(a1);
				c1.addAtributo(a2);
				c1.addAtributo(a3);
				c1.addAtributo(a4);
				c2.addAtributo(a5);
				c2.addAtributo(a6);
				c2.addAtributo(a7);
				c2.addAtributo(a8);
				
				c3.addAtributo(a1);
				c3.addAtributo(a6);
				c3.addAtributo(a3);
				c3.addAtributo(a8);
				c4.addAtributo(a5);
				c4.addAtributo(a2);
				c4.addAtributo(a7);
				c4.addAtributo(a4);
				c5.addAtributo(a2);
				c5.addAtributo(a6);
				c5.addAtributo(a9);
				c5.addAtributo(a10);
				
				m1.agregarCarta(c1);
				m1.agregarCarta(c2);
				m1.agregarCarta(c3);
				m1.agregarCarta(c4);
				m1.agregarCarta(c5);
				
				
				Jugador j1 = new Jugador("Carolina");
				Jugador j2 = new Jugador("Ayelén");
				Juego j = new Juego(j1, j2, m1, 2,true);
				
				EstrategiaTimbero timbero = new EstrategiaTimbero();
				EstrategiaAmbicioso ambicioso = new EstrategiaAmbicioso();
				EstrategiaObstinado obstinado = new EstrategiaObstinado();
			
				PocimaPorcentaje fortalecedora = new PocimaPorcentaje("fortalecedora",30);
				PocimaPorcentaje fortalecedora2 = new PocimaPorcentaje("fortalecedora",20);
				PocimaPorcentaje fortalecedoraPlus = new PocimaPorcentaje("fortalecedoraPLUS",50);
				PocimaPorcentaje fortalecedoraPlus2 = new PocimaPorcentaje("fortalecedoraPLUS",70);
				PocimaAtributoSeleccionado PocimaSelectivaPeso = new PocimaAtributoSeleccionado("Selectiva peso","peso",35);
				PocimaAtributoSeleccionado PocimaSelectivaPeso2 = new PocimaAtributoSeleccionado("Selectiva peso","peso",45);
				PocimaAtributoSeleccionado PocimaSelectivaFuerza = new PocimaAtributoSeleccionado("Selectiva fuesza","fuerza",65);
				PocimaAtributoSeleccionado PocimaSelectivaFuerza2 = new PocimaAtributoSeleccionado("Selectiva fuesza","fuerza",35);
				PocimaValorFijo valeCuatro = new PocimaValorFijo("valeCuatro",4);
				PocimaValorFijo valeCuatro2 = new PocimaValorFijo("valeCuatro",5);
				PocimaValorFijo numeroMagico = new PocimaValorFijo("numeroMagico",23);
				PocimaValorFijo numeroMagico2 = new PocimaValorFijo("numeroMagico",26);
				
				PocimaCocktail cocktail = new PocimaCocktail("cocktail");
				cocktail.addPocima(PocimaSelectivaFuerza);
				cocktail.addPocima(PocimaSelectivaPeso);
				PocimaPorcentaje kriptonita = new PocimaPorcentaje("Kriptonita",25);
				PocimaPorcentaje kriptonita2 = new PocimaPorcentaje("Kriptonita",-35);
				
				j.addPocima(fortalecedora);
				j.addPocima(fortalecedora2);
				j.addPocima(fortalecedoraPlus2);
				j.addPocima(fortalecedoraPlus);
				j.addPocima(PocimaSelectivaPeso);
				j.addPocima(PocimaSelectivaPeso2);
				j.addPocima(PocimaSelectivaFuerza);
				j.addPocima(PocimaSelectivaFuerza2);
				j.addPocima(valeCuatro);
				j.addPocima(valeCuatro2);
				j.addPocima(numeroMagico);
				j.addPocima(numeroMagico2);
				j.addPocima(cocktail);
				j.addPocima(kriptonita);
				j.addPocima(kriptonita2);
				
				j1.setEstrategia(timbero);
				j2.setEstrategia(obstinado);
				j.jugar();
				
				
			}	

	}


