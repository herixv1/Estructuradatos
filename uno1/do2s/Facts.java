package do2s;

import javax.swing.JOptionPane;

public class Facts {

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }

    public static void main(String[] args) {

        Facts f = new Facts();
        f.menu();
        
    }

    public void menu() {

        JOptionPane.showMessageDialog(null, "calculadora de factoriales");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo:"));
        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial(n));
        
    }

}
