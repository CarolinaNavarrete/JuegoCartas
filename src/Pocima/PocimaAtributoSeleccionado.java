package Pocima;
import JuegoCartas.Atributo;
import JuegoCartas.Carta;

public class PocimaAtributoSeleccionado extends Pocima {
	
	private double porcentaje;
	private String nombreAtributo;

	public PocimaAtributoSeleccionado(String nombre,String nombreAtributo,double porcentaje) {
		super(nombre);
		this.nombreAtributo =nombreAtributo;
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double aplicar(Atributo atributo) {
		int valorPorcentaje=100;
		if(atributo.getNombre().equals(nombreAtributo)){
			double valor = atributo.getValor();
			double incremento = (valor * this.porcentaje) / valorPorcentaje;
            return valor + incremento;
		}

		return atributo.getValor();
	}
	
	

}
