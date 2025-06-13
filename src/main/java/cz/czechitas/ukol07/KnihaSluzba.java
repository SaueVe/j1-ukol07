package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class KnihaSluzba {
    private List<Kniha> knihy;
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

  /*  public List<Kniha> nactiKnihy() {
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>(){});
            System.out.println(knihy);  // zkusit sout
        } catch (FileNotFoundException ex) {
            System.err.println("Soubor nenalezen.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return knihy;
    }*/

    public List<Kniha> seznamKnih() {

        return knihy.stream().toList();
    }

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
