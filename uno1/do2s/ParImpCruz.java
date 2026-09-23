package do2s;

import java.util.Scanner;

public class ParImpCruz {

    public boolean Par(int n) {

        if (n == 0) {
            return true;
        }
        else
            return Imp(n-1);

    }

    public boolean Imp(int n) {

        if (n == 0) {
            return false;
        }
        else
            return Par(n-1);

    }

    public static void main(String[] args) {

        ParImpCruz r = new ParImpCruz();
        Scanner Cruz = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n = Cruz.nextInt();
        r.Par(n);

        if (r.Par(n)) {//lee directamente el boolean que retornan los metodos
            System.out.println("El número " + n + " es par.");
        } else {
            System.out.println("El número " + n + " es impar.");
        }

    }
}
