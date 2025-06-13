package cz.czechitas.ukol07;


import java.util.List;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {

    public static void main(String[] args)  {
        new Aplikace().run();

    }

    private void run() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        System.out.println(knihaSluzba.seznamKnih());


    }



}
