package tiendapack;

public class Item {
	  //Variables de mienbros
		public String nombre;
		private double precio;
		
		//constructor
		public Item(){};
		//costructor sobre cargado
		public Item(String nombre, double precio){
			this.nombre = nombre;
			this.precio = precio;
			
		};
		 //Getters y Setter
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public double getPrecio() {
			return precio;
			
		}
		public void setPrecio(double precio) {
			this.precio = precio;
			
			
		}
}
