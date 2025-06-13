package cz.czechitas.ukol07;

import java.time.Year;
import java.util.List;

public class Kniha {
    private String autor;
    private String nazev;
    private int rokVydani;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String toString() {
       final StringBuilder sb = new StringBuilder();
       sb.append(autor);
       sb.append(" ");
       sb.append(nazev);
       sb.append(" ");
       sb.append(rokVydani);
       return sb.toString();


    }
}
