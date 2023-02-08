/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.one.unitsconverter.Views;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlucio
 */
public class ConverterSelector {
    
    private String option = null;
    
    public ConverterSelector() {
    
        Object[] converters = {"Conversor de Moeda","Conversor de Temperatura"}; 
        Object converter = JOptionPane.showInputDialog( null , "Escolha uma opção" , "Menu" , JOptionPane.PLAIN_MESSAGE , null , converters , "Conversor de Moeda" );
        
        this.option = converter.toString();
              
    }
    
    public String getOption() {
        return this.option;
    }
    
}
