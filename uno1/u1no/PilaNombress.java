package u1no;

import java.util.Scanner;
import java.util.Stack;

public class PilaNombress {

    Stack <String> PilaNombres = new Stack<String>();
    Scanner Leer= new Scanner(System.in);

    public void MenuCons(){
        int opcion=0;
        System.out.println("Pila de nombres");
        System.out.println("1.- Insertar");
        System.out.println("2.- Extraer");
        System.out.println("3.- Modificar");
        System.out.println("4.- Imprimir");
        System.out.println("5.- Salir");
        System.out.println("Introduzca su opcion:");
        opcion = Leer.nextInt();
        MenuSwitch(opcion);

    }

    public void MenuSwitch(int opcion){

            String nombre=null;

            int ind=0;

        switch(opcion){
            case 1:
                Capturar();
                break;
            case 2:
                nombre=PilaNombres.pop();
                System.out.println(nombre + "ha sido eliminado");
                break;
            case 3:
                System.out.println("introduzca el nombre a modificar: ");
                nombre=Leer.next();
                ind=PilaNombres.indexOf(nombre);
                if (ind!=-1){
                    System.out.print("capture nuevo nombre:");
                    nombre=Leer.next();
                    PilaNombres.set(ind, nombre);

                }else 
                    System.out.println("nombre no encontrado");

                break;
            case 4:
                System.out.println(PilaNombres);
                break;
            case 5:
                System.out.println("Saliendo del programa");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            
        }
    }

    public void Capturar(){
        String nombre;
        System.out.println("nombre: ");
        nombre = Leer.next();
        Insertar(nombre);
    }

    public void Insertar(String nombre){

        PilaNombres.push(nombre);

    }


    public static void main(String[] args) {

        PilaNombress pila = new PilaNombress();
        for(int i=1; i>0; i++){
        pila.MenuCons();
        }
//ciclo infinito 
    /* for(int i=1; i<0; i++){
            System.out.println( i );
            if(i>50)
                System.exit(0);
        }
    }
*/
}
}