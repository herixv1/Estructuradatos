package Cu4tro;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class ArbolBin {

    Scanner ler = new Scanner(System.in);
    static TreeMap<String,Integer> arbolin = new TreeMap<>();


    public void menu(){

        int opv;
        System.out.println("\n|---------Menu Arbol--------|");
        System.out.println("|   1.- Insertar al arbol   |");
        System.out.println("|   2.- Eliminar valor      |");
        System.out.println("|   3.- Mostrar             |");
        System.out.println("|   4.- Mostrar primero     |");
        System.out.println("|   5.- Mostrar ultimo      |");
        System.out.println("|   6.- SubArbol            |");
        System.out.println("|   7.- Salir               |");
        System.out.println("|---------------------------|");
        System.out.print("Seleccione una opción: ");
        opv=ler.nextInt();
        switch (opv){

            case 1:
                insertar();
                break;
            case 2:
                eliminar();
                break;
            case 3:
                Mostrar();
                break;
            case 4:
                prim();
                break;
            case 5:
                ult();
                break;
            case 6:
                subArbol();
                break;
            case 7:
                Salir();
                break;
            default:
                System.out.println("\n opcion invalida");
                break;
        }

    }

    public void insertar(){

        String A;
        Integer B;
        System.out.println("\nIntroduzca el nombre en texto ");
        A=ler.next();
        System.out.println("introduzca el valor correspondiente");
        B= ler.nextInt();
        arbolin.put(A,B);

    }

    public void eliminar(){

        System.out.println("\nArbol:"+ arbolin);

        System.out.println("\ningrese el nombre a eliminar");
        String A = ler.next();
        Integer B = arbolin.remove(A);
        System.out.println("Eliminado: " + A + " = " + B);

    }

    public void Mostrar(){

        System.out.println(arbolin);

    }

    public void prim(){

        System.out.println("\nprimero: " + arbolin.firstEntry());

    }

    public void ult(){

        System.out.println("\nultimo: " + arbolin.lastEntry());

    }

    public void subArbol(){

        Map<String, Integer> subArbol = arbolin.subMap("A", true, "C", true);
        System.out.println("Subárbol (A, C): " + subArbol);

    }

    public void Salir(){

        System.exit(0);

    }

    public static void main(String[] args) {

        ArbolBin Arbol= new ArbolBin();
        while(true) {
            Arbol.menu();
        }
    }

}
