/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.Vistas;

import juego.CampoBatalla;
import juego.LogicaCPU;
import juego.MazoCartas;
//import juego.Personajes;
import juego.PersonajesCargados;

/**
 *
 * @author Gabriel
 */
public class VistaCampoBatalla extends javax.swing.JFrame {

    boolean borrarCarta1CPU = false;
    boolean borrarCarta2CPU = false;
    boolean borrarCarta3CPU = false;
    boolean borrarCarta1Jugador = false;//esta variable sirve para cuando elijo la carta 1 se pone en true, para despues saber q carta se jugo y borrarla
    boolean borrarCarta2Jugador = false;
    boolean borrarCarta3Jugador = false;
    String controlCarta1Jugador = "0";//sirve para llevar el control si puedo poner la info en el campo de batalla es el caso en q los 2 esten desocupados
//     esto va en la clase campoBatalla
    String controlCarta2 = "0";
    String controlCarta3 = "0";
    String z1;
    String z2;
    String z3;
    String z4;
    String ordenBotonesEleccionZ1Z3 = "";//variable q lleva el oden de presionar los botones de eleccion
    String ordenBotonesEleccionZ2Z4 = "";
    String ordenBotonesEleccionZ1Z4 = "";
    String ordenBotonesEleccionZ2Z3 = "";

    public String getZ2() {
        return z2;
    }

    public void setZ2(String z2) {
        this.z2 = z2;
    }

    public String getZ4() {
        return z4;
    }

    public void setZ4(String z4) {
        this.z4 = z4;
    }

    public String getZ1() {
        return z1;
    }

    public void setZ1(String z1) {
        this.z1 = z1;
    }

    public String getZ3() {
        return z3;
    }

    public void setZ3(String z3) {
        this.z3 = z3;
    }

    /**
     * Creates new form VistaCampoBatalla
     */
//    referencia global
    LogicaCPU refLogicaCPU = new LogicaCPU();

