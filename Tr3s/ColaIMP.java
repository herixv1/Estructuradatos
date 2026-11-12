package Tr3s;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ColaImpresion {

    Queue<Documentos> colas=new ArrayDeque<Documentos>();
    Documentos doc=new Documentos();
    Scanner leer = new Scanner(System.in);
    String Archivo=null;
    String Usuario=null;
    int hojas=0;

    public void menu() {
        System.out.println("-------------- MENU ----------------");
        System.out.println("1. INGRESAR DOCUMENTOS              *");
        System.out.println("2. IMPRIMIR DOCUMENTOS             **");
        System.out.println("3. IMPRIMIR DOCUMENTOS SIGUIENTES ***");
        System.out.println("4. MOSTAR DOCUMENTOS EN COLA     ****");
        System.out.println("5. CANCELAR IMPRESIONES         *****");
        System.out.println("6. Salir..");
        System.out.println("INGRESA UNA OPCION:                 *");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                Insertar();
                break;
            case 2:
                imprimir();
                break;
            case 3:
                Mostrar();
                break;
            case 4:
                MostrarI();
                break;
            case 5:
                Cancelar();
                break;
            case 6:
                Salir();
                break;
            default:
                System.out.println("ESA OPCION NO EXISTE");
        }
    }

    public void Insertar() {

        System.out.println("INGRESA NOMBRE AL ARCHIVO: ");
        Archivo = leer.next();
        System.out.println("INGRESA NOMBRE DEL USUARIO: ");
        Usuario = leer.next();
        System.out.println("INGRESA NUMERO DE HOJAS: ");
        hojas = leer.nextInt();
        Documentos doc = new Documentos(Archivo, Usuario, hojas);
        colas.offer(doc);
    }
        public void imprimir() {
            if (colas.size() > 0) {
                System.out.println("IMPRIMIENDO EL DOCUMENTO: " + colas.poll().toString());
            } else {
                System.out.println("ERROR NO HAY DOCUMENTOS");
            }
        }

        public void Mostrar() {
            if (colas.size() > 0) {
                System.out.println("SIG. DOCUMENTO: " + colas.peek().toString());
            } else {
                System.out.println("ERROR NO HAY DOCUMENTOS");
            }
        }

    public void MostrarI() {
        if (colas.size() == 0) {
            System.out.println("COLA VACIA");
            return;
        }

        int i = 1;
        for (Documentos d : colas) {
            System.out.println(i++ + "| " + d);
        }
    }

        public void Cancelar() {
            if (colas.size() > 0) {
                System.out.println("EL DOCUMENTO ES CANCELADO: " + colas.poll().toString());
            } else {
                System.out.println("ERROR NO HAY DOCUMENTOS");
            }
        }

    public void Salir() {

        System.out.println("FIN ");
        System.exit(0);
    }
    public static void main(String[] args) {

        ColaImpresion coImp = new ColaImpresion();
        while(true) {
            coImp.menu();
        }
    }
}
