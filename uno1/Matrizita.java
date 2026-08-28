public class Matrizita {
    int [][] matrizx = new int[5][5];

        public void asignar(){
        for(int f=0; f<matrizx.length; f++){
            for(int c=0; c<matrizx[f].length; c++){
                matrizx[f][c] = f+c;
            }

        }}

        public void show(){
            for(int f=0; f<matrizx.length; f++){
                for(int c=0; c<matrizx[f].length; c++){
                    System.out.print(matrizx[f][c]+" ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        Matrizita c = new Matrizita();
        c.asignar();
        c.show();
    }
}
