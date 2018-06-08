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
public class LogicaCPU {

//    /variables q tienen q ser reinicadas
    int cartaElegida1 = 0;//lleva el control de q se juega la carta 1
    int cartaElegida2 = 0;//lleva el control de q se juega la carta 2
//    int cartaElegida3 = 0;
    int cartaElegida4 = 0;
    int comodin = 0;//sirve para diferenciar estados iguales pero de distintos ordenes
//----------------------------------------------------------------------------------------------
    String CartaAtaque1 = "0";
    String CartaDefensa1 = "0";
    String CartaAtaque2 = "0";
    String CartaDefensa2 = "0";
    String CartaAtaque3 = "0";
    String CartaDefensa3 = "0";
    String resultadoEleccion = "";
    String saludJugadorActualizada = "";

    public String getSaludJugadorActualizada() {
        return saludJugadorActualizada;
    }

    public void setSaludJugadorActualizada(String saludJugadorActualizada) {
        this.saludJugadorActualizada = saludJugadorActualizada;
    }

    public String getResultadoEleccion() {
        return resultadoEleccion;
    }

    public void setResultadoEleccion(String resultadoEleccion) {
        this.resultadoEleccion = resultadoEleccion;
    }

    public String getCartaAtaque1() {
        return CartaAtaque1;
    }

    public void setCartaAtaque1(String CartaAtaque1) {
        this.CartaAtaque1 = CartaAtaque1;
    }

    public String getCartaDefensa1() {
        return CartaDefensa1;
    }

    public void setCartaDefensa1(String CartaDefensa1) {
        this.CartaDefensa1 = CartaDefensa1;
    }

    public String getCartaAtaque2() {
        return CartaAtaque2;
    }

    public void setCartaAtaque2(String CartaAtaque2) {
        this.CartaAtaque2 = CartaAtaque2;
    }

    public String getCartaDefensa2() {
        return CartaDefensa2;
    }

    public void setCartaDefensa2(String CartaDefensa2) {
        this.CartaDefensa2 = CartaDefensa2;
    }

    public String getCartaAtaque3() {
        return CartaAtaque3;
    }

    public void setCartaAtaque3(String CartaAtaque3) {
        this.CartaAtaque3 = CartaAtaque3;
    }

    public String getCartaDefensa3() {
        return CartaDefensa3;
    }

    public void setCartaDefensa3(String CartaDefensa3) {
        this.CartaDefensa3 = CartaDefensa3;
    }

//llega la carta reparitda del mazo
    public void reconocerCartas() {
        System.out.println("Logica CPU");
        System.out.println("reconociendo Carta 1");
        System.out.println("ataque1= " + getCartaAtaque1());
        System.out.println("defensa1= " + getCartaDefensa1());
        System.out.println("---------------------------------------");
        System.out.println("reconociendo Carta 2");
        System.out.println("ataque2= " + getCartaAtaque2());
        System.out.println("defensa2= " + getCartaDefensa2());
        System.out.println("---------------------------------------");
        System.out.println("reconociendo Carta 3");
        System.out.println("ataque3= " + getCartaAtaque3());
        System.out.println("defensa3= " + getCartaDefensa3());

    }

