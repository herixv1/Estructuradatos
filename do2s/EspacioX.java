package do2s;

public class EspacioX {

    public void despegue(int num) {
        if (num == 10) {
            System.out.println("cohete despegando en T-10 segundos");
        }
        if (num >= 0) {
            System.out.println(num);
            num--;
            despegue(num);
        } else {
            System.out.println("El cohete despego");
        }
    }

    public static void main(String[] args) {

        EspacioX cohete = new EspacioX();
        cohete.despegue(10);

    }

}
