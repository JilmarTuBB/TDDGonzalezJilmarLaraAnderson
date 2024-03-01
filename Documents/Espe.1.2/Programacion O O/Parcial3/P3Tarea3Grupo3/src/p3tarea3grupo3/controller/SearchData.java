/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3tarea3grupo3.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class SearchData {
    private long identification;
    public String lastName;
    public String name;
    public String numberAccount;

    public SearchData(long identification, String lastName, String name, String numberAccount) {
        this.identification = identification;
        this.lastName = lastName;
        this.name = name;
        this.numberAccount = numberAccount;
    }

    public SearchData() {
    }
    
    public void createFileJson(SearchData data){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("SearchData.json"))){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String listS = gson.toJson(data);
            writer.write(listS);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo guardar el registro");
        }
    }
    

    public SearchData readFileJson() {
        SearchData searchData = null;
        File file = new File("SearchData.json");
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo no existe");
            return null;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Gson gson = new Gson();
            searchData = gson.fromJson(reader, SearchData.class);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo JSON");
        }
        return searchData;
    }

    public long getIdentification() {
        return identification;
    }

    public void setIdentification(long identification) {
        this.identification = identification;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }
    
    

}
