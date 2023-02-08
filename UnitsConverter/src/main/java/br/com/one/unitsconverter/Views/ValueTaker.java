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
public class ValueTaker {
    
    private float value;
    
    public ValueTaker() {

        
        try{
            this.value = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor:"));
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível processar a sua entrada!\nO valor de entrada precisa ser um número real.\n(Exemplo: 202.50)");
            ValueTaker valuetaker = new ValueTaker();
        } catch(NullPointerException e){
            ExitMessage exit = new ExitMessage();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    public float getValue() {
        return this.value;
    }
}
