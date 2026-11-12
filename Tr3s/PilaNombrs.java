package Tr3s;

import java.util.Scanner;
import java.util.Stack;

public class PilaNombrs {

    Stack<String> nombres =new Stack<String>();
    Scanner read=new Scanner(System.in);

    public void menu() {

        int opv;
        System.out.println("\n------------------------------");
        System.out.println("       PILA DE NOMBRESS");
        System.out.println("------------------------------");
        System.out.println("       1.- Insertar");
        System.out.println("        2.- Remover");
        System.out.println("       3.- Consultar");
        System.out.println("        4.- Buscar");
        System.out.println("       5.- Imprimir");
        System.out.println("        6.- Salir");
        System.out.println("------------------------------");
        System.out.println("ingrese la opcion:");
        opv=read.nextInt();

        switch(opv) {
            case 1:
                insertar();
                break;
            case 2:
                remover();
                break;
            case 3:
                consultar();
                break;
            case 4:
                buscar();
                break;
            case 5:
                imprimir();
                break;
            case 6:
                salir();
                break;
            default:
                System.out.println("Opcion invalida");
                menu();
        }
    }

    public void insertar() {

        String nombre;
        System.out.println("nombre: ");
        nombre = read.next();
        nombres.push(nombre);
        System.out.println("el nombre: " + nombre + " fue agregado");

    }

    public void remover() {

        String nombre;
        if (!nombres.isEmpty()) {
            nombre = nombres.pop();
            System.out.println("el nombre: " + nombre + " fue eliminado");
        } else {
            System.out.println("La pila esta vacia");
        }

    }

    public void consultar(){

        if (!nombres.isEmpty()) {
            System.out.println("el nombre en la cima es: " + nombres.peek());
        } else {
            System.out.println("La pila esta vacia");
        }

    }

    public void buscar(){

        String nombre;
        if(!nombres.isEmpty()) {
            System.out.println("nombre a buscar: ");
            nombre = read.next();
            int pos=nombres.search(nombres);
            if (pos>-1) {
                System.out.println("el nombre: " + nombre + " esta en la pila");
            } else {
                System.out.println("el nombre: " + nombre + " no esta en la pila");
            }
        }else
            System.out.println("la pila esta vacia");

    }

    public void imprimir() {

        if (!nombres.isEmpty())
        System.out.println(nombres);
        else
            System.out.println("pila vacia");

    }

    public void salir() {

        read.close();
        if(!nombres.isEmpty())
            nombres.clear();
        System.gc();
        System.out.println("adiox");
        System.exit(0);

    }

    static void main(String[] args) {

        PilaNombrs pila = new PilaNombrs();
        for (int i = 1; i > 0; i++) {
            pila.menu();
        }

    }
}