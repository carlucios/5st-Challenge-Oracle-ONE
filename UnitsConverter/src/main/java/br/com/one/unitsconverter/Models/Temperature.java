/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.one.unitsconverter.Models;

import br.com.one.unitsconverter.Models.Unit;
import java.util.*;

/**
 *
 * @author Carlucio
 */

public class Temperature extends Unit{
    
    private static Object[] operationsList = new Object[]{"De Kelvin para Celsius",
                                                          "De Kelvin para Fahrenheit",
                                                          "De Celsius para Kelvin",
                                                          "De Celsius para Fahrenheit",
                                                          "De Fahrenheit para Celsius", 
                                                          "De Fahrenheit para Kelvin"};
    private String type = "Temperatura";
    private String windowMessage = "Escolha a temperatura para a conversão";
    private String windowTitle = "Temperaturas";
    private static HashMap table = new HashMap();
    
    public Temperature(float inputValue) {
        super(inputValue);
    }
        
    @Override
    public Object[] getList() {
        return this.operationsList;
    }
    
    @Override
    public String getType() {
        return this.type;
    }
     
    @Override
    public String getMessage() {
        return this.windowMessage;
    }
    
    @Override
    public String getTitle() {
        return this.windowTitle;
    }
    
    @Override
    public HashMap getTable(Unit unit) {
        if (table.isEmpty()) {
            fillTable();
        }
        
        return table;
    }
    
    public static void fillTable() {
        double[] indexesKC = {1, -273};
        table.put("De Kelvin para Celsius", indexesKC);
        double[] indexesKF = {1.8, -459.4};
        table.put("De Kelvin para Fahrenheit", indexesKF);
        double[] indexesCK = {1, 273};
        table.put("De Celsius para Kelvin", indexesCK);
        double[] indexesCF = {1.8, 32};
        table.put("De Celsius para Fahrenheit", indexesCF);
        double[] indexesFC = {1/1.8, -32/1.8};
        table.put("De Fahrenheit para Celsius", indexesFC);
        double[] indexesFK = {5/9, 273-32*5/9};
        table.put("De Fahrenheit para Kelvin", indexesFK);
        
    }
    
    public float applyMath(float value, String operation) {
        if (table.isEmpty()) {
            fillTable();
        }
        
        double[] indexesList = (double[]) table.get(operation);
        
        return (float)((float) value) * ((float) indexesList[0]) + (float) indexesList[1];
    }

}