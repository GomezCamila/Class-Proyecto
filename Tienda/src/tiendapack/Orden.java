package tiendapack;


import java.util.ArrayList;

public class Orden {
	public String nombre="";
	private double total=0;
	private boolean listo;
	private ArrayList<Item> items = new ArrayList<Item>();
	


//constructor
 
public Orden(String nombre, double total, boolean listo,ArrayList<Item>items) {
	this.nombre = "No existe";
    this.items = new ArrayList<Item>();
	
}

//cons con sobrecarga

public Orden (String nombre){
     this.nombre = nombre;
    
     
}
//Metodos propios

public void agregarItem(Item item){
     this.items.add(item);
     }
     
public void desplejarInfo() {
	System.out.println("Nombre del consumidor"+  this.nombre);
	for(Item item: this.items) {
		System.out.println(item.getNombre() + "" + getTotalOrden());
		
	}
	System.out.println("compra total: " + getTotalOrden());
	
}

   public double getTotalOrden() {
	 double total = 0;
	 for(Item item : this.items) {
		total += item.getPrecio();
		
	}
	return total;
}

public String getStatusOrden() {
	if(this.listo) {
		return "Esta listo tu pedido";
				
	}
	return "Le agradecemos la compra";
}

//getters y setter

    public String getNombre() {
	return nombre;
	
}
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public double getTotal() {
    	return total;
    }
    
    public void setTotal(double total) {
    	this.total = total;
    }

    public boolean isListo() {
    	return listo;
    }
    public void setListo(boolean listo) {
    	this.listo = listo;
    	
    }
    
    public ArrayList<Item> getItem(){
    	return items;
    	
    }
    
    public void setItems(ArrayList<Item>items) {
    	this.items = items;
    }
    
    }