    public VistaCampoBatalla() {
        initComponents();
        setLocationRelativeTo(null);
        //referencias
        PersonajesCargados refPersonajesCargados = new PersonajesCargados();
        MazoCartas refMazoCartas = new MazoCartas();
        CampoBatalla refCampoBatalla = new CampoBatalla();
        LogicaCPU refLogicaCPU = new LogicaCPU();
        //seteo de referencias
        refPersonajesCargados.setRefPersonajesCargados(refPersonajesCargados);
        refMazoCartas.setRefCartas(refMazoCartas);

//        inicializo la ronda en 1 primer vuelta
        jlRonda.setText("1");

        //cargo por primera ves los campos de batalla
        jlCartasBatallaAtaque1Z1Jugador.setText("0");
        jlCartasBatallaDefensa1Z1Jugador.setText("0");
        jlCartasBatallaAtaque2Z2Jugador.setText("0");
        jlCartasBatallaDefensa2Z2Jugador.setText("0");
        //el id se obtiene de la eleccion del personaje en la vista anterior 
        //a modo de ejemplo ahora hago de cuenta q seleccione el perosnaje id=1
        refPersonajesCargados.presentar("1");//le meto el id 1
        tfNombre.setText(refPersonajesCargados.getNombre());
        tfAtaque.setText(refPersonajesCargados.getAtaque());
        tfSaludJugador.setText(refPersonajesCargados.getSalud());
        refPersonajesCargados.presentar("2");//le meto el id 1
        tfNombreJ.setText(refPersonajesCargados.getNombre());
        tfAtaqueJ.setText(refPersonajesCargados.getAtaque());
        jlSaludCPU.setText(refPersonajesCargados.getSalud());
        //-----------------------------------------------------------------

        //cartas repartidas al  humano
        refMazoCartas.declararCartas("2");//estre id seria dado por la clase cartar q viene de la eleccion aleatorio
        jlCartaAtaque1.setText(refMazoCartas.getAtaque());
        jlCartaDefensa1.setText(refMazoCartas.getDefensas());
//        refLogicaCPU.setAtaque1(jlCartaAtaque1.getText());
//        refLogicaCPU.setDefensa1(jlCartaDefensa1.getText());

        refMazoCartas.declararCartas("1");//estre id seria dado por la clase cartar q viene de la eleccion aleatorio
        jlCartaAtaque2.setText(refMazoCartas.getAtaque());
        jlCartaDefensa2.setText(refMazoCartas.getDefensas());
//        refLogicaCPU.setAtaque2(jlCartaAtaque2.getText());
//        refLogicaCPU.setDefensa2(jlCartaDefensa2.getText());

        refMazoCartas.declararCartas("9");//estre id seria dado por la clase cartar q viene de la eleccion aleatorio
        jlCartaAtaque3.setText(refMazoCartas.getAtaque());
        jlCartaDefensa3.setText(refMazoCartas.getDefensas());
//        refLogicaCPU.setAtaque3(jlCartaAtaque3.getText());
//        refLogicaCPU.setDefensa3(jlCartaDefensa3.getText());
        //------------------------------------------------------------------------------------------
//cartas entrgadas al CPU
        refMazoCartas.declararCartas("3");//estre id seria dado por la clase cartar q viene de la eleccion aleatorio
        jlCartaAtaque1CPU.setText(refMazoCartas.getAtaque());
        jlCartaDefensa1CPU.setText(refMazoCartas.getDefensas());

        refMazoCartas.declararCartas("7");//estre id seria dado por la clase cartar q viene de la eleccion aleatorio
        jlCartaAtaque2CPU.setText(refMazoCartas.getAtaque());
        jlCartaDefensa2CPU.setText(refMazoCartas.getDefensas());

        refMazoCartas.declararCartas("10");//estre id seria dado por la clase cartar q viene de la eleccion aleatorio
        jlCartaAtaque3CPU.setText(refMazoCartas.getAtaque());
        jlCartaDefensa3CPU.setText(refMazoCartas.getDefensas());
        //seteo para la clase logica CPU
        refLogicaCPU.setCartaAtaque1(jlCartaAtaque1CPU.getText());
        refLogicaCPU.setCartaDefensa1(jlCartaDefensa1CPU.getText());
        refLogicaCPU.setCartaAtaque2(jlCartaAtaque2CPU.getText());
        refLogicaCPU.setCartaDefensa2(jlCartaDefensa2CPU.getText());
        refLogicaCPU.setCartaAtaque3(jlCartaAtaque3CPU.getText());
        refLogicaCPU.setCartaDefensa3(jlCartaDefensa3CPU.getText());
//---------------------------------------------------------------------------

        setZ1("0");
        setZ2("0");
        setZ3("0");
        setZ4("0");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tfNombreJ = new javax.swing.JLabel();
        jlSaludCPU = new javax.swing.JLabel();
        tfAtaqueJ = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        tfNombre = new javax.swing.JLabel();
        tfSaludJugador = new javax.swing.JLabel();
        tfAtaque = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        rbConfirmaAtaque = new javax.swing.JRadioButton();
        btEnter = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jlCartasBatallaDefensa2Z2Jugador = new javax.swing.JLabel();
        jlCartasBatallaAtaque2Z2Jugador = new javax.swing.JTextField();
        tfCartaPropiedades4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rZ2 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        tfCartaPropiedades5 = new javax.swing.JLabel();
        jlCartasBatallaAtaque1CPUZ3 = new javax.swing.JTextField();
        jlCartasBatallaDefensa1CPUZ3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rZ3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        tfCartaPropiedades6 = new javax.swing.JLabel();
        jlCartasBatallaAtaque2CPUZ4 = new javax.swing.JTextField();
        jlCartasBatallaDefensa2CPUZ4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        rZ4 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jlCartasBatallaAtaque1Z1Jugador = new javax.swing.JTextField();
        tfCartaPropiedades3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlCartasBatallaDefensa1Z1Jugador = new javax.swing.JTextField();
        rZ1 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btCarta1 = new javax.swing.JButton();
        tfCartaPropiedades = new javax.swing.JLabel();
        jlCartaAtaque1 = new javax.swing.JLabel();
        jlCartaDefensa1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btCarta3 = new javax.swing.JButton();
        tfCartaPropiedades2 = new javax.swing.JLabel();
        jlCartaAtaque3 = new javax.swing.JLabel();
        jlCartaDefensa3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btCarta2 = new javax.swing.JButton();
        tfCartaPropiedades1 = new javax.swing.JLabel();
        jlCartaAtaque2 = new javax.swing.JLabel();
        jlCartaDefensa2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        tfCartaPropiedades7 = new javax.swing.JLabel();
        jlCartaAtaque1CPU = new javax.swing.JLabel();
        jlCartaDefensa1CPU = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btCarta1CPU = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        tfCartaPropiedades8 = new javax.swing.JLabel();
        jlCartaAtaque3CPU = new javax.swing.JLabel();
        jlCartaDefensa3CPU = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btCarta3CPU = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        tfCartaPropiedades9 = new javax.swing.JLabel();
        jlCartaAtaque2CPU = new javax.swing.JLabel();
        jlCartaDefensa2CPU = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btCarta2CPU = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlRonda = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("baraja");

        jLabel17.setText("JUGADOR");

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        tfNombreJ.setText("sin personaje");

        jlSaludCPU.setText("400");

        tfAtaqueJ.setText("30");

        jLabel5.setText("ataque");

        jLabel4.setText("salud");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNombreJ, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSaludCPU)
                                    .addComponent(tfAtaqueJ)))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(tfNombreJ)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jlSaludCPU))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tfAtaqueJ))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        jPanel9.setBackground(new java.awt.Color(0, 204, 102));

        tfNombre.setText("sin elegir");

        tfSaludJugador.setText("400");

        tfAtaque.setText("30");

        jLabel11.setText("salud");

        jLabel12.setText("ataque");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(37, 37, 37)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfAtaque)
                                .addComponent(tfSaludJugador)))
                        .addComponent(jLabel12)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(tfNombre)
                            .addGap(28, 28, 28))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfSaludJugador)))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(tfAtaque))
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        jRadioButton2.setText("pasar no hacer nada");

        rbConfirmaAtaque.setText("confirmar el ataque");
        rbConfirmaAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConfirmaAtaqueActionPerformed(evt);
            }
        });

        btEnter.setText("enter");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rbConfirmaAtaque)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEnter)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rbConfirmaAtaque)
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnter)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        jLabel14.setText("zona de combate");

        jPanel8.setBackground(new java.awt.Color(0, 153, 51));

        jlCartasBatallaDefensa2Z2Jugador.setText("0");

        jlCartasBatallaAtaque2Z2Jugador.setText("0");
        jlCartasBatallaAtaque2Z2Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCartasBatallaAtaque2Z2JugadorActionPerformed(evt);
            }
        });

        tfCartaPropiedades4.setText("ataque");

        jLabel18.setText("defensa");

        rZ2.setText("z2");
        rZ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rZ2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCartasBatallaDefensa2Z2Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(tfCartaPropiedades4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCartasBatallaAtaque2Z2Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(rZ2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(rZ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCartaPropiedades4)
                    .addComponent(jlCartasBatallaAtaque2Z2Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jlCartasBatallaDefensa2Z2Jugador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(0, 153, 153));

        tfCartaPropiedades5.setText("ataque");

        jlCartasBatallaAtaque1CPUZ3.setText("0");
        jlCartasBatallaAtaque1CPUZ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCartasBatallaAtaque1CPUZ3ActionPerformed(evt);
            }
        });

        jlCartasBatallaDefensa1CPUZ3.setText("0");
        jlCartasBatallaDefensa1CPUZ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCartasBatallaDefensa1CPUZ3ActionPerformed(evt);
            }
        });

        jLabel10.setText("defensa");

        rZ3.setText("z3");
        rZ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rZ3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCartaPropiedades5)
                    .addComponent(jLabel10))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCartasBatallaAtaque1CPUZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlCartasBatallaDefensa1CPUZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(rZ3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(rZ3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCartasBatallaAtaque1CPUZ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCartaPropiedades5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jlCartasBatallaDefensa1CPUZ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("cpu");

        jLabel20.setText("jugador");

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));

        tfCartaPropiedades6.setText("ataque");

        jlCartasBatallaAtaque2CPUZ4.setText("0");
        jlCartasBatallaAtaque2CPUZ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCartasBatallaAtaque2CPUZ4ActionPerformed(evt);
            }
        });

        jlCartasBatallaDefensa2CPUZ4.setText("0");
        jlCartasBatallaDefensa2CPUZ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCartasBatallaDefensa2CPUZ4ActionPerformed(evt);
            }
        });

        jLabel19.setText("defensa");

        rZ4.setText("z4");
        rZ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rZ4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCartasBatallaDefensa2CPUZ4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(tfCartaPropiedades6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCartasBatallaAtaque2CPUZ4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(rZ4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(rZ4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCartaPropiedades6)
                    .addComponent(jlCartasBatallaAtaque2CPUZ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jlCartasBatallaDefensa2CPUZ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel15.setBackground(new java.awt.Color(0, 153, 51));

        jlCartasBatallaAtaque1Z1Jugador.setText("0");
        jlCartasBatallaAtaque1Z1Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCartasBatallaAtaque1Z1JugadorActionPerformed(evt);
            }
        });

        tfCartaPropiedades3.setText("ataque");

        jLabel8.setText("defensa");

        jlCartasBatallaDefensa1Z1Jugador.setText("0");
        jlCartasBatallaDefensa1Z1Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCartasBatallaDefensa1Z1JugadorActionPerformed(evt);
            }
        });

        rZ1.setText("z1");
        rZ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rZ1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCartaPropiedades3)
                    .addComponent(jLabel8))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCartasBatallaAtaque1Z1Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlCartasBatallaDefensa1Z1Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(rZ1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(rZ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCartasBatallaAtaque1Z1Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCartaPropiedades3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jlCartasBatallaDefensa1Z1Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel23.setText("cartaElegida=1");

        jLabel24.setText("cartaElegida=2");

        jLabel25.setText("cartaElegida=3");

        jLabel26.setText("cartaElegida=4");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel26))
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jPanel11.setBackground(new java.awt.Color(0, 204, 102));

        jLabel2.setText("mis cartas entregadas");

        btCarta1.setText("Carta 1");
        btCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarta1ActionPerformed(evt);
            }
        });

        tfCartaPropiedades.setText("ataque");

        jlCartaAtaque1.setText("0");
        jlCartaAtaque1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlCartaAtaque1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlCartaDefensa1.setText("0");

        jLabel3.setText("defensa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCartaPropiedades)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlCartaAtaque1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlCartaDefensa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btCarta1)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(9, 9, 9)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(btCarta1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCartaPropiedades)
                        .addComponent(jlCartaAtaque1))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jlCartaDefensa1))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btCarta3.setText("Carta3");
        btCarta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarta3ActionPerformed(evt);
            }
        });

        tfCartaPropiedades2.setText("ataque");

        jlCartaAtaque3.setText("0");

        jlCartaDefensa3.setText("0");

        jLabel9.setText("defensa");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfCartaPropiedades2)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCartaDefensa3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCartaAtaque3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(27, 27, 27))
                        .addComponent(btCarta3))
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCartaAtaque3)
                    .addComponent(tfCartaPropiedades2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCartaDefensa3)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(btCarta3)
                    .addGap(49, 49, 49)
                    .addComponent(jLabel9)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btCarta2.setText("Carta 2");
        btCarta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarta2ActionPerformed(evt);
            }
        });

        tfCartaPropiedades1.setText("ataque");

        jlCartaAtaque2.setText("0");

        jlCartaDefensa2.setText("0");

        jLabel7.setText("defensa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlCartaDefensa2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(tfCartaPropiedades1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlCartaAtaque2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btCarta2, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(btCarta2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCartaPropiedades1)
                        .addComponent(jlCartaAtaque2))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jlCartaDefensa2))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(253, 253, 253))
        );

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));

        jLabel13.setText("cpu cartas entregadas");

        tfCartaPropiedades7.setText("ataque");

        jlCartaAtaque1CPU.setText("0");
        jlCartaAtaque1CPU.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlCartaAtaque1CPUAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlCartaDefensa1CPU.setText("0");

        jLabel15.setText("defensa");

        btCarta1CPU.setText("carta 1");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btCarta1CPU)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfCartaPropiedades7)
                        .addComponent(jLabel15))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlCartaAtaque1CPU, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                        .addComponent(jlCartaDefensa1CPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(9, 9, 9)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCarta1CPU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCartaPropiedades7)
                        .addComponent(jlCartaAtaque1CPU))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jlCartaDefensa1CPU))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tfCartaPropiedades8.setText("ataque");

        jlCartaAtaque3CPU.setText("0");
        jlCartaAtaque3CPU.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlCartaAtaque3CPUAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlCartaDefensa3CPU.setText("0");

        jLabel16.setText("defensa");

        btCarta3CPU.setText("carta 3");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCartaPropiedades8)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCartaDefensa3CPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlCartaAtaque3CPU, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCarta3CPU)
                .addGap(22, 22, 22))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btCarta3CPU)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCartaPropiedades8)
                    .addComponent(jlCartaAtaque3CPU))
                .addGap(24, 24, 24)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jlCartaDefensa3CPU))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tfCartaPropiedades9.setText("ataque");

        jlCartaAtaque2CPU.setText("0");
        jlCartaAtaque2CPU.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlCartaAtaque2CPUAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlCartaDefensa2CPU.setText("0");

        jLabel21.setText("defensa");

        btCarta2CPU.setText("carta 2");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCartaPropiedades9)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCartaAtaque2CPU, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jlCartaDefensa2CPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btCarta2CPU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btCarta2CPU)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCartaPropiedades9)
                    .addComponent(jlCartaAtaque2CPU))
                .addGap(24, 24, 24)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jlCartaDefensa2CPU))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jLabel13)
                    .addContainerGap(106, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel13)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        jLabel1.setText("RONDA");

        jLabel27.setText("la cartaElegida es una variabe q usa la CPU  para saber a q carta atacar");

        jLabel28.setText("arregla lo del jugador cuando elegi las 4 opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(jLabel17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(155, 155, 155)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jlRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlCartasBatallaAtaque1Z1JugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCartasBatallaAtaque1Z1JugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartasBatallaAtaque1Z1JugadorActionPerformed

    private void btCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarta1ActionPerformed
//    al presionar el bt1 verifico q todo los datos del campo batalla y el control de carta esten en cero
        borrarCarta1Jugador = true;
        if (jlCartasBatallaAtaque1Z1Jugador.getText().equals("0") && jlCartasBatallaDefensa1Z1Jugador.getText().equals("0") && controlCarta1Jugador.equals("0")) {

            jlCartasBatallaAtaque1Z1Jugador.setText(jlCartaAtaque1.getText());
            jlCartasBatallaDefensa1Z1Jugador.setText(jlCartaDefensa1.getText());
            controlCarta1Jugador = "1";
        }
        if (jlCartasBatallaAtaque2Z2Jugador.getText().equals("0") && jlCartasBatallaDefensa2Z2Jugador.getText().equals("0") && controlCarta1Jugador.equals("0")) {
            jlCartasBatallaAtaque2Z2Jugador.setText(jlCartaAtaque1.getText());
            jlCartasBatallaDefensa2Z2Jugador.setText(jlCartaDefensa1.getText());
        }

    }//GEN-LAST:event_btCarta1ActionPerformed

    private void btCarta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarta2ActionPerformed
        borrarCarta2Jugador = true;
        System.out.println("control carta 2 " + controlCarta2);
        if (jlCartasBatallaAtaque1Z1Jugador.getText().equals("0") && jlCartasBatallaDefensa1Z1Jugador.getText().equals("0") && controlCarta2.equals("0")) {
            jlCartasBatallaAtaque1Z1Jugador.setText(jlCartaAtaque2.getText());
            jlCartasBatallaDefensa1Z1Jugador.setText(jlCartaDefensa2.getText());
            controlCarta2 = "1";
        }
        if (jlCartasBatallaAtaque2Z2Jugador.getText().equals("0") && jlCartasBatallaDefensa2Z2Jugador.getText().equals("0") && controlCarta2.equals("0")) {
            jlCartasBatallaAtaque2Z2Jugador.setText(jlCartaAtaque2.getText());
            jlCartasBatallaDefensa2Z2Jugador.setText(jlCartaDefensa2.getText());
        }

    }//GEN-LAST:event_btCarta2ActionPerformed

    private void btCarta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarta3ActionPerformed
        borrarCarta3Jugador = true;
        if (jlCartasBatallaAtaque1Z1Jugador.getText().equals("0") && jlCartasBatallaDefensa1Z1Jugador.getText().equals("0") && controlCarta3.equals("0")) {
            jlCartasBatallaAtaque1Z1Jugador.setText(jlCartaAtaque3.getText());
            jlCartasBatallaDefensa1Z1Jugador.setText(jlCartaDefensa3.getText());
            controlCarta3 = "1";
        }
        if (jlCartasBatallaAtaque2Z2Jugador.getText().equals("0") && jlCartasBatallaDefensa2Z2Jugador.getText().equals("0") && controlCarta3.equals("0")) {
            jlCartasBatallaAtaque2Z2Jugador.setText(jlCartaAtaque3.getText());
            jlCartasBatallaDefensa2Z2Jugador.setText(jlCartaDefensa3.getText());

        }
    }//GEN-LAST:event_btCarta3ActionPerformed

    private void jlCartasBatallaAtaque2Z2JugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCartasBatallaAtaque2Z2JugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartasBatallaAtaque2Z2JugadorActionPerformed

    private void jlCartaAtaque1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlCartaAtaque1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartaAtaque1AncestorAdded

    private void jlCartasBatallaDefensa1Z1JugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCartasBatallaDefensa1Z1JugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartasBatallaDefensa1Z1JugadorActionPerformed

    private void jlCartasBatallaAtaque1CPUZ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCartasBatallaAtaque1CPUZ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartasBatallaAtaque1CPUZ3ActionPerformed

    private void jlCartasBatallaDefensa1CPUZ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCartasBatallaDefensa1CPUZ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartasBatallaDefensa1CPUZ3ActionPerformed

    private void jlCartasBatallaAtaque2CPUZ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCartasBatallaAtaque2CPUZ4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartasBatallaAtaque2CPUZ4ActionPerformed

    private void jlCartasBatallaDefensa2CPUZ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCartasBatallaDefensa2CPUZ4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartasBatallaDefensa2CPUZ4ActionPerformed

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed

        System.out.println("z1= " + getZ1() + " z2= " + getZ2() + " z3= " + getZ3() + " z4= " + getZ4());
        System.out.println("vida original " + jlSaludCPU.getText());
        CampoBatalla refCampoBatalla = new CampoBatalla();
        refCampoBatalla.setSaludCpu(jlSaludCPU.getText());

