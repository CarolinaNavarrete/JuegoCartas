package JuegoCartas;

public class Atributo {
	//Varibales
		private String nombre;
		private double valor;
		
		//Constructor
		public Atributo(String nombre, double valor) {
			this.nombre = nombre;
			this.valor = valor;
		}
		
		//Metodos GET and SET de los atributos
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public double getValor() {
			return valor;
		}
		
		public void setValor(double valor) {
			this.valor = valor;
		}
		
		//Metodo para hacer una copia de mis atributos
		public Atributo copiaContenido(){
			Atributo copia= new Atributo(this.nombre, this.valor);
			return copia;
		}
		
		//Metodo que me imprime los atibutos
		@Override
		public String toString() {
			return "Atributo [nombre= " + nombre + ", valor= " + valor + "]";
		}

		/*Para que el boolean tieneAtributo me compare por nombre y verifique que no se repitan y le pongo
		 *  ".equalsIgnoreCase" para que me compare cada letra sin importar si esta en mayuscula o minuscula*/
		@Override
		public boolean equals(Object o1) {
			try {
				Atributo atributo = (Atributo) o1;
				if(nombre.equalsIgnoreCase(atributo.getNombre()))
					return true;
				else
					return false;
			}
			catch(Exception exc) {
				return false;
			}
		}
		
		//No se si va
		public boolean contains(String nombreAtributo) {
			return this.getNombre().equals(nombreAtributo);
		}
	}