    public void resultadoCartaParaJugarCPU(String carta1Ataque, String carta1Defensa, String carta2Ataque, String carta2Defensa, String carta3Ataque, String carta3Defensa) {
        //elige de las tres cartas las dos mejores de ataque q tnega
        System.out.println("clase logicaCPU---->resultadoCartaJugarCPU------->ataqueCPU1= " + carta1Ataque + " defensaCPU1= " + carta1Defensa + " ataqueCPU2= " + carta2Ataque + " defensaCPU2= " + carta2Defensa + " ataqueCPU3= " + carta3Ataque + " defensaCPU3= " + carta3Defensa);
        int defensa1 = Integer.parseInt(carta1Defensa);
        int defensa2 = Integer.parseInt(carta2Defensa);
        int defensa3 = Integer.parseInt(carta3Defensa);

        //voy a comparar entre dos cartas para saber cuales osn las q tengo q elegir
        if (defensa1 > defensa2) {

            if (defensa2 > defensa3) {
                setResultadoEleccion("3");
            } else {
                setResultadoEleccion("1");//significa que la defensa1 es mayor q la dos entonces tengo q jugAR LAS cartas 1 y 3

            }

        } else {
            if (defensa2 > defensa3) {
                setResultadoEleccion("4");//significa que la defensa1 es menor q la segunda entonces tengo q jugAR LAS cartas 2 y 3
            } else {
                setResultadoEleccion("2");//significa que la defensa1 es menor y que la defensa2 es menor q la defensa3
            }
        }

    }
//            System.out.println("carta resulyado logica cpu " + getCarta());

