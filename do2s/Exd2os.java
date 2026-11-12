package do2s;

import java.util.ArrayList;

public class Exd2os {

    public void ronda(ArrayList<Integer> jugadores) {

        if (jugadores.size() == 1) {
            System.out.println("\ngano el jugador " + jugadores.get(0));
            return;
        }

        int cont = (int) (Math.random() * 100) + 1;
        int IndIn = (int) (Math.random() * jugadores.size());
        int jugIn = jugadores.get(IndIn);

        System.out.println("\narranca la ronda");
        System.out.println("Empieza el jugador: " + jugIn);

        papac(jugadores, cont, IndIn);
    }


    public void papac(ArrayList<Integer> jugadores, int cont, int indact) {

        int jugadorActual = jugadores.get(indact);


        if (cont == 0) {

            System.out.println("se detiene la musica");
            System.out.println("Jugador " + jugadorActual + " eliminado.");

            jugadores.remove(indact);

            ronda(jugadores);
            return;
        }


        System.out.println(jugadorActual + " tiene la papa");
        System.out.println("Suena musiquita");

        int sigjug = (indact + 1) % jugadores.size();

        papac(jugadores, cont - 1, sigjug);
    }

    public static void main(String[] args) {
        Exd2os obj = new Exd2os();

        ArrayList<Integer> jugadores = new ArrayList<>();
        jugadores.add(1);
        jugadores.add(2);
        jugadores.add(3);
        jugadores.add(4);

        System.out.println("empiza la papa bomba musical");
        obj.ronda(jugadores);
    }
}