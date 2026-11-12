package Tr3s;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BiCola {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Deque<String> bicola = new ArrayDeque<>();
        int opcion;

        do {
            System.out.println("\n===== MENU BICOLA =====");
            System.out.println("Bicola actual: " + bicola);
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final ");
            System.out.println("3. Remover del inicio");
            System.out.println("4. Remover del final");
            System.out.println("5. Examinar el inicio");
            System.out.println("6. Examinar el final");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("\nDato a insertar al inicio: ");
                    bicola.addFirst(scan.nextLine());
                    System.out.println("Dato insertado al inicio");
                    break;
                case 2:
                    System.out.print("\nDato a insertar al final: ");
                    bicola.addLast(scan.nextLine());
                    System.out.println("Dato insertado al final");
                    break;
                case 3:
                    System.out.println("\nDato removido del inicio: " + bicola.removeFirst());
                    break;
                case 4:
                    System.out.println("\nDato removido del final: " + bicola.removeLast());
                    break;
                case 5:
                    System.out.println("\nPrimer dato: " + bicola.getFirst());
                    break;
                case 6:
                    System.out.println("\nUltimo dato: " + bicola.getLast());
                    break;
                case 7:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 7);

        scan.close();
    }
}