/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.one.unitsconverter;

import br.com.one.unitsconverter.Views.ConverterSelector;
import br.com.one.unitsconverter.Views.ExitMessage;
import br.com.one.unitsconverter.Views.MessageWindow;
import br.com.one.unitsconverter.Views.ValueTaker;
import br.com.one.unitsconverter.Views.OperationSelector;
import br.com.one.unitsconverter.Views.ConfirmWindow;
import br.com.one.unitsconverter.Models.Unit;
import br.com.one.unitsconverter.Models.Currency;
import br.com.one.unitsconverter.Models.Temperature;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlucio
 */
public class UnitsConverter {

    public static void main(String[] args) {
        try{
            ConverterSelector converterSelector = new ConverterSelector();
            String converterSelected = converterSelector.getOption();
            
            Unit unit = new Currency(0);

            if (converterSelected == null){
                ExitMessage exit = new ExitMessage();
                
            } else if (converterSelected == "Conversor de Temperatura"){
                unit = new Temperature(0);
                
            }
            
            ValueTaker valueTaker = new ValueTaker();                
            float valueTaken = valueTaker.getValue();
            unit.setValue(valueTaken);
            
            OperationSelector selector = new OperationSelector(unit);
            String operationSelected = selector.getOperation();
            
            Converter converter = new Converter(unit);
            float operationResult = converter.getOperationResult(operationSelected);
            
            MessageWindow resultMsg = new MessageWindow("Você tem $ " + operationResult + " após a conversão!");
            
            ConfirmWindow confirmWindow = new ConfirmWindow("Deseja continuar?");
            int toContinueOrNot = confirmWindow.getUserChoice();
            
            if (toContinueOrNot == 0) {
                main(args);
            } else {
                ExitMessage exit = new ExitMessage();
            }
            
            
        } catch(NullPointerException e){
            ExitMessage exit = new ExitMessage();
        } catch(Exception e){
            MessageWindow errorMsg = new MessageWindow(e.toString());
        }
        
    }
}
