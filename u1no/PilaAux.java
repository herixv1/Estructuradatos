package u1no;

import java.util.Scanner;
import java.util.Stack;

public class PilaAux {

    Runtime runtime = Runtime.getRuntime();

    Stack<String> PilaAux = new Stack<String>();
    Scanner Leer = new Scanner(System.in);

    public int MenuCons() {
        long maxM = runtime.maxMemory();
        long freeM = runtime.freeMemory();
        long usedM = maxM - freeM;
        System.out.println("\n Memoria maxima: " + maxM + " bytes");
        System.out.println("Memoria libre: " + freeM + " bytes");
        System.out.println("Memoria utilizada: " + usedM + " bytes");

        int opcion = 0, i = 0;
        System.out.println("\n Pila de nombres");
        System.out.println("1.- Insertar");
        System.out.println("2.- Extraer");
        System.out.println("3.- Modificar");
        System.out.println("4.- Imprimir");
        System.out.println("5.- Salir");
        System.out.println("Introduzca su opcion:");
        opcion = Leer.nextInt();
        i = MenuSwitch(opcion);

        return i;
    }

    public int MenuSwitch(int opcion) {

        String nombre = null;

        switch (opcion) {
            case 1:
                Capturar();
                break;
            case 2:
                nombre = PilaAux.pop();
                System.out.println(nombre + "ha sido eliminado");
                break;
            case 3:
                mod();
                /*
                 * System.out.println("introduzca el nombre a modificar: ");
                 * nombre=Leer.next();
                 * ind=PilaNombres.indexOf(nombre);
                 * if (ind!=-1){
                 * System.out.print("capture nuevo nombre:");
                 * nombre=Leer.next();
                 * PilaNombres.set(ind, nombre);
                 * 
                 * 
                 * }else
                 * System.out.println("nombre: "+ nombre +" no encontrado");
                 * 
                 */
                break;
            case 4:
                System.out.println(PilaAux);
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

    public void Capturar() {
        String nombre;
        System.out.println("nombre: ");
        nombre = Leer.next();
        Insertar(nombre);
    }

    public void Insertar(String nombre) {

        PilaAux.push(nombre);

    }

    public void mod() {

        long nanoi = System.nanoTime();

        if (PilaAux.isEmpty()) {
            System.out.println("La pila está vacía, no hay elementos para modificar.");
            return;
        }

        // Pila temporal
        Stack<String> auxiliar = new Stack<>();

        // Desapilar todos los elementos de la pila original hacia la auxiliar
        // El último elemento en ser desapilado es el que originalmente estaba en el
        // fondo
        while (!PilaAux.isEmpty()) {
            auxiliar.push(PilaAux.pop());
        }

        // En este punto, auxiliar tiene los elementos en orden inverso
        // El tope de auxiliar es el fondo original
        String fondoOriginal = auxiliar.peek();
        System.out.println("Elemento en el fondo: " + fondoOriginal);

        System.out.print("Capture nuevo nombre para el fondo: ");
        String nuevo = Leer.next();

        // Reemplazar el fondo: sacar el tope de auxiliar y poner el nuevo
        auxiliar.pop();
        auxiliar.push(nuevo);

        // Regresar los elementos a la pila original
        // Como auxiliar está invertida, al desapilar y apilar en original se restaura
        // el orden original
        while (!auxiliar.isEmpty()) {
            PilaAux.push(auxiliar.pop());
        }

        // Limpiar la pila auxiliar y liberar referencia
        auxiliar.clear();
        auxiliar = null;
        System.gc(); // invocar al recolector de basura

        long nanof = System.nanoTime();
        long Nanot = nanof - nanoi;
        double Seg = Nanot / 1000000000.0;
        System.out.println("tiempo de ejecucion =" + Nanot);
        System.out.println("tiempo en segundos =" + Seg);

    }

    public static void main(String[] args) {

        System.out.println("T.E. :" + System.nanoTime());

        PilaAux pila = new PilaAux();
        for (int i = 1; i > 0; i++) {
            pila.MenuCons();
        }

        // ciclo infinito
        /*
         * for(int i=1; i<0; i++){
         * System.out.println( i );
         * if(i>50)
         * System.exit(0);
         * }
         * }
         */
    }

}
