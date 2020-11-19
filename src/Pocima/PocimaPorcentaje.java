package Pocima;
import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class PocimaPorcentaje extends Pocima {
	private double porcentaje;

	public PocimaPorcentaje(String nombre,double porcentaje) {
		super(nombre);
		this.porcentaje = porcentaje;
	}
	
	
	@Override
	public double aplicar(Atributo atributo) {
		 double valor = atributo.getValor();
	     return valor += valor * this.getPorcentaje() / 100;
	     
		
	}
	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}



	

}
