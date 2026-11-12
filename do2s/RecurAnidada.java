package do2s;

import java.util.Scanner;
import java.util.Stack;

public class RecurAnidada {



    public long Ackermann(int m, long n) {

        Stack <Integer> pila = new Stack<Integer>();

        pila.push(m);
        while (!pila.isEmpty()) {
            m = pila.pop();
            if (m == 0) {
                n = n + 1;
            } else if (m > 0 && n == 0) {
                pila.push(m-1);
                n = 1;
            } else if (m > 0 && n > 0) {
                pila.push(m-1);
                pila.push(m);
                n = (n-1);
            }
            else {
                System.out.println("Error: m y n deben ser mayores o iguales a 0");
            }
        }return n;

    }

    public static void main(String[] args) {
        RecurAnidada ra = new RecurAnidada();
        System.out.println("El resultado de Ackermann(4, 1) es: " + ra.Ackermann(4, 1));
    }
}

