package do2s;

public class Recursividad {

    public void Imp(int num) {
        if (num == 0) {
            System.out.println("INICIO DEL METODO RECURSIVO");
        }
        if (num < 10) {
            System.out.println(num);
            num++;
            Imp(num);
        } else
            System.out.println("fin del metodo recursivo");
    }

    public static void main(String[] args) {

        Recursividad r = new Recursividad();
        r.Imp(0);

    }

}
