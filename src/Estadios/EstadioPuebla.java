package Estadios;

import Idiomas.*;

import JuegoTennis.*;
import static JuegoTennis.Tennis.puntosJugador1;
import static JuegoTennis.Tennis.puntosJugador2;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class EstadioPuebla extends JPanel implements Runnable, KeyListener, Estadios {
    private Tennis refATenis = new Tennis();
    private int contador=0;
    private double xbol;
    private double ybol;
    private double xp1;
    private double yp1;
    private double xp2;
    private double yp2;
    private final double speed = 5.0;
    private final double vel = 5.0;
    private int player1 = 1;
    private int player2 = 1;
    private int bolitaX = 1;
    private int bolitaY = 1;
    int i = 12;

    public EstadioPuebla() {
        super();
        this.xbol = 30;
        this.ybol = 0;
        this.xp1 = 565;
        this.yp1 = 180;
        this.xp2 = 10;
        this.yp2 = 180;
    }

    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D)gr;
        g.setColor(Color.BLACK);
        g.fill(new Ellipse2D.Double(this.xbol, this.ybol, 20, 20));
        g.setColor(Color.BLUE);
        g.fill(new Rectangle2D.Double(this.xp1, this.yp1, 15, 60));
        g.setColor(Color.RED);
        g.fill(new Rectangle2D.Double(this.xp2, this.yp2, 15, 60));
        return;
    }
    
    private int agregarTirosuno(){
        return Tennis.puntosJugador1.size();
    }
    
    private int agregarTirosdos(){
        return Tennis.puntosJugador2.size();
    }
    
    private void AgregarValoresTabla() {
        GUI.Principal.jTable1.setValueAt(refATenis.score(), contador, 0);
        GUI.Principal.jTable1.setValueAt(refATenis.PuntosJugador1(), contador, 1);
        GUI.Principal.jTable1.setValueAt(refATenis.PuntosJugador2(), contador, 2);
        GUI.Principal.jTable1.setValueAt(agregarTirosuno(), contador, 3);
        GUI.Principal.jTable1.setValueAt(agregarTirosdos(), contador, 4); 
    }
    
    private void cambiaLabel() {
        GUI.Principal.jLabel7.setText(refATenis.score());
    }
    
    private void Ganador1() {
        if(refATenis.score().equals(refATenis.getGanador()+": "+refATenis.getJugador1().getJugadorX()) ||
                refATenis.score().equals(refATenis.getGanador()+": "+refATenis.getJugador1().getAlias())){
                       JOptionPane.showMessageDialog(null,refATenis.score());
                       System.exit(0);
                    }else{
                        System.out.println(refATenis.score());
                        System.out.println(refATenis.getTirosJugador1());
                        //System.out.println(refATenis.getPuntosJugador(puntosJugador2));
                        //System.out.println(refATenis.getPuntosJugador(puntosJugador1));
                        //System.out.println(refATenis.getJugador1().getAlias());
                        //System.out.println(refATenis.getJugador1().getJugadorX());
                    }
    }
    
    private void Ganador2() {
        if(refATenis.score().equals(refATenis.getGanador()+": "+refATenis.getJugador2().getJugadorY()) ||
                refATenis.score().equals(refATenis.getGanador()+": "+refATenis.getJugador2().getAlias())){
                       JOptionPane.showMessageDialog(null,refATenis.score());
                        System.exit(0);
                    }else{
                        System.out.println(refATenis.score());
                        System.out.println(refATenis.getTirosJugador2());
                        //System.out.println(refATenis.getPuntosJugador(puntosJugador2));
                        //System.out.println(refATenis.getPuntosJugador(puntosJugador1));
                        //System.out.println(refATenis.getJugador2().getAlias());
                        //System.out.println(refATenis.getJugador2().getJugadorY());
                        
                    }
    }
    
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();

        switch (c) {
                case KeyEvent.VK_DOWN:
                        this.player1 = 0;
                        break;
                case KeyEvent.VK_UP:
                        this.player1 = 1;
                        break;
                case KeyEvent.VK_Z:
                        this.player2 = 0;
                        break;
                case KeyEvent.VK_A:
                        this.player2 = 1;
                        break;
        }
        super.repaint();
        return;
    }

    public void keyReleased(KeyEvent e) {
        return;
    }

    public void keyTyped(KeyEvent e) {
        return;
    }

    public void run() {
        while (true) {
            if (player1 == 0) {
                this.yp1 += this.speed;
                if (this.yp1 > 315) {
                    this.yp1 = 315;
                }
            }

            if (player1 == 1) {
                this.yp1 -= this.speed;
                if (this.yp1 < 0) {
                    this.yp1 = 0;
                }
            }

            if (player2 == 0) {
                this.yp2 += this.speed;
                if (this.yp2 > 315) {
                    this.yp2 = 315;
                }
            }

            if (player2 == 1) {
                this.yp2 -= this.speed;
                if (this.yp2 < 0) {
                    this.yp2 = 0;
                }
            }

            if (bolitaX == 0) {
                this.xbol -= this.vel;
                if (this.xbol < 0) {
                    this.bolitaX = 1;
                    this.xbol = 100;
                    //evento para sumar puntaje lado Derecho
                    System.out.println("punto jugador azul");
                    refATenis.setPuntos(refATenis.getJugador1());
                    AgregarValoresTabla();
                    contador+=1;
                    cambiaLabel();
                    Ganador1();
                }
            }

            if (bolitaX == 1) {
                this.xbol += this.vel;
                if (this.xbol > 570) {
                    this.bolitaX = 0;
                    this.xbol = 360; //
                    //evento para sumar puntaje lado izquierdo
                    System.out.println("punto jugador Rojo");
                    refATenis.setPuntos(refATenis.getJugador2());
                    AgregarValoresTabla();
                    cambiaLabel();
                    contador+=1;
                    Ganador2();
                }
            }

            if (bolitaY == 0) {
                this.ybol -= this.vel;
                if (this.ybol < 0) {
                    this.bolitaY = 1;
                }
            }

            if (bolitaY == 1) {
                this.ybol += this.vel;
                if (this.ybol > 350) {
                    this.bolitaY = 0;
                }
            }


            try {
                Thread.sleep((int)Math.round(30));
            } catch (Exception e) {}

            double check1 = this.yp1-15;
            while (check1 <= this.yp1+60) {
                if (this.xp1 == this.xbol+20 && check1 == this.ybol) {
                    if (player1 == 0) {
                        this.bolitaX = 0;
                        this.bolitaY = 1;
                    }
                    if (player1 == 1) {
                        this.bolitaX = 0;
                        this.bolitaY = 0;
                    }
                }
                check1 += 1.0;
            }

            double check2 = this.yp2-15;
            while (check2 <= this.yp2+60) {
                if (this.xp2+15 == this.xbol && check2 == this.ybol) {
                    if (player2 == 0) {
                        this.bolitaX = 1;
                        this.bolitaY = 1;
                    }
                    if (player2 == 1) {
                        this.bolitaX = 1;
                        this.bolitaY = 0;
                    }
                }
                check2 += 1.0;
            }
            super.repaint();
        }
    }

    @Override
    public void setInicializarCancha() {
        JFrame aux = new JFrame();
            aux.setSize(600, 400);
            aux.setLocation(600, 200);
            aux.setTitle("Tennis");
            aux.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            EstadioPuebla c = new EstadioPuebla();
            aux.add(c);
            aux.addKeyListener(c);
            c.setBackground(Color.LIGHT_GRAY);
            Thread t = new Thread(c);
            t.start();
            aux.setVisible(true);
            aux.setResizable(false);
    }
    
    @Override
    public String getCancha() {
        return null;
    }
}