package Idiomas;
import Idiomas.Idioma;

public class Espanol implements Idioma{
    @Override
    public String getZero(){
        return "Cero";
    }
    @Override
    public String getFefteen(){
        return "Quince";
    }
    @Override
    public String getThyrty(){
        return "Treinta";
    }
    @Override
    public String getForty(){
        return "Cuarenta";
    }
    @Override
    public String getDeuce(){
        return "Empate";
    }
    @Override
    public String getAvantage(){
        return "Aventaja";
    }
    @Override
    public String getAll(){
        return "All";
    }
    @Override
    public String getWin(){
        return "Gana";
    }
}