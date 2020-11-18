package Pocima;
import juegoCartas.Atributo;
import juegoCartas.Carta;

public class PocimaFortalecedor extends Pocima {
	private double porcentaje;

	public PocimaFortalecedor(String nombre,double porcentaje) {
		super(nombre);
		this.porcentaje = porcentaje;
	}
	
	
	@Override
	public double aplicar(Atributo atributo) {
		 double valor = atributo.getValor();
	     double incremento = (valor * this.porcentaje) / 100;
	     return valor + incremento;
		
	}
	

}
