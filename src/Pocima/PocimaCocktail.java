package Pocima;

import java.util.ArrayList;

import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class PocimaCocktail extends Pocima {
	private ArrayList<Pocima> pocimas;
	
	public PocimaCocktail(String nombre){
		super(nombre);
		this.pocimas = new ArrayList<Pocima>();
	}
	
	public void addPocima(Pocima p) {
		pocimas.add(p);
	}
	
	public ArrayList<Pocima> getPocima(){
		ArrayList<Pocima> poc = new ArrayList<Pocima>();
		for(Pocima copiaPocima : pocimas) {
			poc.add(copiaPocima);
		}
		return poc;
	}

	@Override
	public double aplicar(Atributo atributo) {
		Atributo atributoCopia = new Atributo(atributo.getNombre(), atributo.getValor());        double pocimaAplicada = 0.0;
        for (Pocima p : pocimas) {
            pocimaAplicada = p.aplicar(atributo);
            atributoCopia.setValor(pocimaAplicada);
        }
        return atributoCopia.getValor();
    }
	

}
