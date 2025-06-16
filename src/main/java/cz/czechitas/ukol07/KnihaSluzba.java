package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class KnihaSluzba {
    private List<Kniha> knihy = new ArrayList<>();
    private ObjectMapper objectMapper = new ObjectMapper();


    public KnihaSluzba() {
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>(){});
              // zkusit sout
        } catch (FileNotFoundException ex) {
            System.err.println("Soubor nenalezen.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return;
    }


    public List<String> seznamKnih() {

        return knihy
                .stream()
                .map(Kniha::getNazev)
                .toList();

    }

    public List<String> seznamKnihAutora(String autor) {
        List<String> seznamA = knihy
                .stream()
                .filter(kniha -> kniha.getAutor().equals(autor))
                .map(Kniha::getNazev)
                .toList();
        if (seznamA.isEmpty()) {
            System.out.println("V databázi nejsou žádné knihy od tohoto autora.");
        }
        return seznamA;
    }

    public void List<String> seznamKnihVRoce(int rokVydani){
        List<String> seznamV=knihy
                .stream()
                .filter(kniha -> kniha.getRokVydani()==rokVydani)
                .toList()
                .forEach(kniha -> System.out.printf("%s: %s", kniha.getAutor(), kniha.getNazev()).println());
        if (seznamV.isEmpty()){

        }
        return seznamV;
    }













    /*public List<String> seznamKnihVRoce(int rokVydani) {
            List<String> seznamV = knihy
                    .stream()
                    .filter(kniha -> kniha.getRokVydani()==(rokVydani))
                    .toList()
                    .forEach(kniha -> System.out.printf("%s: %s", kniha.getAutor(),kniha.getNazev()).println());
            return seznamV;
    }*/

 //   public List


  /*  public List<Kniha> knihy() {
        try (FileInputStream inputStream = new FileInputStream(KnihaSluzba.class.getResourceAsStream("knihy.json").toString())) {
            objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>(){});
        } catch (FileNotFoundException ex) {
            System.err.println("Soubor nenalezen.");
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return knihy;
    }

    public Stream <String> seznamKnih() {
        return knihy;

    }*/





    // KnihaSluzba.class.getResourceAsStream("knihy.json");

 //   objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>(){});

    /*try (InputStream inputStream = Files.newInputStream(path)) {
        // kód, ve kterém může vypadnout výjimka
    }*/

    //   Path path = Path.of("src/main/resources/cz.czechitas.ukol07/knihy.json");

//       try(FileInputStream inputStream = (FileInputStream) KnihaSluzba.class.getResourceAsStream("knihy.json")) {
}
