package unidad1;

import java.util.Stack;
public class Pilas {

    public static void main(String[] args) {

        System.out.println("creando pila perrona....");

        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Tamaño de la pila: " + pila.size());

        System.out.println("Agregando elementos a la pila...");

        for(int i=0; i<10; i++)
            pila.push(i+1);
        
        

        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("valores de la pila: " + pila);
        pila.pop();
        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("valores de la pila: " + pila);
    }

}
