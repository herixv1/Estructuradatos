package Tr3s;

import java.util.Scanner;

public class ListasSE {

    String nombre;
    Nodo inicio;

    public ListasSE(String nombre)
    {
        this.nombre=nombre;
        this.inicio=null;
    }

    public class Nodo
    {
        Object dato;
        Nodo sig;

        public Nodo (Object dato) {
            this.dato=dato;
            this.sig=null;

        }
    }

    public void menu(){

        Scanner sc = new Scanner(System.in);
        int opv;
        Object dato;
        System.out.println("\n|-------Menu Lista SE-------|");
        System.out.println("|   1.- Insertar frente     |");
        System.out.println("|   2.- Insertar final      |");
        System.out.println("|   3.- Eliminar frente     |");
        System.out.println("|   4.- Mostrar             |");
        System.out.println("|   5.- Tamaño              |");
        System.out.println("|   6.- Salir               |");
        System.out.println("|---------------------------|");
        System.out.print("Seleccione una opción: ");
        opv = sc.nextInt();

        switch (opv) {
            case 1:
                System.out.print("Ingrese el nombre a insertar enfrente de la lista: ");
                dato = sc.next();
                insertarFrente(dato);
                break;
            case 2:
                System.out.print("Ingrese el nombre a insertar al final de la lista: ");
                dato = sc.next();
                insertarFinal(dato);
                break;

            case 3:
                eliminarFrente();
                break;
            case 4:
                Mostrar();
                break;
            case 5:
                System.out.println("El tamaño de la lista es: " + tamaño());
                break;
            case 6:
                Salir();
                break;
            default:
                System.out.println("Opción no válida");
        }

    }

    public boolean esVacia(){

        return inicio==null;

    }

    public void insertarFrente(Object dato){

        Nodo nuevo = new Nodo(dato);
        nuevo.sig = inicio;
        inicio = nuevo;

    }


    public void Mostrar() {

        if(esVacia()){
            System.out.println("\nLa lista esta vacia");
            return;
        }
        System.out.println("\nlista: ");
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(temp.dato+" | ");
            temp=temp.sig;
        }

    }

    public int tamaño() {

        int contador=0;
        Nodo actual=inicio;
        while(actual!=null){

            contador++;
            actual=actual.sig;

        }
        return contador;

    }


    public void eliminarFrente(){

        if (esVacia()) {
            System.out.println("La lista esta vacia");
        } else {
            inicio = inicio.sig;
        }

    }

    public void insertarFinal(Object dato){

        Nodo nuevo = new Nodo(dato);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodo temp = inicio;
            while (temp.sig != null) {
                temp = temp.sig;
            }
            temp.sig = nuevo;
        }

    }

    public void Salir(){

        System.gc();
        System.exit(0);

    }


    public static void main(String[] args) {

        ListasSE lista=new ListasSE("Nombres");
        while(true){
            lista.menu();
        }

    }
}
