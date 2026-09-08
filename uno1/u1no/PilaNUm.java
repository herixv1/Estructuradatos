package u1no;
import java.util.Stack;

public class PilaNUm {

    public static void main(String[] args) {

        System.gc();


        //long milistart = System.currentTimeMillis();
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.totalMemory() );
        System.out.println(rt.maxMemory());
        System.out.println(rt.freeMemory());

        System.out.println("Memoria usada: " + (rt.totalMemory() - rt.freeMemory()));

        System.gc();


        Stack<Integer> numero = new Stack<Integer>();
        for(int i=0; i<10 ; i++)
            numero.push(i);
        System.out.println("PILA DE NUMS");
        System.out.println(numero);

        System.out.println("Memoria usada: " + (rt.totalMemory() - rt.freeMemory()));
        


        //long milifin = System.currentTimeMillis();
        //long militottal = milifin - milistart;
        //System.out.println("Tiempo total: " + militottal + " ms");
    }
}
