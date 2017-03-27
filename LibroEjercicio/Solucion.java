
package desarrollo.LibroEjercicio;

import java.util.ArrayList;
import java.util.Scanner;


public class Solucion {

    static ArrayList<Libro> Libros= new ArrayList<>();
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        
        
        do{
            System.out.println("---------- MENU DE OPCIONES ---------");
            System.out.println("1- Agregar Libros base");
            System.out.println("2- Imprimir todos los libros");
            System.out.println("3- Corregir numero de paginas");
            System.out.println("4. Agregar con posicion ");
            System.out.println("13- Salir");
            System.out.print("Digite la opcion:_");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    for (int i = 0; i < 2; i++) {
                        Libro libro = new Libro();
                        System.out.println("Ingreso del libro Numero "+(i+1));
                        System.out.println("Ingresa el nombre de un libro ");
                        libro.setNombre(teclado.next());
                        System.out.println("Ingresa el nombre de la editorial ");
                        libro.setEditorial(teclado.next());
                        System.out.println("Ingresa el numero de paginas ");
                        libro.setPaginas(teclado.nextInt());
                        Libros.add(libro);
                    }
                    System.out.println("Listo ..Libros Agregados :)");
                break;
                case 2:
                    imprimirTodo();
                    
                    break;
                case 3:
                    String nombre;
                    System.out.print("Escribe el nombre del libro");
                    nombre=teclado.next();
                    for (int i = 0; i < Libros.size(); i++) {
                        if (Libros.get(i).getNombre().equalsIgnoreCase(nombre)){
                            System.out.print("Corrige el numero de paginas  ("+Libros.get(i).getPaginas()+"): ");
                            Libros.get(i).setPaginas(teclado.nextInt());
                            System.out.println("Libro Modificado");
                        }
                    }
                    imprimirTodo();
                break;
                case 4:
                    int posicion;
                    do{
                        System.out.println("Ingrese una posicion para ingresar el libro ");
                        posicion=teclado.nextInt();
                    }while(posicion>Libros.size());
                    Libro libro = new Libro();
                    System.out.print("Nombre del libro ");
                    libro.setNombre(teclado.next());
                    System.out.println("Nombre de editorial ");
                    libro.setEditorial(teclado.next());
                    System.out.print("Numero de paginas ");
                    libro.setPaginas(teclado.nextInt());
                    Libros.set(posicion, libro);
                    System.out.println("Libro Agregado");
                    imprimirTodo();
                    break;
                    
            }
        }while(opcion!=4);
    }
    
    static void imprimirTodo(){
        for (int i = 0; i < Libros.size(); i++)
            System.out.println(Libros.get(i).toString());
    }
    
}
