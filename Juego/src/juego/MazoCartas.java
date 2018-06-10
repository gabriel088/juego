/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Gabriel
 */
public class MazoCartas {

//    los atributos son ataques 
//    defensas cantidaD DE CARTAS 16 con un id por carta mesclar id
//    String id;
    int solutionArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    String ataque;
    String defensa;
    MazoCartas refCartas;
    String CartaRepartida1Humano;
    String CartaRepartida2Humano;
    String CartaRepartida3Humano;
    String CartaRepartida1CPU;
    String CartaRepartida2CPU;
    String CartaRepartida3CPU;

    public String getCartaRepartida2Humano() {
        return CartaRepartida2Humano;
    }

    public void setCartaRepartida2Humano(String CartaRepartida2Humano) {
        this.CartaRepartida2Humano = CartaRepartida2Humano;
    }

    public String getCartaRepartida3Humano() {
        return CartaRepartida3Humano;
    }

    public void setCartaRepartida3Humano(String CartaRepartida3Humano) {
        this.CartaRepartida3Humano = CartaRepartida3Humano;
    }

    public String getCartaRepartida1CPU() {
        return CartaRepartida1CPU;
    }

    public void setCartaRepartida1CPU(String CartaRepartida1CPU) {
        this.CartaRepartida1CPU = CartaRepartida1CPU;
    }

    public String getCartaRepartida2CPU() {
        return CartaRepartida2CPU;
    }

    public void setCartaRepartida2CPU(String CartaRepartida2CPU) {
        this.CartaRepartida2CPU = CartaRepartida2CPU;
    }

    public String getCartaRepartida3CPU() {
        return CartaRepartida3CPU;
    }

    public void setCartaRepartida3CPU(String CartaRepartida3CPU) {
        this.CartaRepartida3CPU = CartaRepartida3CPU;
    }

    public String getCartaRepartida1Humano() {
        return CartaRepartida1Humano;
    }

    public void setCartaRepartida1Humano(String CartaRepartida1Humano) {
        this.CartaRepartida1Humano = CartaRepartida1Humano;
        System.out.println("ddddddddd" + CartaRepartida1Humano);
    }

    public MazoCartas getRefCartas() {
        return refCartas;
    }

    public void setRefCartas(MazoCartas refCartas) {
        this.refCartas = refCartas;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getDefensas() {
        return defensa;
    }

    public void setDefensas(String defensas) {
        this.defensa = defensas;
    }
//----------------------------------------------------------------------------------------

    public void declararCartas(String id) {

        if (id.equals("1")) {
            ataque = "0";//
            defensa = "0";

//            System.out.println("nombre " + ataque);
//            System.out.println("salud " + defensa);
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }

        if (id.equals("2")) {
            ataque = "0";//
            defensa = "6";

//            System.out.println("nombre " + ataque);
//            System.out.println("salud " + defensa);
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }

        if (id.equals("3")) {

            ataque = "7";//
            defensa = "6";

//            System.out.println("nombre " + ataque);
//            System.out.println("salud " + defensa);
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("4")) {

            ataque = "3";//
            defensa = "12";

//            System.out.println("nombre " + ataque);
//            System.out.println("salud " + defensa);
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("5")) {

            ataque = "72";//
            defensa = "6";

//            System.out.println("nombre " + ataque);
//            System.out.println("salud " + defensa);
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("6")) {

            ataque = "78";//
            defensa = "6";

//            System.out.println("nombre " + ataque);
//            System.out.println("salud " + defensa);
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("7")) {
            System.out.println("entregada al cpu");
            ataque = "7";//
            defensa = "13";

            System.out.println("nombre " + ataque);
            System.out.println("salud " + defensa);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("8")) {
            System.out.println("entregada al cpu");
            ataque = "2";//
            defensa = "2";

            System.out.println("nombre " + ataque);
            System.out.println("salud " + defensa);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("9")) {
            System.out.println("entregada al cpu");
            ataque = "6";//
            defensa = "6";

            System.out.println("nombre " + ataque);
            System.out.println("salud " + defensa);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }

        if (id.equals("10")) {
            System.out.println("entregada al cpu");
            ataque = "8";//
            defensa = "9";

            System.out.println("nombre " + ataque);
            System.out.println("salud " + defensa);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("11")) {
            System.out.println("entregada al cpu");
            ataque = "12";//
            defensa = "12";

            System.out.println("nombre " + ataque);
            System.out.println("salud " + defensa);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("12")) {
            System.out.println("entregada al cpu");
            ataque = "20";//
            defensa = "20";

            System.out.println("nombre " + ataque);
            System.out.println("salud " + defensa);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }

    }

    public void mesclar() {
        System.out.println("entro a mesclar");

        shuffleArray(solutionArray);
        for (int i = 0; i < solutionArray.length; i++) {
            System.out.print(solutionArray[i] + " ");
        }
        System.out.println();
        repartir(solutionArray);
    }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }

    }

    public void repartir(int solutionArray[]) {
        String parcial = "0";
        System.out.println("Entre a REPARTIR");
        for (int i = 0; i < solutionArray.length; i++) {
            if (i == 0) {
                parcial = Integer.toString(solutionArray[i]);
                System.out.println("direccion cero " + parcial);
                setCartaRepartida1Humano(parcial);
            }
            if (i == 1) {
                parcial = "0";
                parcial = Integer.toString(solutionArray[i]);
                System.out.println("direccion 1 " + parcial);
                setCartaRepartida2Humano(parcial);
            }
            if (i == 2) {
                parcial = "0";
                parcial = Integer.toString(solutionArray[i]);
                setCartaRepartida3Humano(parcial);
            }
            if (i == 3) {
                parcial = "0";
                parcial = Integer.toString(solutionArray[i]);
                setCartaRepartida1CPU(parcial);
            }
            if (i == 4) {
                parcial = "0";
                parcial = Integer.toString(solutionArray[i]);
                setCartaRepartida2CPU(parcial);
            }
            if (i == 5) {
                parcial = "0";
                parcial = Integer.toString(solutionArray[i]);
                setCartaRepartida3CPU(parcial);
            }

        }
    }
}
