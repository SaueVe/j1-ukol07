package cz.czechitas.ukol07;


import java.util.List;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {

    public static void main(String[] args) {
        new Aplikace().run();
    }

    private void run() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();

        System.out.println("Počet knih v seznamu: " + knihaSluzba.seznamKnih().size());
        System.out.println(knihaSluzba.seznamKnihAutora("Karel Čapek"));
        System.out.printf(knihaSluzba.seznamVRoce(1932).toString());

    }

}
