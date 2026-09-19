package do2s;

public class Nacci {

    static Runtime runtime = Runtime.getRuntime();

    public long Fibonacci(long n) {

        if(n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }

    public static void main(String[] args) {

        System.gc();
        long TiempoIn = System.nanoTime();//para que mida el tiempo desde el inicio del metodo
        long TotalM= runtime.totalMemory();
        long FreeM= runtime.freeMemory();

        Nacci nacci = new Nacci();
        System.out.println(nacci.Fibonacci(2));
        //0,10,20,30,40,50 evaluar consumo de memoria y tiempo de ejecucion de cada uno

        long UsedM= TotalM-FreeM;
        System.out.println(" Memoria usada: " + UsedM + " bytes");

        long TiempoFin = System.nanoTime();
        long TiempoTotal = TiempoFin- TiempoIn;
        System.out.println("Tiempo de ejecucion en nanosegundos: " + TiempoTotal);

    }
}
