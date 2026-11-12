package do2s;

public class PapitaC {

    boolean perdioj1=false, perdioj2=false, perdioj3=false, perdioj4=false;
    int jugadores=4;
    int papa=0, jugin=0;

    public void Start() {

        int ronda = 1;
        System.out.println("\nempieza el juego del camaron");

        while (jugadores > 1) {

            System.out.println("\nronda: " + ronda);
            ronda++;

            papa = (int) (Math.random() * 100) + 1;
            jugin = (int) (Math.random() * 4) + 1;

            switch (jugin) {
                case 1:
                    jugador1(papa);
                    break;
                case 2:
                    jugador2(papa);
                    break;
                case 3:
                    jugador3(papa);
                    break;
                case 4:
                    jugador4(papa);
                    break;
                default:
                    System.out.println("el jugador inicial no esta en el juego");
            }
        }

        if (!perdioj1) {
            System.out.println("Campeoun mundial el player 1unooo");
        } else if (!perdioj2) {
            System.out.println("Campeoun mundial el player 2dos");
        } else if (!perdioj3) {
            System.out.println("Campeoun mundial el player 3tres");
        } else if (!perdioj4) {
            System.out.println("Campeoun mundial el player 4cuatro");

        }
    }

        public int jugador1(int papa){

        if (!perdioj1)
        System.out.println("jugador 1: papa="+papa);

        if (perdioj1)
           return jugador2(papa);

        else if(papa==0) {

            System.out.println("jugador 1 ya perdio por wey");
            perdioj1 = true;
            jugadores--;
            return papa;

        } else if (jugadores>1) {
            return jugador2(papa-1);
        }
        else {
            return papa;
        }
    }

    public int jugador2(int papa){

        if (!perdioj2)
            System.out.println("jugador 2: papa="+papa);

        if (perdioj2)
            return jugador3(papa);

        else if(papa==0) {

            System.out.println("jugador 2 ya perdio por wey");
            perdioj2 = true;
            jugadores--;
            return papa;

        } else if (jugadores>1) {
            return jugador3(papa-1);
        }
        else {
            return papa;
        }
    }

    public int jugador3(int papa){

        if (!perdioj3)
            System.out.println("jugador 3: papa="+papa);

        if (perdioj3)
            return jugador4(papa);

        else if(papa==0) {

            System.out.println("jugador 3 ya perdio por wey");
            perdioj3 = true;
            jugadores--;
            return papa;

        } else if (jugadores>1) {
            return jugador4(papa-1);
        }
        else {
            return papa;
        }
    }

    public int jugador4(int papa){

        if (!perdioj4)
            System.out.println("jugador 4: papa="+papa);

        if (perdioj4)
            return jugador1(papa);

        else if(papa==0) {

            System.out.println("jugador 4 ya perdio por wey");
            perdioj4 = true;
            jugadores--;
            return papa;

        } else if (jugadores>1) {
            return jugador1(papa-1);
        }
        else {
            return papa;
        }
    }

    public static void main(String[] args) {

        PapitaC papa= new PapitaC();
        papa.Start();

    }
}
