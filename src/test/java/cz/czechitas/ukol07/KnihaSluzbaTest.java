package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {

    @Test
    void seznamKnih() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();

        List<String> seznamVsechKnih = List.of("V zámku a podzámčí", "Divá Bára", "Babička", "Národní báchorky a pověsti", "Bílá růže", "Kafíčko", "Válka s Mloky", "Bílá nemoc", "R. U. R.", "Adam stvořitel", "Apokryfy", "Povídání o pejskovi a kočičce", "Devatero pohádek", "Povídejme si, děti");
        assertEquals(seznamVsechKnih, knihaSluzba.seznamKnih());
        assertEquals("V zámku a podzámčí", knihaSluzba.seznamKnih().getFirst());
        assertEquals("Povídejme si, děti", knihaSluzba.seznamKnih().getLast());
        assertEquals(14, knihaSluzba.seznamKnih().size());
    }

    @Test
    void seznamVRoce() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<String> jednaKniha = List.of("Karel Čapek: R. U. R.");
        List<String> dveKnihy = List.of("Karel Čapek: Apokryfy", "Josef Čapek: Devatero pohádek");
        assertEquals(jednaKniha, knihaSluzba.seznamVRoce(1920));
        assertEquals(dveKnihy, knihaSluzba.seznamVRoce(1932));
        assertEquals(List.of(), knihaSluzba.seznamVRoce(1945));
    }

    @Test
    void seznamKnihAutora() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<String> knihaDve = List.of("Bílá růže", "Kafíčko");
        assertEquals(knihaDve, knihaSluzba.seznamKnihAutora("Magdalena Dobromila Rettigová"));
        assertEquals(List.of(), knihaSluzba.seznamKnihAutora("K"));


    }
}