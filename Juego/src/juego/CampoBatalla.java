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
public class CampoBatalla {

    CampoBatalla refCampoBatalla;
    String z1;
    String z2;
    String z3;
    String z4;
    String saludCpu;
    String stringDefensaCpuZ3;
    String stringDefensa2CpuZ4;

    public String getStringDefensa2CpuZ4() {
        return stringDefensa2CpuZ4;
    }

    public void setStringDefensa2CpuZ4(String stringDefensa2CpuZ4) {
        this.stringDefensa2CpuZ4 = stringDefensa2CpuZ4;
    }

    public String getStringDefensaCpuZ3() {
        return stringDefensaCpuZ3;
    }

    public void setStringDefensaCpuZ3(String stringDefensaCpuZ3) {
        this.stringDefensaCpuZ3 = stringDefensaCpuZ3;
    }

    public String getSaludCpu() {
        return saludCpu;
    }

    public void setSaludCpu(String saludCpu) {
//        System.out.println("clase campo batalla------metodo set-----salud del cpu " + saludCpu);
        this.saludCpu = saludCpu;
    }

    public CampoBatalla getRefCampoBatalla() {
        return refCampoBatalla;
    }

    public void setRefCampoBatalla(CampoBatalla refCampoBatalla) {
        this.refCampoBatalla = refCampoBatalla;
    }

    public String getZ1() {
        return z1;
    }

    public void setZ1(String z1) {
        System.out.println("z1= " + z1);
        this.z1 = z1;
    }

    public String getZ2() {
        return z2;
    }

    public void setZ2(String z2) {
        this.z2 = z2;
    }

    public String getZ3() {
        return z3;
    }

    public void setZ3(String z3) {
        System.out.println("z3= " + z3);
        this.z3 = z3;
    }

    public String getZ4() {
        return z4;
    }

    public void setZ4(String z4) {
        this.z4 = z4;
    }

    public void ataqueZ1yZ3(String stringAtaqueJugadorZ1, String stringDefensaCpuZ3, String saludCpu) {
        System.out.println("entro al metodo batalla");
        System.out.println("ataque jugador= " + stringAtaqueJugadorZ1);
        System.out.println("defensa cpu= " + stringDefensaCpuZ3);
        System.out.println(" z1= " + z1 + " z3= " + z3);

//        if (z1.equals("1") && z3.equals("1")) {
        int resultado = 0;
        int ataqueJugador = Integer.parseInt(stringAtaqueJugadorZ1);
        int defensaCPU = Integer.parseInt(stringDefensaCpuZ3);
        if (ataqueJugador > defensaCPU) {
            resultado = ataqueJugador - defensaCPU;
            System.out.println("z1 z3 el resultado de la cuenta del ataque - defensa es = " + resultado);
            int saludActualCPU = Integer.parseInt(saludCpu) - resultado;
            setSaludCpu(Integer.toString(saludActualCPU));
        } else {
            resultado = defensaCPU - ataqueJugador;
            System.out.println("z1 z3 el resultado de la cuenta del ataque - defensa es = " + resultado);
            setStringDefensaCpuZ3(Integer.toString(resultado));
        }

//        if (resultado > 0) {
//            int saludActualCPU = Integer.parseInt(saludCpu) - resultado;
//            setSaludCpu(Integer.toString(saludActualCPU));
//            System.out.println("clase campo batalla---------el resultado actual es " + saludActualCPU);
//
//        } else {
//            int defensaActualCPU = defensaCPU - resultado;
//            System.out.println("la defensa es de " + defensaActualCPU);
//            setStringDefensaCpuZ3(Integer.toString(defensaActualCPU));
//        }
//        }//fin de comparacion de z1 y z3
    }

