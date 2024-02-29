/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author EFRAIN
 */
public class City {
        private String city;

    public City(String city) {
        this.city = city;
    }

   public City(){
       
   } 

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void createCsvFile(List<City> ciudades) {
        boolean fileExists = !new File("Cities.csv").exists();
        try (CSVWriter writer = new CSVWriter(new FileWriter("Cities.csv", true))) {
            if (fileExists) {
                String[] header = {"Nombre"};
                writer.writeNext(header);
            }
            for (City ciudad : ciudades) {
                String[] data = {ciudad.getCity()};
                writer.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

        return ciudades;
    }

}
