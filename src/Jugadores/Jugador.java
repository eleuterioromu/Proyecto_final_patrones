package Jugadores;

public class Jugador implements Personas{
    private static String alias;
    private static String nombre;
    private static String apellido;
    public Jugador(){
        //this.mijugadorx = this.JUGADOR_X;
        //this.mijugadory = this.JUGADOR_Y;
    }
    
    public Jugador(String nombre, String apellido, String alias){
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = alias;
    }
        
    
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getApellidos() {
        return this.apellido;
    }

    @Override
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getAlias() {
        return this.alias;
    }

    @Override
    public String getJugadorX() {
        return "Jugador 1";
    }
    
    @Override
    public String getJugadorY() {
        return "Jugador 2";
    }    
    public void setPuntos(){
        
    }
}