//        System.out.println("ordenBotonesEleccion " + ordenBotonesEleccionZ1Z3);
        if (ordenBotonesEleccionZ1Z3.equals("3")) {
//            if (getZ1().equals("1") && getZ3().equals("1")) {
            refCampoBatalla.setStringDefensaCpuZ3(jlCartasBatallaDefensa1CPUZ3.getText());
            refCampoBatalla.ataqueZ1yZ3(jlCartasBatallaAtaque1Z1Jugador.getText(), jlCartasBatallaDefensa1CPUZ3.getText(), jlSaludCPU.getText());
            jlSaludCPU.setText(refCampoBatalla.getSaludCpu());
            jlCartasBatallaDefensa1CPUZ3.setText(refCampoBatalla.getStringDefensaCpuZ3());
//       String TomoDefensaJugadoPorJugador=jlCartasBatallaDefensa1Z1.getText(); 
//refLogicaCPU.setDefensa1(TomoDefensaJugadoPorJugador);
//refLogicaCPU.reconocerCartas();
        }

        if (ordenBotonesEleccionZ1Z4.equals("1")) {
//            if (getZ1().equals("1") && getZ4().equals("1")) {
            System.out.println("entro z1 z4");
            refCampoBatalla.ataqueZ1yZ4(jlCartasBatallaAtaque1Z1Jugador.getText(), jlCartasBatallaDefensa2CPUZ4.getText(), jlSaludCPU.getText());
            jlSaludCPU.setText(refCampoBatalla.getSaludCpu());
            jlCartasBatallaDefensa2CPUZ4.setText(refCampoBatalla.getStringDefensa2CpuZ4());
//                reinicio();
//            }
        }

        if (ordenBotonesEleccionZ2Z3.equals("2")) {
//            if (getZ2().equals("1") && getZ3().equals("1")) {
            System.out.println("entro z2 z3");
            refCampoBatalla.ataqueZ2yZ3(jlCartasBatallaAtaque2Z2Jugador.getText(), jlCartasBatallaDefensa1CPUZ3.getText(), jlSaludCPU.getText());
            jlSaludCPU.setText(refCampoBatalla.getSaludCpu());
            jlCartasBatallaDefensa1CPUZ3.setText(refCampoBatalla.getStringDefensaCpuZ3());

        }
        if (ordenBotonesEleccionZ2Z4.equals("4")) {
//            if (getZ2().equals("1") && getZ4().equals("1")) {
//    System.out.println("entro z2 z4");
            refCampoBatalla.ataqueZ2yZ4(jlCartasBatallaAtaque2Z2Jugador.getText(), jlCartasBatallaDefensa2CPUZ4.getText(), jlSaludCPU.getText());
            jlSaludCPU.setText(refCampoBatalla.getSaludCpu());
            jlCartasBatallaDefensa2CPUZ4.setText(refCampoBatalla.getStringDefensa2CpuZ4());

//            }
        }
