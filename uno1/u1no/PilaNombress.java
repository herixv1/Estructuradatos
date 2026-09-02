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

        switch(opcion){
            case 1:
                Insertar();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
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

    public void Insertar(){
        String nombre;
        System.out.println("Introduzca el nombre a insertar:");
        nombre = Leer.next();
        PilaNombres.push(nombre);
    }

    public void Capturar(){
        
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