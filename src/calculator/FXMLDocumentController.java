/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Aspire
 */
public class FXMLDocumentController implements Initializable {
    
    float data = 0f;
    int operation = -1;
    @FXML
    private Button add;

    @FXML
    private Button sub;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button mul;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button five;
    
    private int checkOperation=0;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource()==one){
            if(checkOperation==0){
                display.setText(display.getText()+"1");
            }else{
                display.setText("1");
                checkOperation=0;
            }
        }else if(event.getSource()==two){
            if(checkOperation==0){
                display.setText(display.getText()+"2");
            }else{
                display.setText("2");
                checkOperation=0;
            }
        }else if(event.getSource()==three){
            if(checkOperation==0){
                display.setText(display.getText()+"3");
            }else{
                display.setText("3");
                checkOperation=0;
            }
        }else if(event.getSource()==four){
            if(checkOperation==0){
                display.setText(display.getText()+"4");
            }else{
                display.setText("4");
                checkOperation=0;
            }
        }else if(event.getSource()==five){
            if(checkOperation==0){
                display.setText(display.getText()+"5");
            }else{
                display.setText("5");
                checkOperation=0;
            }
        }else if(event.getSource()==six){
            if(checkOperation==0){
                display.setText(display.getText()+"6");
            }else{
                display.setText("6");
                checkOperation=0;
            }
        }else if(event.getSource()==seven){
            if(checkOperation==0){
                display.setText(display.getText()+"7");
            }else{
                display.setText("7");
                checkOperation=0;
            }
        }else if(event.getSource()==eight){
            if(checkOperation==0){
                display.setText(display.getText()+"8");
            }else{
                display.setText("8");
                checkOperation=0;
            }
        }else if(event.getSource()==nine){
            if(checkOperation==0){
                display.setText(display.getText()+"9");
            }else{
                display.setText("9");
                checkOperation=0;
            }
        }else if(event.getSource()==zero){
            if(checkOperation==0){
                display.setText(display.getText()+"0");
            }else{
                display.setText("0");
                checkOperation=0;
            }
        }else if(event.getSource()==clear){
            display.setText("");//clear
        }else if(event.getSource()==add){
            try {
                data = Float.parseFloat(display.getText());
            } catch (Exception e) {
                data=0;
            }
            operation = 1;//add
            display.setText("");
        }else if(event.getSource()==sub){
            try {
                data = Float.parseFloat(display.getText());
            } catch (Exception e) {
                data=0;
            }
            operation = 2;//sub
            display.setText("");
        }else if(event.getSource()==mul){
            try {
                data = Float.parseFloat(display.getText());
            } catch (Exception e) {
                data=0;
            }
            operation = 3;//mul
            display.setText("");
        }else if(event.getSource()==div){
            try {
                data = Float.parseFloat(display.getText());
            } catch (Exception e) {
                data=0;
            }
            operation = 4;//div
            display.setText("");
        }else if(event.getSource()==equal){
            float ans = 0f;
            float secondOperand=0;
            checkOperation=1;
            if(display.getText().equals("")){
                secondOperand=data;
            }else{
                secondOperand= Float.parseFloat(display.getText());
            }
            
            switch(operation){
                case 1:
                    ans = data+secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans = data-secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans = data*secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 4:
                    try{
                        ans = data/secondOperand;
                    }catch(Exception e){
                        display.setText("Error");
                    }
                    display.setText(String.valueOf(ans));
                    break;
                default:
                    display.setText(display.getText());
            }
            operation=-1;
        }
    }
    
    void handleKeyAction(ActionEvent Event){}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
