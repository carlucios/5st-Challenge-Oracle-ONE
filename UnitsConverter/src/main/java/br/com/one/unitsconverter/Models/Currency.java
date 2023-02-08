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

public class Currency extends Unit{
    
    private static Object[] operationsList = new Object[]{"De Reais a Dólares", 
                                                    "De Reais a Euros",
                                                    "De Reais a Libras",
                                                    "De Reais a Peso Argentino", 
                                                    "De Reais a Peso Chileno", 
                                                    "De Dólares a Reais",
                                                    "De Euros a Reais", 
                                                    "De Libras a Reais", 
                                                    "De Peso Argentino a Reais",
                                                    "De Peso Chileno a Reais"};
    private String type = "Moeda";
    private String windowMessage = "Escolha a moeda para a qual você deseja girar seu dinheiro";
    private String windowTitle = "Moedas";
    private static HashMap table = new HashMap();
    
    public Currency(float inputValue) {
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
        table = APICurrency.getAPICurrencyTable();
    }
    
    public float applyMath(float value, String operation) {
        if (table.isEmpty()) {
            fillTable();
        }
        return (float)((value) * ((float) table.get(operation)));
    }
}