//        refCampoBatalla.(,, jlCartasBatallaDefensa2CPUZ4.getText(), jlSaludCPU.getText(), getZ1(), getZ3(), getZ4());
        //reconosco las cartas q le tocaron a la CPU

//        refLogicaCPU.reconocerCartas();
//produscoAtaqueCPU();
        seteoCartasCPU();
        reinicioDatos();


    }//GEN-LAST:event_btEnterActionPerformed
    public void seteoCartasCPU() {
        //necesito llevarme las tres cartas a la clase logica de CPU
        refLogicaCPU.setCartaAtaque1(jlCartaAtaque1CPU.getText());
        refLogicaCPU.setCartaDefensa1(jlCartaDefensa1CPU.getText());

        refLogicaCPU.setCartaAtaque2(jlCartaAtaque2CPU.getText());
        refLogicaCPU.setCartaDefensa2(jlCartaDefensa2CPU.getText());

        refLogicaCPU.setCartaAtaque3(jlCartaAtaque3CPU.getText());
        refLogicaCPU.setCartaDefensa3(jlCartaDefensa3CPU.getText());

        //------------------------------------------------------------------------
//        String TomoDefensaJugadoPorJugador = jlCartasBatallaDefensa1Z1.getText();
//        refLogicaCPU.elegirCartaParaJugarCPU(TomoDefensaJugadoPorJugador);
    }

    public void resultadoLogicaCPU(String resultadoEleccion) {
        System.out.println("valor del resultado de eleccion= " + resultadoEleccion);
        //el resultado de la eleccion es un numero que  esta asociado a una accion especifica
        if (resultadoEleccion.equals("1")) {//significa que la defensa1 es mayor q la defensa2, entonces tengo q jugar las cartas 1 y 3
//          CPU  juega las mejores cartas de ataque que tiene
            //carta 1

            jlCartasBatallaAtaque1CPUZ3.setText(jlCartaAtaque1CPU.getText());
            jlCartasBatallaDefensa1CPUZ3.setText(jlCartaDefensa1CPU.getText());
            //carta 2
            jlCartasBatallaAtaque2CPUZ4.setText(jlCartaAtaque3CPU.getText());
            jlCartasBatallaDefensa2CPUZ4.setText(jlCartaDefensa3CPU.getText());
            borrarCarta1CPU = true;
            borrarCarta3CPU = true;

        }
        if (resultadoEleccion.equals("2")) {//significa que la defensa1 es menor y que la defensa2 es menor q la defensa3, entonces juego carta2  carta3
            //carta 1
            jlCartasBatallaAtaque1CPUZ3.setText(jlCartaAtaque2CPU.getText());
            jlCartasBatallaDefensa1CPUZ3.setText(jlCartaDefensa2CPU.getText());

            //carta 2
            jlCartasBatallaAtaque2CPUZ4.setText(jlCartaAtaque3CPU.getText());
            jlCartasBatallaDefensa2CPUZ4.setText(jlCartaDefensa3CPU.getText());
      borrarCarta2CPU = true;
  borrarCarta3CPU = true;
        }
        refLogicaCPU.LogicaFuncionAtaque(jlCartasBatallaAtaque1CPUZ3.getText(), jlCartasBatallaAtaque2CPUZ4.getText(), jlCartasBatallaDefensa1Z1Jugador.getText(), jlCartasBatallaDefensa2Z2Jugador.getText(), tfSaludJugador.getText());
        tfSaludJugador.setText(refLogicaCPU.getSaludJugadorActualizada());   //actualizo la energia de la maquina ver si cinviene hacer un metodo para esta accion
    }

    public void produscoAtaqueCPU() {
//
//        String stringResultado = Integer.toString(refLogicaCPU.getResultado());
//
//        tfSalud.setText(stringResultado);
//        System.out.println("la actualizaicon de la vida es " + stringResultado);
//    
//        if(tipoAtaque.equals("1")){
//            
//        }
    }

    public void reinicioDatos() {

        if (borrarCarta1Jugador == true) {
            jlCartaAtaque1.setText("0");
            jlCartaDefensa1.setText("0");

        }
        if (borrarCarta2Jugador == true) {
            jlCartaAtaque2.setText("0");
            jlCartaDefensa2.setText("0");

        }
        if (borrarCarta3Jugador == true) {
            jlCartaAtaque3.setText("0");
            jlCartaDefensa3.setText("0");

        }
        if (borrarCarta1CPU == true) {
            jlCartaAtaque1CPU.setText("0");
            jlCartaDefensa1CPU.setText("0");

        }
        if (borrarCarta3CPU == true) {
            jlCartaAtaque3CPU.setText("0");
            jlCartaDefensa3CPU.setText("0");

        }
//         volver a cero los Z  y q vuelva a deseleccionarse el radio
//       true;
//borrarCarta3CPU=true;

        jlCartasBatallaAtaque1Z1Jugador.setText("0");
        jlCartasBatallaDefensa1Z1Jugador.setText("0");

        jlCartasBatallaAtaque2Z2Jugador.setText("0");
        jlCartasBatallaDefensa2Z2Jugador.setText("0");

        jlCartasBatallaAtaque1CPUZ3.setText("0");
        jlCartasBatallaDefensa1CPUZ3.setText("0");

        jlCartasBatallaAtaque2CPUZ4.setText("0");
        jlCartasBatallaDefensa2CPUZ4.setText("0");

        setZ1("0");
        setZ2("0");
        setZ3("0");
        setZ4("0");
rbConfirmaAtaque.setSelected(false);
rZ1.setSelected(false);
rZ2.setSelected(false);
rZ3.setSelected(false);
rZ4.setSelected(false);
//        llevando la cuenta de las rondas
        int intRonda = Integer.parseInt(jlRonda.getText());

        intRonda = intRonda + 1;
        jlRonda.setText(Integer.toString(intRonda));
        // algo
//        repartir carta a la cpu donde vale cero mgggggg
//                llllll
//                klllkkjjj
//                        hfg
//                        hh
//frjfjfgjgjgjj
//jjj
    }
    private void rZ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rZ1ActionPerformed
