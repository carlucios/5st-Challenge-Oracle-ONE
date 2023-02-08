/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.one.unitsconverter.Models;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Carlucio
 */
public abstract class Unit {
    
    private float value;

    public Unit(float inputValue) {
        this.value = inputValue;
    }
    
    public float getValue() {
        return this.value;
    }
    
    public void setValue(float value) {
        this.value = value;
    }
    
    public abstract Object[] getList();
    
    public abstract String getType();
    
    public abstract String getMessage();
    
    public abstract String getTitle();
    
    public abstract HashMap getTable(Unit unit);
    
    public abstract float applyMath(float value, String operation);
    
}
