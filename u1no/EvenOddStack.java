package u1no;

import java.util.Stack;

public class EvenOddStack {

    Stack<Integer> even = new Stack();
    Stack<Integer> odd = new Stack();

    public void asicnar() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                even.push(i);
            } else {
                odd.push(i);
            }
        }
    }

    public void show() {
        System.out.println("Pila de Pares: " + even);
        System.out.println("Pila de Impares: " + odd);
    }

    public static void main(String[] args) {
        EvenOddStack s = new EvenOddStack();
        s.asicnar();
        s.show();
    }

}
