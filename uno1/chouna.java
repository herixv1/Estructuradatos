public class chouna {

        int [][] chouna = new int[5][5];
        int choun[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        public void asicnar(){
        for(int i=0; i<chouna.length; i++){
            for(int j=0; j<chouna[i].length; j++){
                chouna[i][j] = i+j;
            }

        }}

        public void print(){
            for(int i=0; i<chouna.length; i++){
                for(int j=0; j<chouna[i].length; j++){
                    System.out.print(chouna[i][j]+" ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        chouna c = new chouna();
        c.asicnar();
        c.print();
    }
}
