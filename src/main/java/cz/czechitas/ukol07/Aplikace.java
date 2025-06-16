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
        Kniha kniha = new Kniha();
        System.out.println(knihaSluzba.seznamKnih());

        System.out.println(knihaSluzba.seznamKnihAutora("Karel Čapek"));
      //  System.out.println(knihaSluzba.seznamKnihAutor("Karel Čapek"));
        System.out.println("Počet knih v seznamu: " + knihaSluzba.seznamKnih().size());

      //  knihaSluzba.seznamKnihVRoce(1845).toString()

        System.out.println(knihaSluzba.seznamKnihVRoce(1845));

      //  List kniha = knihaSluzba.seznamKnihVRoce(1845);


    }



}
