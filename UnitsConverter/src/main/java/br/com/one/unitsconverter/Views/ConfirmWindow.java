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
public class ConfirmWindow {
    private int userChoice;
    
    public ConfirmWindow(String message){
        this.userChoice = JOptionPane.showConfirmDialog(null, message);
    }
    
    public int getUserChoice(){
        return this.userChoice;
    }
    
}
