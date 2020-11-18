package Pocima;
import juegoCartas.Atributo;
import juegoCartas.Carta;

public class PocimaAtributoSeleccionado extends Pocima {
	
	private double porcentaje;
	private String nombreAtributo;

	public PocimaAtributoSeleccionado(String nombre,String nombreAtributo,double porcentaje) {
		super(nombre);
		this.nombreAtributo =nombreAtributo;
		this.porcentaje = porcentaje;
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}


	public String getNombreAtributo() {
		return nombreAtributo;
	}


	public void setNombreAtributo(String nombreAtributo) {
		this.nombreAtributo = nombreAtributo;
	}


	@Override
	public double aplicar(Atributo atributo) {
		int valorPorcentaje=100;
		if(atributo.getNombre().equals(this.getNombreAtributo())){
			double valorAtributo = atributo.getValor();
			return valorAtributo += valorAtributo * this.getPorcentaje() / valorPorcentaje;
		}
		else
			return atributo.getValor();
	}
	
	

}
