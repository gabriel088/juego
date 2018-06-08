/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Gabriel
 */
public class MazoCartas {

//    los atributos son ataques 
//    defensas cantidaD DE CARTAS 16 con un id por carta mesclar id
//    String id;
    String ataque;
    String defensa;
    MazoCartas refCartas;

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
            ataque = "4";//
            defensa = "2";

///            System.out.println("nombre " + ataque);
///            System.out.println("salud " + defensa);
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
        if (id.equals("7")) {
            System.out.println("entregada al cpu");
            ataque = "7";//
            defensa = "3";

            System.out.println("nombre " + ataque);
            System.out.println("salud " + defensa);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("8")) {
            System.out.println("entregada al cpu");
            ataque = "2";//
            defensa = "0";

            System.out.println("nombre " + ataque);
            System.out.println("salud " + defensa);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        if (id.equals("9")) {
            System.out.println("entregada al cpu");
            ataque = "10";//
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

    }//((((((((((((((((((((()))))))))))))))))))))

    public void repartir() {

    }

}
