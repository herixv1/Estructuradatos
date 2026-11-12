package Tr3s;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class NC25490928 {
    /* 
    Examen Unidad 3
    Estructura de datos
    Mireles Mosqueda Heriberto
    10/11/26
    Ing. Francisco Javier Ruelas Camargo
    */

    Scanner ler = new Scanner(System.in);
    Queue<String> cola = new ArrayDeque<>();
    String Nc;

    public void menu(){

        System.out.println("\n+--Departamento Financieros--+");
        System.out.println("|       1.- Formarse         |");
        System.out.println("|       2.- Atender          |");
        System.out.println("|       3.- Ver Sig          |");
        System.out.println("|       4.- Ver cola         |");
        System.out.println("|       5.- Salir            |");
        System.out.println("+----------------------------+");
        System.out.println(" Seleccione una opcion: ");

        String opcion = ler.nextLine();
        switch (opcion) {
            case "1":
                Formar();
                break;
            case "2":
                Atender();
                break;
            case "3":
                verSig();
                break;
            case "4":
                verCola();
                break;
            case "5":
                Salir();
                break;
            default:
                System.out.println("\nOpcion invalida");
                break;

        }
    }
    
    public void Formar(){

        System.out.print("Ingrese el numero de control del alumno: ");
        Nc = ler.nextLine();
        cola.offer(Nc);
        System.out.println("Alumno formado. Numero de control: " + Nc);

    }

    public void Atender(){

        Nc = cola.poll();
        if (Nc == null) {
            System.out.println("No hay alumnos en la cola");
            return;
        }
        System.out.println("Atendiendo al alumno con numero de control: " + Nc);

    }

    public void verSig(){

        Nc = cola.peek();
        if (Nc == null) {
            System.out.println("No hay alumnos en la cola de espera.");
            return;
        }
        System.out.println("Siguiente alumno: " + Nc);

    }

    public void verCola() {

        if (cola.isEmpty()) {
            System.out.println("cola vacia.");
            return;
        }

        System.out.println("\nCola de espera : "+cola);
        
    }

    public void Salir(){

        System.out.println("\nSaliendo del programa...");
        ler.close();
        System.exit(0);

    }

    public static void main(String[] args)  {
        NC25490928 examen = new NC25490928();
        while (true) {
            examen.menu();
        }

    }

}
