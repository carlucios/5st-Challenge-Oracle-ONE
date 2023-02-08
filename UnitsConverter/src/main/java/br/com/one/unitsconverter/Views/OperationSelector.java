/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.one.unitsconverter.Views;

import br.com.one.unitsconverter.Models.Unit;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlucio
 */
public class OperationSelector {

    private Object[] listOperations;
    private Object operationObj;
    private String operation;
    
    public OperationSelector(Unit unit) {
        this.listOperations = unit.getList();
        String windowMessage = unit.getMessage();
        String windowTitle = unit.getTitle();
        
        operationObj = JOptionPane.showInputDialog(null, windowMessage, windowTitle, JOptionPane.PLAIN_MESSAGE, null, listOperations, "De Reais a Dólares");
        
        if (operationObj == null){
            ExitMessage exit = new ExitMessage();
        } else {
            operation = operationObj.toString();
        }
    }
    
    public String getOperation() {
        return this.operation;
    }
    
}
