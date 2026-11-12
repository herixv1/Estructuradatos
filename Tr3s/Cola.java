package Tr3s;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Cola {

    Scanner ler=new Scanner(System.in);
    Queue<Double> cola = new ArrayDeque<>();

    public void menu(){

        int opv;
        System.out.println("\n________________________________________");
        System.out.println("|             Menu de Colas            |");
        System.out.println("|--------------------------------------|");
        System.out.println("|       1.- Insertar.Offer()           |");
        System.out.println("|        2.- Remover.poll()            |");
        System.out.println("|       3.- Consultar.peek()           |");
        System.out.println("|--------------------------------------|");
        System.out.println("|       4.- Insertar.Add()             |");
        System.out.println("|        5.- Remover.Remove()          |");
        System.out.println("|       6.- Consultar.Element()        |");
        System.out.println("|--------------------------------------|");
        System.out.println("|            7.- Imprimir.             |");
        System.out.println("|              8.- Salir               |");
        System.out.println("|--------------------------------------|");
        System.out.println("ingrese la opcion:");
        opv=ler.nextInt();

        switch (opv) {
            case 1:
                Offer();
                break;
            case 2:
                poll();
                break;
            case 3:
                peek();
                break;
            case 4:
                Add();
                break;
            case 5:
                Remove();
                break;
            case 6:
                Element();
                break;
            case 7:
                imprimir();
                break;
            case 8:
                salir();
                break;
            default:
                System.out.println("Opcion invalida");
                menu();
        }

    }

    public void Offer(){

        System.out.println(cola.offer(Math.random()*10000));

    }

    public void poll(){

        System.out.println(cola.poll());

    }

    public void peek(){

        System.out.print(cola.peek());

    }

    public void Add(){
        System.out.println(cola.add(Math.random()*10000));
    }

    public void Remove(){

        if (!cola.isEmpty())
            System.out.println(cola.remove());
        else
            System.out.println("La cola vacia");

    }

    public void Element(){

        if (!cola.isEmpty())
            System.out.println(cola.element());
        else
            System.out.println("La cola vacia");

    }

    public void imprimir(){

        System.out.println(cola);

    }

    public void salir(){

        cola.clear();
        ler.close();
        System.out.println("adiox");
        System.exit(0);

    }

    static void main(String[] args) {

        Cola c = new Cola();

        while(true)
            c.menu();
    }
}
