package juegoCartas;
import Pocima.*;
import Estrategias.*;


	

		public class Main {
			public static void main(String[] args) {
				Mazo m1 = new Mazo("superHeroes", 5);
				
				PocimaFortalecedor fortalecedora = new PocimaFortalecedor("fortalecedora",30);
				PocimaFortalecedor fortalecedora2 = new PocimaFortalecedor("fortalecedora",20);
				PocimaFortalecedor fortalecedoraPlus = new PocimaFortalecedor("fortalecedoraPLUS",50);
				PocimaFortalecedor fortalecedoraPlus2 = new PocimaFortalecedor("fortalecedoraPLUS",70);
				PocimaAtributoSeleccionado PocimaSelectivaPeso = new PocimaAtributoSeleccionado("Selectiva peso","peso",35);
				PocimaAtributoSeleccionado PocimaSelectivaPeso2 = new PocimaAtributoSeleccionado("Selectiva peso","peso",45);
				PocimaAtributoSeleccionado PocimaSelectivaFuerza = new PocimaAtributoSeleccionado("Selectiva fuesza","fuerza",65);
				PocimaAtributoSeleccionado PocimaSelectivaFuerza2 = new PocimaAtributoSeleccionado("Selectiva fuesza","fuerza",35);
				PocimaValorFijo valeCuatro = new PocimaValorFijo("valeCuatro",4);
				PocimaValorFijo valeCuatro2 = new PocimaValorFijo("valeCuatro",5);
				PocimaValorFijo numeroMagico = new PocimaValorFijo("numeroMagico",23);
				PocimaValorFijo numeroMagico2 = new PocimaValorFijo("numeroMagico",26);
				PocimaCocktail cocktail = new PocimaCocktail("cocktail",fortalecedora,fortalecedoraPlus);
				PocimaCocktail cocktail2 = new PocimaCocktail("cocktail",kriptonita,reductorPlomo);
				PocimaReductor kriptonita = new PocimaReductor("Kriptonita",25);
				PocimaReductor kriptonita2 = new PocimaReductor("Kriptonita",35);
				
				
				juego.addEstrategia
				
				Atributo a1 = new Atributo("Fuerza", 800);
				Atributo a2 = new Atributo("Velocidad", 1200);
				Atributo a3 = new Atributo("Peleas ganadas", 100);
				Atributo a4 = new Atributo("Resistencia", 500);
				Atributo a5 = new Atributo("Fuerza", 600);
				Atributo a6 = new Atributo("Velocidad", 1400);
				Atributo a7 = new Atributo("Peleas ganadas", 600);
				Atributo a8 = new Atributo("Resistencia", 1400);
				
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
				m1.agregarCarta(c1);
				m1.agregarCarta(c2);
				m1.agregarCarta(c3);
				m1.agregarCarta(c4);
				Jugador j1 = new Jugador("Carolina");
				Jugador j2 = new Jugador("Ayelén");
				Juego j = new Juego(j1, j2, m1, 2);
				j.jugar();
			}	

	}


