public class Arreglito{

        int [] arreglito = new int[10];
        int arreglo[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        public void asicnar(){
        for(int i=0; i<arreglito.length; i++){
                arreglito[i] = i+3;
            

        }}

        public void print(){
            for(int i=0; i<arreglito.length; i++){
                System.out.print(arreglito[i]+" ");
            }
        }

    public static void main(String[] args) {
        Arreglito c = new Arreglito();
        c.asicnar();
        c.print();
    }
}
