package Tr3s;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Cafeteria1800 {

    Scanner ler = new Scanner(System.in);
    Queue<Integer> clientes = new ArrayDeque<>();
    int turnos = 0;
    int TurnoAct = 0;
    double Ticket = 0.0;

    public void menu() {

        System.out.println("\n________________________________________");
        System.out.println("|           Cafeteria 1-800            |");
        System.out.println("|--------------------------------------|");
        System.out.println("|          1.- Tomar turno             |");
        System.out.println("|        2.- Atender cliente           |");
        System.out.println("|          3.- Proximo turno           |");
        System.out.println("|             4.- Ver fila             |");
        System.out.println("|              5.- Salir               |");
        System.out.println("|--------------------------------------|");
        System.out.println("ingrese la opcion:");
        int opv = ler.nextInt();

        switch (opv) {
            case 1:
                Add();
                break;
            case 2:
                Atender();
                break;
            case 3:
                Proximo();
                break;
            case 4:
                VerFila();
                break;
            case 5:
                salir();
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }

    public void Add() {

        turnos++;
        clientes.offer(turnos);
        System.out.println("\nSu Turno asignado: #" + turnos);
        System.out.println("Personas en la fila: " + clientes.size());

    }

    public void Atender() {

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes en la fila.");
        } else {
            TurnoAct = clientes.poll();
            System.out.println("LLamando al cliente: " + TurnoAct);
            verMenu();
        }

    }

    public void Proximo() {

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes en la fila.");
        } else {
            System.out.println("Proximo cliente: " + clientes.peek());
        }

    }

    public void VerFila() {

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes en la fila.");
        } else {
            System.out.println("Fila de clientes: " + clientes);
        }

    }

    public void salir() {

        clientes.clear();
        ler.close();
        System.out.println("\nadioxx");
        System.exit(0);

    }

    public void verMenu() {

        boolean pagado = false;

        while (!pagado) {
            System.out.println("\n________________________________________");
            System.out.println("|               ALIMENTOS              |");
            System.out.println("|--------------------------------------|");
            System.out.println("|               1.- Tacos              |");
            System.out.println("|               2.- Tortas             |");
            System.out.println("|               3.- Sodas              |");
            System.out.println("|              4.- Botanas             |");
            System.out.println("|               5.- Pagar              |");
            System.out.println("|--------------------------------------|");
            System.out.println("ingrese la opcion:");
            int opv = ler.nextInt();

            switch (opv) {
                case 1:
                    Tacos();
                    break;
                case 2:
                    Tortas();
                    break;
                case 3:
                    Sodas();
                    break;
                case 4:
                    Botanas();
                    break;
                case 5:
                    if (Ticket == 0.0) {
                        System.out.println("Agrega al menos un producto antes de pagar.");
                    } else {
                        Pagar();
                        pagado = true;
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public void Tacos() {

        Ticket += 20.0;
        System.out.println("Taco agregado. Total: $" + Ticket);

    }

    public void Tortas() {

        Ticket += 35.0;
        System.out.println("Torta agregada. Total: $" + Ticket);

    }

    public void Sodas() {

        Ticket += 15.0;
        System.out.println("Soda agregada. Total: $" + Ticket);

    }

    public void Botanas() {

        Ticket += 25.0;
        System.out.println("Botana agregada. Total: $" + Ticket);

    }

    public void Pagar() {

        System.out.println("\n________________________________________");
        System.out.println("|            TICKET DE PAGO            |");
        System.out.println("|--------------------------------------|");
        System.out.printf("| Cliente #%-28d|%n", TurnoAct);
        System.out.printf("| Total a pagar: $%-21.2f|%n", Ticket);
        System.out.println("|______________________________________|");
        Ticket = 0.0;
        TurnoAct = 0;

    }

    public static void main(String[] args) {

        Cafeteria1800 cafe = new Cafeteria1800();
        while (true) {
            cafe.menu();
        }
    }
}