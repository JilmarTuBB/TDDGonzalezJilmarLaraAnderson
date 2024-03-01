
package p3tarea3grupo3.controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Provinces {//Clase Provincia - provincias del Ecuador que se cangan en registro en un ComboBox
    //Atributo
    private String provincies;
    //Constructor
    public Provinces(String provincies) {
        this.provincies = provincies;
    }
    
    public Provinces(){
        
    }
    //Metodos Get y set
    public String getProvincies() {
        return provincies;
    }

    public void setProvincies(String provincies) {
        this.provincies = provincies;
    }
    //Creacion del archivo csv en donde se va a guardar una lista de provincias de ciudades
    public void createCsvFile(List<Provinces> pro) {
        boolean fileExists = !new File("Provinces.csv").exists();
        try (CSVWriter writer = new CSVWriter(new FileWriter("Provinces.csv", true))) {
            if (fileExists) {
                String[] header = {"Provincia"};
                writer.writeNext(header);
            }
            for (Provinces provi : pro) {
                String[] data = {provi.getProvincies()};
                writer.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Lectura del archivo csv
    public List<Provinces> readCsvFile() {
        List<Provinces> provi = new ArrayList<>();
        File archivo = new File("Provinces.csv");
        if (!archivo.exists()) {
            return provi;
        }
        try {
            CSVReader reader = new CSVReader(new FileReader("Provinces.csv"));
            String[] provincia;
            int i = 0;
            while ((provincia = reader.readNext()) != null) {
                if (i > 0) {
                    String pr = provincia[0];
                    Provinces c = new Provinces(pr);
                    provi.add(c);
                }
                i++;
            }
        } catch (IOException | CsvValidationException ex) {
            ex.printStackTrace();
        }

        return provi;//retorna una lista de Provincias
    }    
}
