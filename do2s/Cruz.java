package do2s;

public class Cruz {

    int fase=1;

    public int MenosUnno(int n) throws InterruptedException{

        Thread.sleep(1000);
        System.out.println("Fase: " + fase);
        System.out.println("Menos Uno: n=" +n);
        if (n<=0) {
            return n;
        }
        return MenosDos(n-2);
    }

    public int MenosDos(int n) throws InterruptedException{

        fase++;

        Thread.sleep(1000);
        System.out.println("Menos Dos: n=" +n);
        if (n<=0) {
            return n;
        }
        return MenosUnno(n-1);
    }

    public static void main(String[] args) throws InterruptedException {

        Cruz r = new Cruz();
        r.MenosUnno(10);

    }
}
