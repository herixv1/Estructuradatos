package Tr3s;

import java.util.Scanner;

public class ColaCircular {

    static Scanner sc = new Scanner(System.in);

    int FI, FO;
    int ColaC[];
    static int capacidad;
    int tamaño;

    public ColaCircular(int capacidad) {

        ColaC = new int[capacidad];
        this.capacidad = capacidad;
        this.tamaño = 0;
        this.FI=-1;
        this.FO=0;
    }

    public void Menu(){

        int opv=0;
        System.out.println("\n+------------------------------------+");
        System.out.println("|           COLA CIRCULAR            |");
        System.out.println("+------------------------------------+");
        System.out.println("| 1. Insertar                        |");
        System.out.println("| 2. Extraer                         |");
        System.out.println("| 3. Imprimir cola                   |");
        System.out.println("| 4. Ver primero                     |");
        System.out.println("| 5. Ver ultimo                      |");
        System.out.println("| 6. Cambiar primero por el ultimo   |");
        System.out.println("| 7. Invertir cola                   |");
        System.out.println("| 8. Vaciar cola                     |");
        System.out.println("| 9. Salir                           |");
        System.out.println("+------------------------------------+");

        System.out.print("Ingrese una opcion: ");
        opv = sc.nextInt();
        switch(opv) {
            case 1:
                System.out.println("Ingrese un numero a insertar: ");
                int elemento = sc.nextInt();
                if (Insertar(elemento)) {
                    System.out.println("Elemento insertado");
                } else {
                    System.out.println("Cola llena no se puede insertar");
                }
                break;
            case 2:
                if (tamaño > 0) {
                    int extraido = Extraer();
                    System.out.println("Elemento extraido: " + extraido);
                } else {
                    System.out.println("Cola vacia,");
                }
                break;
            case 3:
                if (tamaño > 0) {
                    ImpCola();
                } else {
                    System.out.println("Cola vacia");
                }
                break;
            case 4:
                if (tamaño > 0) {
                    System.out.println("Primero: " + Primero());
                } else {
                    System.out.println("Cola vacia");
                }
                break;
            case 5:
                if (tamaño > 0) {
                    System.out.println("Ultimo: " + Ultimo());
                } else {
                    System.out.println("Cola vacia");
                }
                break;
            case 6:
                if (CambiarPrimeroUltimo()) {
                    System.out.println("Primero y ultimo cambiados correctamente");
                } else {
                    System.out.println("Se necesitan al menos 2 elementos");
                }
                break;
            case 7:
                if (Invertir()) {
                    System.out.println("Cola invertida correctamente");
                } else {
                    System.out.println("Se necesitan al menos 2 elementos");
                }
                break;
            case 8:
                if (Vaciar()) {
                    System.out.println("Cola vaciada correctamente");
                } else {
                    System.out.println("La cola ya esta vacia");
                }
                break;
            case 9:
                salir();
                break;
            default:
                System.out.println("Opcion invalida");
        }

    }

    public boolean ColaLlena() {

        return tamaño == capacidad;

    }

    public boolean Insertar(int numero) {

        if (ColaLlena()) {
            System.out.println("\ncola llena");
            return false;
        }

        FI = (FI + 1) % capacidad;
        ColaC[FI] = numero;
        tamaño++;
        return true;

    }

    public int Extraer() {

        if (tamaño == 0){
            System.out.println("\ncola vacia");
            return -1;
        }

        int num = ColaC[FO];
        ColaC[FO] = 0; // Limpia la posicion
        FO = (FO + 1) % capacidad;
        tamaño--;
        return num;

    }

    public void ImpCola() {
        System.out.println("\nCola: ");

        for (int i = 0; i < tamaño; i++) {
            System.out.print(ColaC[ (FO + i) % capacidad] + ", ");
        }

    }

    public int Primero(){

        return ColaC[FO];

    }

    public int Ultimo(){

        return ColaC[FI];

    }

    public boolean CambiarPrimeroUltimo(){

        if (tamaño < 2)
            return false;

        int aux = ColaC[FO];
        ColaC[FO] = ColaC[FI];
        ColaC[FI] = aux;
        return true;

    }

    public boolean Invertir(){

        if (tamaño < 2)
            return false;

        for (int i = 0; i < tamaño / 2; i++) {
            int a = (FO + i) % capacidad;
            int b = (FI - i + capacidad) % capacidad;
            int aux = ColaC[a];
            ColaC[a] = ColaC[b];
            ColaC[b] = aux;
        }
        return true;

    }

    public boolean Vaciar(){

        if (tamaño == 0)
            return false;

        for (int i = 0; i < capacidad; i++) {
            ColaC[i] = 0;
        }
        FI = -1;
        FO = 0;
        tamaño = 0;
        return true;

    }

    public void salir() {
        System.out.println("Saliendo del programa...");
        System.exit(0);
    }

    public static void main(String[] args) {

        System.out.println("Estructura de datitos- cola circular");
        System.out.println("Ingrese el tamaño de la cola circular: ");
        capacidad = sc.nextInt();
        ColaCircular cola = new ColaCircular(capacidad);

        while(true) {
            cola.Menu();
        }

    }
}