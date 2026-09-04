package u1no;

import java.util.Scanner;
import java.util.Stack;

public class PilaNombress {

    Runtime runtime = Runtime.getRuntime();

    Stack <String> PilaNombres = new Stack<String>();
    Scanner Leer= new Scanner(System.in);

    public int MenuCons(){
        long maxM = runtime.maxMemory();
        long freeM = runtime.freeMemory();
        long usedM = maxM - freeM;
        System.out.println("\n Memoria maxima: " + maxM + " bytes");
        System.out.println("Memoria libre: " + freeM + " bytes");
        System.out.println("Memoria utilizada: " + usedM + " bytes");
        
        int opcion=0, i=0;
        System.out.println("\n Pila de nombres");
        System.out.println("1.- Insertar");
        System.out.println("2.- Extraer");
        System.out.println("3.- Modificar");
        System.out.println("4.- Imprimir");
        System.out.println("5.- Salir");
        System.out.println("Introduzca su opcion:");
        opcion = Leer.nextInt();
        i=MenuSwitch(opcion);

        return i;
    }

    public int MenuSwitch(int opcion){

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
                mod();
                /* 
                System.out.println("introduzca el nombre a modificar: ");
                nombre=Leer.next();
                ind=PilaNombres.indexOf(nombre);
                if (ind!=-1){
                    System.out.print("capture nuevo nombre:");
                    nombre=Leer.next();
                    PilaNombres.set(ind, nombre);
                    

                }else 
                    System.out.println("nombre: "+ nombre +" no encontrado");

                    */
                break;
            case 4:
                System.out.println(PilaNombres);
                break;
            case 5:
                System.exit(0);
                return 0;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        return 0;
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

    public void mod(){
        long nanoi = System.nanoTime();

        int ind;
        String nombre=null;

        System.out.println("introduzca el nombre a modificar: ");
                nombre=Leer.next();
                ind=PilaNombres.indexOf(nombre);
                if (ind!=-1){
                    System.out.print("capture nuevo nombre:");
                    nombre=Leer.next();
                    PilaNombres.set(ind, nombre);
                    }else 
                    System.out.println("nombre: "+ nombre +" no encontrado");

        long nanof= System.nanoTime();
        long Nanot=nanof-nanoi;
        double Seg=Nanot/1000000000.0;
        System.out.println("tiempo de ejecucion =" + Nanot);
        System.out.println("tiempo en segundos =" + Seg);

    }


    public static void main(String[] args) {

        System.out.println("T.E. :"+ System.nanoTime());



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