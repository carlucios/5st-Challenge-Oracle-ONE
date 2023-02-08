/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.one.unitsconverter;

import br.com.one.unitsconverter.Models.Unit;
import br.com.one.unitsconverter.Models.Currency;
import br.com.one.unitsconverter.Models.Temperature;
import java.util.HashMap;


/**
 *
 * @author Carlucio
 */
public class Converter {
    
    private Unit unit;
    
    public Converter(Unit unit) {
        this.unit = unit;

    }
    
    public float getOperationResult(String operation) {
       
       float math = unit.applyMath(unit.getValue(),operation);
       
       return (Float) math; 
    }
    
}
