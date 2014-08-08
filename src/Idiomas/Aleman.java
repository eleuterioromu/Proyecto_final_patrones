package Idiomas;
import Idiomas.Idioma;
public class Aleman implements Idioma{
    @Override
    public String getZero(){
        return "Liebe";
    }
    @Override
    public String getFefteen(){
        return "Funfzehn";
    }
    @Override
    public String getThyrty(){
        return "DreiBig";
    }
    @Override
    public String getForty(){
        return "Vierzig";
    }
    @Override
    public String getDeuce(){
        return "Spieler bewegt";
    }
    @Override
    public String getAvantage(){
        return "Spieler gewint";
    }
    @Override
    public String getAll(){
        return "All";
    }
    @Override
    public String getWin(){
        return "ziehen";
    }
}