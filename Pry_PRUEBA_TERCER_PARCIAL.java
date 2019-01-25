package pry_prueba_tercer_parcial;
import java.util.Scanner;
public class Pry_PRUEBA_TERCER_PARCIAL {
    public static void main(String[] args) {
Scanner teclado=new Scanner (System.in);
base_producto bd=new base_producto();
tipo t1=new tipo("QUESO","ARROZ","ZANAHORIA");
producto p1=new producto("AOO1", "ACEITE", t1, 10);

tipo t2=new tipo("LECHE","QUINUA","TOMATE");
producto p2=new producto("A002","HARINA", t2, 50);

tipo t3=new tipo("YOGURT","LENTEJA","CEBOLLA");
producto p3=new producto("A003", "GASEOSA", t3, 250);
//insertar
bd.insertarProducto(p1);
bd.insertarProducto(p2);
bd.insertarProducto(p3);
//eliminar
System.out.println("-------ELIMINAR-------");
bd.eliminarProducto(p1);
bd.imprimirProducto();
//buscar
System.out.println("-------BUSCAR-------");
bd.buscarProducto("A002");
//modificar
System.out.println("--------------------------------------");
        System.out.println("1.-MODIFCAR");
        System.out.println("2.-SALIR");
        System.out.println("ELIJA UNA OPCION:");
         int op=teclado.nextInt();
         switch(op){
             case 1:{
                 bd.modificarProducto(op,"GASEOSA","A003");
                 bd.imprimirProducto();
         break;
         }
}}}