//        selecciono z1
//        CampoBatalla refCampoBatalla;
        setZ1("1");
//        ordenBotonesEleccionZ1Z4 = "0";
    }//GEN-LAST:event_rZ1ActionPerformed

    private void rZ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rZ3ActionPerformed
//        selecciono z3
//        CampoBatalla refCampoBatalla = new CampoBatalla();
        if (getZ2().equals("1")) {
            setZ3("1");

            ordenBotonesEleccionZ2Z3 = "2";
        }

        if (getZ1().equals("1")) {
//            if (ordenBotonesEleccionZ2Z3.equals("0")) {
            setZ3("1");
//            setZ1("0");
            ordenBotonesEleccionZ1Z3 = "3";

        }

    }//GEN-LAST:event_rZ3ActionPerformed

    private void rZ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rZ4ActionPerformed

        if (getZ2().equals("1")) {
            setZ4("1");
            ordenBotonesEleccionZ2Z4 = "4";
        }
        if (getZ1().equals("1")) {
            setZ4("1");
            ordenBotonesEleccionZ1Z4 = "1";
        }
    }//GEN-LAST:event_rZ4ActionPerformed

    private void rZ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rZ2ActionPerformed
        setZ2("1");
//        ordenBotonesEleccionZ1Z4 = "0";
    }//GEN-LAST:event_rZ2ActionPerformed

    private void jlCartaAtaque1CPUAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlCartaAtaque1CPUAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartaAtaque1CPUAncestorAdded

    private void jlCartaAtaque3CPUAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlCartaAtaque3CPUAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartaAtaque3CPUAncestorAdded

    private void jlCartaAtaque2CPUAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlCartaAtaque2CPUAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCartaAtaque2CPUAncestorAdded

    private void rbConfirmaAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConfirmaAtaqueActionPerformed
