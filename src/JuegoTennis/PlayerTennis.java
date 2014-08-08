package JuegoTennis;
import Estadios.*;


public class PlayerTennis{
    private Estadios estadio;
    
    private void setEstadio(Estadios estadio){
        this.estadio = estadio;
    }
    
    private Estadios getEstadio(){
        return this.estadio;
    }
    
    public void iniciarEstadioOaxaca(){
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
}
