package Jugadores;
public interface Personas{
    public abstract String getAlias();
    public abstract String getNombre();
    public abstract String getApellidos();
    public abstract String getJugadorX();
    public abstract String getJugadorY();
    
    public abstract void setAlias(String alias);
    public abstract void setNombre(String nombre);
    public abstract void setApellidos(String apellido);
}