//       refLogicaCPU.elegirCartaParaJugarCPU(jlCartasBatallaAtaque1Z1Jugador.getText(), jlCartasBatallaDefensa1Z1Jugador.getText(), jlCartasBatallaAtaque2Z2Jugador.getText(), jlCartasBatallaDefensa2Z2Jugador.getText());
//evio las cartas q tiene la cpu para poder dar un resultado de eleccion
        refLogicaCPU.resultadoCartaParaJugarCPU(jlCartaAtaque1CPU.getText(), jlCartaDefensa1CPU.getText(), jlCartaAtaque2CPU.getText(), jlCartaDefensa2CPU.getText(), jlCartaAtaque3CPU.getText(), jlCartaDefensa3CPU.getText());
        resultadoLogicaCPU(refLogicaCPU.getResultadoEleccion());
    }//GEN-LAST:event_rbConfirmaAtaqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCampoBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCampoBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCampoBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCampoBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCampoBatalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarta1;
    private javax.swing.JLabel btCarta1CPU;
    private javax.swing.JButton btCarta2;
    private javax.swing.JLabel btCarta2CPU;
    private javax.swing.JButton btCarta3;
    private javax.swing.JLabel btCarta3CPU;
    private javax.swing.JButton btEnter;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel jlCartaAtaque1;
    private javax.swing.JLabel jlCartaAtaque1CPU;
    private javax.swing.JLabel jlCartaAtaque2;
    private javax.swing.JLabel jlCartaAtaque2CPU;
    private javax.swing.JLabel jlCartaAtaque3;
    private javax.swing.JLabel jlCartaAtaque3CPU;
    private javax.swing.JLabel jlCartaDefensa1;
    private javax.swing.JLabel jlCartaDefensa1CPU;
    private javax.swing.JLabel jlCartaDefensa2;
    private javax.swing.JLabel jlCartaDefensa2CPU;
    private javax.swing.JLabel jlCartaDefensa3;
    private javax.swing.JLabel jlCartaDefensa3CPU;
    private javax.swing.JTextField jlCartasBatallaAtaque1CPUZ3;
    private javax.swing.JTextField jlCartasBatallaAtaque1Z1Jugador;
    private javax.swing.JTextField jlCartasBatallaAtaque2CPUZ4;
    private javax.swing.JTextField jlCartasBatallaAtaque2Z2Jugador;
    private javax.swing.JTextField jlCartasBatallaDefensa1CPUZ3;
    private javax.swing.JTextField jlCartasBatallaDefensa1Z1Jugador;
    private javax.swing.JTextField jlCartasBatallaDefensa2CPUZ4;
    private javax.swing.JLabel jlCartasBatallaDefensa2Z2Jugador;
    private javax.swing.JLabel jlRonda;
    private javax.swing.JLabel jlSaludCPU;
    private javax.swing.JRadioButton rZ1;
    private javax.swing.JRadioButton rZ2;
    private javax.swing.JRadioButton rZ3;
    private javax.swing.JRadioButton rZ4;
    private javax.swing.JRadioButton rbConfirmaAtaque;
    private javax.swing.JLabel tfAtaque;
    private javax.swing.JLabel tfAtaqueJ;
    private javax.swing.JLabel tfCartaPropiedades;
    private javax.swing.JLabel tfCartaPropiedades1;
    private javax.swing.JLabel tfCartaPropiedades2;
    private javax.swing.JLabel tfCartaPropiedades3;
    private javax.swing.JLabel tfCartaPropiedades4;
    private javax.swing.JLabel tfCartaPropiedades5;
    private javax.swing.JLabel tfCartaPropiedades6;
    private javax.swing.JLabel tfCartaPropiedades7;
    private javax.swing.JLabel tfCartaPropiedades8;
    private javax.swing.JLabel tfCartaPropiedades9;
    private javax.swing.JLabel tfNombre;
    private javax.swing.JLabel tfNombreJ;
    private javax.swing.JLabel tfSaludJugador;
    // End of variables declaration//GEN-END:variables
}
