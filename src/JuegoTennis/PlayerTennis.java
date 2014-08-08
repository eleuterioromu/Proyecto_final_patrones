package JuegoTennis;
import Estadios.*;
//import static JuegoTennis.Tennis.player;

public class PlayerTennis{
    private Estadios estadio;
    
    private void setEstadio(Estadios estadio){
        this.estadio = estadio;
    }
    
    private Estadios getEstadio(){
        return this.estadio;
    }
    
    public void iniciarEstadioOaxaca(){
        //getEstadio().setInicializarCancha();
        PlayerTennis player = new PlayerTennis();
        player.setEstadio(new EstadioOaxaca());
        player.getEstadio().setInicializarCancha();
    }
    
    public void iniciarEstadioMexico(){
        PlayerTennis player = new PlayerTennis();        
        player.setEstadio(new EstadioMexico());
        player.getEstadio().setInicializarCancha();
    }
    
    public void iniciarEstadioPuebla(){
        PlayerTennis player = new PlayerTennis();        
        player.setEstadio(new EstadioPuebla());
        player.getEstadio().setInicializarCancha();
    }
    
    
    private static Tennis player;
   /* public static void main(String []arg){
        
        
        //System.out.println(player.getCancha().getCancha());
        //player.getCancha();

    }*/
}

/* Codigo de prueba injection dependency para el jugador
player.setJugador(new Jugador("matt", "mattews", "zack"));
player.setJugador(new Jugador("matt", "mattews", "Leo"));
Jugador jugador1 = (Jugador)puntosJugador1.get(0);
Jugador jugador2 = (Jugador)puntosJugador2.get(0);
System.out.println(jugador1.getAlias());
System.out.println(jugador2.getAlias());
*/

        /* Informacion del jugador
        jugador1.setAlias("matt");
        jugador2.setAlias("zack");
        System.out.println(player.getJugador().getNombre());
        System.out.println(player.getJugador().getApellidos());
        System.out.println(player.getJugador().getAlias());
        */

        /* prueba general del juego de tennis
        player.setPuntos(jugador1);
        player.setPuntos(jugador1);
        player.setPuntos(jugador1);
        player.setPuntos(jugador1);
        player.setPuntos(jugador1);
        //player.setPuntos(jugador2);
        player.setPuntos(jugador2);
        player.setPuntos(jugador2);
        player.setPuntos(jugador2);
        player.setPuntos(jugador2);
        System.out.println(player.score());
        System.out.println(player.getPuntosJugador(puntosJugador1));
        System.out.println(player.getPuntosJugador(puntosJugador2));
        System.out.println(player.getTirosJugador1());
        System.out.println(Tennis.puntosJugador2.size());
        */