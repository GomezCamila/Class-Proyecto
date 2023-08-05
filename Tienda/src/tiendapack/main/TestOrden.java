package tiendapack.main;

import tiendapack.Item;

import tiendapack.Orden;

import java.util.Scanner;

public class TestOrden {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
     
		System.out.println(" Proyecto Tienda");
      
      //productos
      Item producto1 = new Item();
      producto1.nombre = "Vaso de barbie ";
      producto1.setPrecio (5.6);
      
      
    
     Item producto2 = new Item("Jugo ", 1.5);
      
      
      
     Item producto3 = new Item("caja de caramelos ", 5.0);
     
     Item producto4 = new Item("Cepillo de princesa", 20.0);
     
     
     /*Scanner scan = new Scanner (System.in);
     System.out.println("Lista del almacen");
     System.out.println("1.Vaso Barbie\n2. Jugo\n3.Caja de caramelos\n4.Cepillo de princesa");
     System.out.println("Elige el producto deseado:");
      
     int opcion = scan.nextInt();
     
     
     switch(opcion) {
     case 1: System.out.println("Añadido al carrito cuesta $"+producto1.getPrecio());
     break;
     case 2: System.out.println("Añadido al carrito cuesta $"+ producto2.getPrecio());
     break;
     case 3: System.out.println("Añadido al carrito cuesta $" + producto3.getPrecio());
     break;
     case 4: System.out.println("Añadido al carrito cuesta $"+ producto4.getPrecio());
     break;
     
     }
     
     System.out.println("1. Finalizar compra\n2. Seguir comprando");
     
     int opcional =scan.nextInt();
     
     switch(opcion) {
     case 1: System.out.println("Compra finalizada, por favor ponga sus datos.");
     break;
     case 2: System.out.println("Elegir otro articulo.");{
    	 System.out.println("1.Vaso Barbie\n2. Jugo\n3.Caja de caramelos\n4.Cepillo de princesa");
     }
     break;
     }
     
     int opcion1 = scan.nextInt();
     
   //  System.out.println("1.Vaso Barbie\n2. Jugo\n3.Caja de caramelos\n4.Cepillo de princesa");
     
     
     switch(opcion) {
     case 1: System.out.println("Añadido al carrito cuesta $"+producto1.getPrecio());
     break;
     case 2: System.out.println("Añadido al carrito cuesta $"+ producto2.getPrecio());
     break;
     case 3: System.out.println("Añadido al carrito cuesta $" + producto3.getPrecio());
     break;
     case 4: System.out.println("Añadido al carrito cuesta $"+ producto4.getPrecio());
     break;
     
     }
     int sca = scan.nextInt();
     
     //intento de algo	
     int i, num, sum =0, item=0;
     
     System.out.println("Suma los productos");
     for(i=0; i < 100 ; i++ )
    	 
     {
    	 num = scan.nextInt();
         sum= sum + num;
     
     
     System.out.println("agregado al la compra $"+ sum );
 
     switch(sca) {
     case 1: System.out.println("Añadido al carrito cuesta $"+producto1.getPrecio());
     break;
     case 2: System.out.println("Añadido al carrito cuesta $"+ producto2.getPrecio());
     break;
     case 3: System.out.println("Añadido al carrito cuesta $" + producto3.getPrecio());
     break;
     case 4: System.out.println("Añadido al carrito cuesta $"+ producto4.getPrecio());
     break;*/
     
      //System.out.println("Producto: "+producto1.getNombre() + "Precio: $ "+producto1.getPrecio());
    
      
      //ordenes de productos (tipos)
       Orden orden1 = new Orden(null);
       orden1.setNombre(" Mabel ");
      
      
       
       //Aplicar orden1 al producto1
      orden1.agregarItem(producto1);
      System.out.println(orden1.getTotal());
      orden1.desplejarInfo();
      String mensajeOrden = orden1.getStatusOrden();
      System.out.println(mensajeOrden);
      orden1.setListo( true );
      System.out.println(orden1.getStatusOrden());
       
       
     
       
       
       
       
       
     //  orden1.items.add(producto1);
      // orden1.total = orden1.total + producto1.getPrecio();
       orden1.setTotal(producto1.getPrecio());
      // orden1.listo = true;
       
       //test informacion de productos y orden de productos
       
    //  System.out.printf("Nombre: %s", orden1.nombre);
     // System.out.printf("Total: %s", orden1.total);
     // System.out.printf("Listo: %s", orden1.listo);
      // System.out.println(producto1.nombre);
	}

}
