
package p3tarea3grupo3.controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;


public class City { //Clase Ciudad - ciudades del Ecuador que se cangan en registro en un ComboBox
    //Atributo
    private String city;
    //Constructor
    public City(String city) {
        this.city = city;
    }
   //Constructor vacion
   public City(){
       
   } 
    //Metodo get y set de City
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    //Creacion de ARCHIVO CSV 
    public void createCsvFile(List<City> ciudades) { //Lista de ciudades como Argumento
        boolean fileExists = !new File("Cities.csv").exists();
        try (CSVWriter writer = new CSVWriter(new FileWriter("Cities.csv", true))) {//Escribir en el archivo csv
            if (fileExists) {
                String[] header = {"Nombre"};
                writer.writeNext(header);
            }
            for (City ciudad : ciudades) { //iterador en la lista de ciudades
                String[] data = {ciudad.getCity()};
                writer.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Lectura del archivo csv para cargar en el ComboBox
    public List<City> readCsvFile() {
        List<City> ciudades = new ArrayList<>();
        File archivo = new File("Cities.csv");
        if (!archivo.exists()) {
            return ciudades;
        }
        try {
            CSVReader reader = new CSVReader(new FileReader("Cities.csv"));
            String[] ciudad;
            int i = 0;
            while ((ciudad = reader.readNext()) != null) {
                if (i > 0) {
                    String nombre = ciudad[0];
                    City c = new City(nombre);
                    ciudades.add(c);
                }
                i++;
            }
        } catch (IOException | CsvValidationException ex) {
            ex.printStackTrace();
        }

        return ciudades; //devuelve la lista de ciudades
    }

}
