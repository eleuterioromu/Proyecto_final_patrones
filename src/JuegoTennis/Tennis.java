package JuegoTennis;

import Jugadores.*;
import Idiomas.*;
import java.util.*;

public class Tennis{
    private static Idioma idioma;
    public  static Tennis traductor;
    private Tennis tennis;
    private static Jugador jugador1 = new Jugador();
    private static Jugador jugador2 = new Jugador();
    public static ArrayList puntosJugador1 = new ArrayList();
    public static ArrayList puntosJugador2 = new ArrayList();

    public Tennis(){
        //setTennis();
    }
    
    public void setTennis(){
        //this.tennis = new Tennis();
    }
    public void setPuntos(Jugador jugador){
        if(jugador == jugador1){
            puntosJugador1.add(getIncrementogetPuntajes(getPuntosJugador(puntosJugador1)));
        }else {
            puntosJugador2.add(getIncrementogetPuntajes(getPuntosJugador(puntosJugador2)));
        }
    }
    
    private int getIncrementogetPuntajes(int puntaje){
         return (puntaje < 30)? 15: 10;
    }
    
    public int getPuntosJugador(ArrayList puntos){
        int puntaje = 0;
        for (Object punto : puntos){
            puntaje += (int)punto;
        }
        return puntaje;
    }

    private int puntajeInicial(){
        return (getTirosJugador1() + getTirosJugador2());
    }
    
    private String scoreInicial(){
        return (getZero()+ "-" +getAll());
    }

    public String score(){
        if(puntajeInicial() == 0){
            return scoreInicial();
        }
        if(getTirosJugador1() < 4 && getTirosJugador2() < 1){
           return getTextoPuntaje(getPuntosJugador(puntosJugador1))+ "-" 
                  +getZero();
        }else if(getTirosJugador1() < 1 && getTirosJugador2() < 4){
           return getZero()+ "-" 
                  +getTextoPuntaje(getPuntosJugador(puntosJugador2));
        }
        
        if(getTirosJugador1() >= 3 && getTirosJugador2() >= 3 && 
            getTirosJugador1() == getTirosJugador2()){
            return getIdioma().getDeuce();
        }
        
        if(getTirosJugador1() < 4 && getTirosJugador2() < 4){
           return getTextoPuntaje(getPuntosJugador(puntosJugador1))+ "-" 
                  +getTextoPuntaje(getPuntosJugador(puntosJugador2));
        }
        if(getTirosJugador1() - getTirosJugador2() == 1 && getTirosJugador1() > 3){
            return (jugador1.getAlias() == null)? getAventajaJugador() + ": " + jugador1.getJugadorY(): getAventajaJugador() + ": " + jugador1.getAlias();
        }
        
        if(getTirosJugador2() - getTirosJugador1() == 1 && getTirosJugador2() > 3){
            return (jugador2.getAlias() == null)? getAventajaJugador() + ": " + jugador2.getJugadorY(): getAventajaJugador() + ": " + jugador2.getAlias();
        }        
        if(getTirosJugador1() >= 4 && getTirosJugador2() <= 3){
            return (jugador1.getAlias() == null)? getGanador() + ": " + jugador1.getJugadorX(): getGanador() + ": " + jugador1.getAlias();
        }
        
        if(getTirosJugador1() <= 3 && getTirosJugador2() >= 4){
            return (jugador2.getAlias() == null)? getGanador() + ": " + jugador2.getJugadorY(): getGanador() + ": " + jugador2.getAlias();
        }
        

        
        if(getTirosJugador1() - getTirosJugador2() == 2 && getTirosJugador1() > 3){
            return (jugador1.getAlias() == null)? getGanador() + ": " + jugador1.getJugadorX(): getGanador() + ": " + jugador1.getAlias();
        }
        
        if(getTirosJugador2() - getTirosJugador1() == 2 && getTirosJugador2() > 3){
            return (jugador2.getAlias() == null)? getGanador() + ": " + jugador2.getJugadorY(): getGanador() + ": " + jugador2.getAlias();
        }
        return " ";
    }
    
    private String getTextoPuntaje(int puntaje){
        switch(puntaje){
            case 15: return getIdioma().getFefteen();
            case 30: return getIdioma().getThyrty();
            case 40: return getIdioma().getForty();
            default: return null;
        }
    }
    
    private String getZero(){
        return getIdioma().getZero();
    }

    private String getAll(){
        return getIdioma().getAll();
    }
    
    private String getEmpate(){
        return getIdioma().getDeuce();
    }
    
    private String getAventajaJugador(){
        return getIdioma().getAvantage();
    }
    
    public String getGanador(){
        return getIdioma().getWin();
    }
    
    public int getTirosJugador1(){
        return puntosJugador1.size();
    }
    
    public int getTirosJugador2(){
        return puntosJugador2.size();
    }
    
    public void setIdioma(Idioma idioma){
        this.idioma = idioma;
    }
    
    public Idioma getIdioma(){
        return this.idioma;
    }
    
    public Jugador getJugador1(){
        return this.jugador1;
    }
    
    public Jugador getJugador2(){
        return this.jugador2;
    }
    
    public void agregaPuntoJugador1(){
      Tennis player = new Tennis();
      player.setPuntos(jugador1);  
    }
    
    public void agregaPuntoJugador2(){
      Tennis player = new Tennis();
      player.setPuntos(jugador2);  
    }
    
    public void AgregaScore(){
      Tennis tennis = new Tennis();
      GUI.Principal.jTable1.setValueAt(tennis.score(), 0, 0);
    }
    
    public int PuntosJugador1(){
        return getPuntosJugador(puntosJugador1); 
    }
    
    public int PuntosJugador2(){
        return getPuntosJugador(puntosJugador2); 
    }
    
    public Tennis getTennis(){
        return this.tennis = new Tennis();
    }
    public static void main(String r[]){
        Tennis player = new Tennis();
        player.setIdioma(new Espanol());
        jugador1.setAlias("matt");
        jugador2.setAlias("zack");
        player.setPuntos(jugador1);
        player.setPuntos(jugador1);
        player.setPuntos(jugador1);
        player.setPuntos(jugador1);
        //player.setPuntos(jugador1);
        //player.setPuntos(jugador2);
        //player.setPuntos(jugador2);
        //player.setPuntos(jugador2);
        player.setPuntos(jugador2);
        player.setPuntos(jugador2);
        System.out.println(player.score());
        System.out.println(player.getPuntosJugador(puntosJugador1));
        System.out.println(player.getPuntosJugador(puntosJugador2));
        System.out.println(player.getTirosJugador1());
        System.out.println(Tennis.puntosJugador2.size());
        
    }
}