    public void ataqueZ1yZ4(String stringAtaqueJugadorZ1, String stringDefensa2CpuZ4, String saludCpu) {
        System.out.println("entro al metodo batalla z1 z4");
        System.out.println("ataque jugador= " + stringAtaqueJugadorZ1);
        System.out.println("defensa cpu= " + stringDefensa2CpuZ4);
        System.out.println("salud cpu " + saludCpu);
        int resultado = 0;
        int ataqueJugador = Integer.parseInt(stringAtaqueJugadorZ1);
        int defensaCPU = Integer.parseInt(stringDefensa2CpuZ4);
        if (ataqueJugador > defensaCPU) {
            resultado = ataqueJugador - defensaCPU;
            System.out.println("z1 z4 el resultado de la cuenta del ataque - defensa es = " + resultado);
            int saludActualCPU = Integer.parseInt(saludCpu) - resultado;
            setSaludCpu(Integer.toString(saludActualCPU));
        } else {
            resultado = defensaCPU - ataqueJugador;
            System.out.println("z1 z4 el resultado de la cuenta del ataque - defensa es = " + resultado);
            setStringDefensa2CpuZ4(Integer.toString(resultado));
        }
//        if (z1.equals("1") && z4.equals("1")) {//aca entra si elegije atacar con z1 a z4
//            int ataqueJugador = Integer.parseInt(stringAtaqueJugadorZ1);
//            int defensaCPU = Integer.parseInt(stringDefensa2CpuZ4);
//            int resultado = ataqueJugador - defensaCPU;
//            System.out.println("el resultado de la cuenta del ataque z1 - defensa z4 es = " + resultado);
//            if (resultado > 0) {
//                int saludActualCPU = Integer.parseInt(saludCpu) - resultado;
//                setSaludCpu(Integer.toString(saludActualCPU));
//                System.out.println("clase campo batalla---------z1 z4 el resultado actual es " + saludActualCPU);
//
//            }
//        }
    }

    public void ataqueZ2yZ3(String stringAtaqueJugadorZ2, String stringDefensaCpuZ3, String saludCpu) {
        System.out.println("entro al metodo batalla z2 z3");
        System.out.println("ataque jugador= " + stringAtaqueJugadorZ2);
        System.out.println("defensa cpu= " + stringDefensaCpuZ3);
        System.out.println("salud cpu " + saludCpu);
        int resultado = 0;
        int ataqueJugador = Integer.parseInt(stringAtaqueJugadorZ2);
        int defensaCPU = Integer.parseInt(stringDefensaCpuZ3);
        if (ataqueJugador > defensaCPU) {
            resultado = ataqueJugador - defensaCPU;
            System.out.println("z2 z3 el resultado de la cuenta del ataque - defensa es = " + resultado);
            int saludActualCPU = Integer.parseInt(saludCpu) - resultado;
            setSaludCpu(Integer.toString(saludActualCPU));
        } else {
            resultado = defensaCPU - ataqueJugador;
            System.out.println("z2 z3 el resultado de la cuenta del ataque - defensa es = " + resultado);
            setStringDefensaCpuZ3(Integer.toString(resultado));
        }
//        System.out.println("los z1 y z3 " + z1 + " " + z3);
//        int ataqueJugador = Integer.parseInt(stringAtaqueJugadorZ2);
//        int defensaCPU = Integer.parseInt(stringDefensaCpuZ3);
//        int resultado = ataqueJugador - defensaCPU;
//        if (resultado > 0) {
//            int saludActualCPU = Integer.parseInt(saludCpu) - resultado;
//            setSaludCpu(Integer.toString(saludActualCPU));
//            System.out.println("clase campo batalla---------z2 z3 el resultado actual es " + saludActualCPU);
//
//        }
    }

    public void ataqueZ2yZ4(String stringAtaqueJugadorZ2, String stringDefensa2CpuZ4, String saludCpu) {
         System.out.println("entro al metodo batalla z2 z4");
        System.out.println("ataque jugador= " + stringAtaqueJugadorZ2);
        System.out.println("defensa cpu= " + stringDefensa2CpuZ4);
        System.out.println("salud cpu " + saludCpu);
        
        int resultado = 0;
        int ataqueJugador = Integer.parseInt(stringAtaqueJugadorZ2);
        int defensaCPU = Integer.parseInt(stringDefensa2CpuZ4);
        if (ataqueJugador > defensaCPU) {
            resultado = ataqueJugador - defensaCPU;
            System.out.println("z2 z4 el resultado de la cuenta del ataque - defensa es = " + resultado);
            int saludActualCPU = Integer.parseInt(saludCpu) - resultado;
            setSaludCpu(Integer.toString(saludActualCPU));
        } else {
            resultado = defensaCPU - ataqueJugador;
            System.out.println("z2 z4 el resultado de la cuenta del ataque - defensa es = " + resultado);
            setStringDefensa2CpuZ4(Integer.toString(resultado));
        }
    }
    //comportamiento de maquina
    

}
