/*
 * 
 * CoffeeController: contains methods called by FXML buttons. 
 */
package application; 

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class CoffeeController implements Initializable {
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	} 
    
	/* A function to print when coffee add on is pressed */
	@FXML
    private void printCoffeeAddOn (ActionEvent event) {
        event.consume();
        System.out.println("Coffee Add On Pressed");
    }
	
	/* A function to print when coffee application functional button is pressed */
	@FXML
    private void printFunctionButton (ActionEvent event) {
        event.consume();
        System.out.println("Function Button Press");
    }

}
