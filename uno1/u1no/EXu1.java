package u1no;

public class EXu1 {
    final int NUMERO=10;
    
    Runtime runtime = Runtime.getRuntime();

    public void FactorialA()
    {
        long TiempoIn = System.nanoTime();//para que mida el tiempo desde el inicio del metodo
        System.gc();
        Long TotalM= runtime.totalMemory();
        Long FreeM= runtime.freeMemory();
        

        System.out.println("\n factorialA:");
        int factor=NUMERO;
        for( int i=1 ; i<NUMERO ; i++)
            factor*=i;
        System.out.println( NUMERO+"!="+factor);

        Long UsedM= TotalM-FreeM;
        System.out.println(" Memoria usada: " + UsedM + " bytes");

        long TiempoFin = System.nanoTime();
        long TiempoTotal = TiempoFin- TiempoIn;
        System.out.println("Tiempo de ejecucion en nanosegundos: " + TiempoTotal);
    }
    
    public void FactorialB()
    {
        long TiempoIn = System.nanoTime();

        System.gc();
        Long TotalM= runtime.totalMemory();
        Long FreeM= runtime.freeMemory();
        
        
        System.out.println("\n factorialB:");
        int arreglo[]=new int[NUMERO];
        int factor=NUMERO;
        
        for(int i=0; i<arreglo.length; i++)
            arreglo[i]=i+1;

        if(NUMERO>2)
            for(int i=0; i<arreglo.length; i++)
                if(arreglo[i]<NUMERO)
                    factor*=arreglo[i];
        
        System.out.println( NUMERO+"!="+factor);

        Long UsedM= TotalM-FreeM;
        System.out.println(" Memoria usada: " + UsedM + " bytes");

        long TiempoFin = System.nanoTime();
        long TiempoTotal = TiempoFin- TiempoIn;
        System.out.println("Tiempo de ejecucion en nanosegundos: " + TiempoTotal);
    }

    public static void main(String[] args)
    {
        EXu1 obj=new EXu1();
        obj.FactorialA();
        obj.FactorialB();
    }

}
