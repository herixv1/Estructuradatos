package Tr3s;

import java.util.Scanner;

import Tr3s.ColaCircular;

public class AutoColaCirc {

    Scanner scan = new Scanner(System.in);
    ColaCircular Cola;

    public void Create() throws InterruptedException {

        System.out.println("\nIngrese el tamaño de la cola:");
        int capacidad = scan.nextInt();
        System.out.println("Ingrese los ciclos:");
        int ciclos = scan.nextInt();

        Cola = new ColaCircular(capacidad);
        Master(ciclos);
    }

    public void Master(int ciclos) throws InterruptedException {

        System.out.println("Iniciando.......");

        int i = 0, valor = 0, op = 0;

        while (i < ciclos) {

            op = (int) (Math.random() * 2);
            valor = (int) (Math.random() * 100) + 1;


            switch (op) {
                case 0:

                    System.out.println("\n\nInsertando:-->" +valor);

                    Cola.Insertar(valor);
                    Cola.ImpCola();

                    Wait(500);
                    break;

                case 1:

                    System.out.println("\n\nExtrayendo:<--"+Cola.Primero());
                    
                    Cola.Extraer();
                    Cola.ImpCola();

                    Wait(500);

                    break;

                default:

                    System.out.println("Operación no válida");

                    break;
            }
            i++;

        }
        System.out.println("\nNumero de "+ i +" ciclos completado ");
        System.out.println("+-----------------------------------------+");
    }

    public void Wait(int milisec) throws InterruptedException {

        Thread.sleep(milisec);

    }

    public static void main(String[] args) throws InterruptedException {

        AutoColaCirc Auto = new AutoColaCirc();
        while (true) {
            Auto.Create();
        }
    }
}