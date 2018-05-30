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
public class PersonajesCargados {

//hacer 6 vectores en total un vector para cada personaje y setearle los atributos 
    String id;
    String nombre;
    String salud;
    String ataque;

//    String id2;
//    String nombre2;
//    String salud2;
//    String ataque2;
//    String defensa2;
    //referencias
    PersonajesCargados refPersonajesCargados;

    public PersonajesCargados getRefPersonajesCargados() {
        return refPersonajesCargados;
    }

    public void setRefPersonajesCargados(PersonajesCargados refPersonajesCargados) {
        this.refPersonajesCargados = refPersonajesCargados;
    }

//    public String getId2() {
//        return id2;
//    }
//
//    public void setId2(String id2) {
//        this.id2 = id2;
//    }
//
//    public String getNombre2() {
//        return nombre2;
//    }
//
//    public void setNombre2(String nombre2) {
//        this.nombre2 = nombre2;
//    }
//
//    public String getSalud2() {
//        return salud2;
//    }
//
//    public void setSalud2(String salud2) {
//        this.salud2 = salud2;
//    }
//
//    public String getAtaque2() {
//        return ataque2;
//    }
//
//    public void setAtaque2(String ataque2) {
//        this.ataque2 = ataque2;
//    }
//
//    public String getDefensa2() {
//        return defensa2;
//    }
//
//    public void setDefensa2(String defensa2) {
//        this.defensa2 = defensa2;
//    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        System.out.println("id " + id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("nombre " + nombre);
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public void presentar(String id) {
//        hacer el seto
        if (id.equals("1")) {
            nombre = "rey";//
            salud = "450";
            ataque = "70";

            System.out.println("nombre " + nombre);
            System.out.println("salud " + salud);
            System.out.println("ataque " + ataque);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }

        if (id.equals("2")) {
            nombre = "ren";//
            salud = "450";
            ataque = "70";

            System.out.println("nombre " + nombre);
            System.out.println("salud " + salud);
            System.out.println("ataque " + ataque);

            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }

//        for (int i = 0; i < jugadores.length; i++) {
//          String dato=  jugadores[i];
//        }
    }

    public void elegirJugadores(String[] jugadores) {
//            logica de elegir entre los 6 vectores con la parte grfica
    }
}
