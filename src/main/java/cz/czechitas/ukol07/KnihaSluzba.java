package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class KnihaSluzba {
    private List<Kniha> knihy = new ArrayList<>();
    private ObjectMapper objectMapper = new ObjectMapper();


    public KnihaSluzba() {
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});
        } catch (FileNotFoundException ex) {
            System.err.println("Soubor nenalezen.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<String> seznamKnih() {
        return knihy
                .stream()
                .map(Kniha::getNazev)
                .toList();

    }

    public List<String> seznamKnihAutora(String autor) {
        Optional<List<String>> seznamA = Optional.of(knihy
                .stream()
                .filter(kniha -> kniha.getAutor().equals(autor))
                .map(Kniha::getNazev)
                .toList());
        return seznamA.get();
    }

    public List<String> seznamVRoce(int rokVydani) {

        Optional<List<String>> knihyVR = Optional.of(knihy
                .stream()
                .filter(kniha -> kniha.getRokVydani() == rokVydani)
                .map(Kniha::toString)
                .toList());
        return knihyVR.get();
    }
}