    public void LogicaFuncionAtaque(String ataque1CPU, String ataque2CPU, String defensaJugador1, String defensaJugador2, String saludJugador) {//este metodo es en funcion de ver la defensa nada mas 
//aca la CPU elije el orden de que carta atacar mirando siempre la menor defensa del jugador
        int resultadoParcial1 = 0;
        int resultadoParcial2 = 0;
        int resultadoParcialTotal = 0;
        int intDefensaJugador1 = Integer.parseInt(defensaJugador1);
        int intDefensaJugador2 = Integer.parseInt(defensaJugador2);
        int intAtaqueCPU1 = Integer.parseInt(ataque1CPU);
        int intAtaqueCPU2 = Integer.parseInt(ataque2CPU);
        int intSalud = Integer.parseInt(saludJugador);

        System.out.println("CLASE LOGICA CPU ---->logicaFuncionAtaque---->" + intAtaqueCPU1 + " " + intAtaqueCPU2 + " " + intDefensaJugador1 + " " + intDefensaJugador2);

        if (intAtaqueCPU1 > intAtaqueCPU2) {
            cartaElegida1 = 1;
            if (intDefensaJugador1 > intDefensaJugador2) {
                cartaElegida2 = 1;
                comodin = 1;
                resultadoParcial1 = intAtaqueCPU1 - intDefensaJugador2;
//                resultadoParcial1 = intSalud - resultadoParcial1;
//                setSaludJugadorActualizada(Integer.toString(resultadoParcial1));
            } else {
//                System.out.println("mmmm");
//                resultadoParcial1 = intAtaqueCPU1 - intDefensaJugador1;
//                resultadoParcial1 = intSalud - resultadoParcial1;
//                setSaludJugadorActualizada(Integer.toString(resultadoParcial1));
            }

        } else {
            cartaElegida2 = 1;///sirve para q la maquina sepa q carta jugo
            System.out.println("cartaElegida2= " + cartaElegida2);
            if (intDefensaJugador1 > intDefensaJugador2) {
                cartaElegida4 = 1;//sirve para q la maquina sepa q carta juego
                resultadoParcial1 = intAtaqueCPU2 - intDefensaJugador2;
                if (resultadoParcial1 <= -1) {//esta comparacion sirve para cuando las defensas del jugador sean mayor al atq del CPU enteonces deja ocmo esta la energia
//                se trendria q actualizar el resultado en la defensa
                    System.out.println("el resultado se lo tengo q poner a la defensa del jugador");
                    resultadoParcial1 = 0;
                }
//resultadoParcial1 = intSalud - resultadoParcial1;
                System.out.println("resultado parcial 1= " + resultadoParcial1 + " cartaElegida4= " + cartaElegida4);
                if (resultadoParcial1 <= -1) {//esta comparacion sirve para cuando las defensas del jugador sean mayor al atq del CPU enteonces deja ocmo esta la energia
//                se trendria q actualizar el resultado en la defensa
                    System.out.println("el resultado se lo tengo q poner a la defensa del jugador");
//                    setSaludJugadorActualizada(Integer.toString(intSalud));
                } else {

//                    resultadoParcial1 = intSalud - resultadoParcial1;
//                    setSaludJugadorActualizada(Integer.toString(resultadoParcial1));
                }
            } else {
                cartaElegida1 = 1;//sirve para q la maquina sepa q carta juego
                comodin = 2;
                resultadoParcial1 = intAtaqueCPU2 - intDefensaJugador1;
                System.out.println("resultado parcaial 1= " + resultadoParcial1);
                if (resultadoParcial1 <= -1) {//esta comparacion sirve para cuando las defensas del jugador sean mayor al atq del CPU enteonces deja ocmo esta la energia
//                se trendria q actualizar el resultado en la defensa
                    System.out.println("el resultado se lo tengo q poner a la defensa del jugador");
                    resultadoParcial1 = 0;
                }
//                resultadoParcial1 = intSalud - resultadoParcial1;
//                setSaludJugadorActualizada(Integer.toString(resultadoParcial1));

            }
        }
        //estos if son para comparar las dos primeras cartas elegidas por la CPU-- cuando elijo la primer carta y la segunda me dan como resultadosParcial1 
//el comodin es para diferenciar las distintas posibilidades de combinaciones OJO hay q pasar por todas las posibilidades para ver q funcionen

        if (cartaElegida2 == 1 && cartaElegida1 == 1 && comodin == 1) {
            // entonces selecciona los otras dos por defecto 
            resultadoParcial2 = intAtaqueCPU2 - intDefensaJugador1;
//            System.out.println("resultado parcaial 2= " + resultadoParcial2);
//            if (resultadoParcial2 < -1) {//es para cuando me da negativo
//                resultadoParcial2 = 0;
//            }
        }

        if (cartaElegida2 == 1 && cartaElegida1 == 1 && comodin == 2) {
            // entonces selecciona los otras dos por defecto 
            resultadoParcial2 = intAtaqueCPU1 - intDefensaJugador2;
            System.out.println("resultado parcaial 2= " + resultadoParcial2);
            if (resultadoParcial2 < -1) {//es para cuando me da negativo
                resultadoParcial2 = 0;
            }
        }
        if (cartaElegida2 == 1 && cartaElegida4 == 1) {
            resultadoParcial2 = intAtaqueCPU1 - intDefensaJugador1;
            System.out.println("resultado parcaial 2= " + resultadoParcial2);
            if (resultadoParcial2 < -1) {//es para cuando me da negativo
                resultadoParcial2 = 0;
            }
//                resultadoParcial = intSalud - resultadoParcial;
//                setSaludJugadorActualizada(Integer.toString(resultadoParcial));
        }
        setSaludJugadorActualizada(Integer.toString(intSalud - (resultadoParcial1 + resultadoParcial2)));
//resultadoParcialTotal =intSalud-(resultadoParcial1+resultadoParcial2);
//        System.out.println("resultado parcial total= "+resultadoParcialTotal);

//        setSaludJugadorActualizada(Integer.toString(resultadoParcialTotal));
    }
//        if (intDefensaJugador1 > intDefensaJugador2) {
//            if (intAtaqueCPU1 > intDefensaJugador2) {
//                resultado = intSalud - intAtaqueCPU1;
//                setResultado(resultado);
//                System.out.println("rrr " + resultado);
//            } else {
//                resultado = intSalud - intAtaqueCPU1;
//                setResultado(resultado);
//                System.out.println("en el metodo funcionAtaque---> el resultado es= " + resultado);
//            }
//        }

    public void LogicaFuncionDefensa() {//este metodo es en funcion de ver la defensa nada mas 

    }

    public void reinicio() {
        int cartaElegida1 = 0;//lleva el control de q se juega la carta 1
        int cartaElegida2 = 0;//lleva el control de q se juega la carta 2
//    int cartaElegida3 = 0;
        int cartaElegida4 = 0;
        int comodin = 0;//sirve para diferenciar estados iguales pero de distintos ordenes
    }
}
