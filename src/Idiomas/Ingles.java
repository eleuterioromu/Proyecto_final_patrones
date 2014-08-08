package Idiomas;
import Idiomas.Idioma;

public class Ingles implements Idioma{
    @Override
    public String getZero(){
        return "Zero";
    }
    @Override
    public String getFefteen(){
        return "Fefteen";
    }
    @Override
    public String getThyrty(){
        return "Thirty";
    }
    @Override
    public String getForty(){
        return "Forty";
    }
    @Override
    public String getDeuce(){
        return "Deuce";
    }
    @Override
    public String getAvantage(){
        return "Avantage";
    }
    @Override
    public String getAll(){
        return "All";
    }
    @Override
    public String getWin(){
        return "Win";
    }
}