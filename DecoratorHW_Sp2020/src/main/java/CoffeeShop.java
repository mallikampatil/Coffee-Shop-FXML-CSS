/*
 * Author: Mallika Patil 
 * NetID: mpatil5
 * Description: UI for CoffeeDecorator homework using FXML, CSS, and a controller. 
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class CoffeeShop extends Application {
	@Override
	public void start(Stage primaryStage) {
		 try {
	            /* Read file fxml and draw interface */
	            Parent CoffeeLayout = FXMLLoader.load(getClass().getResource("/FXML/coffee-shop-fxml.fxml"));
	            primaryStage.setTitle("My Application");
                Scene OrderScreen = new Scene(CoffeeLayout, 500,500);
                OrderScreen.getStylesheets().add("/styles/coffee-shop-style.css");
	            primaryStage.setScene(OrderScreen);
	            primaryStage.show();
	         
	        } catch(Exception e) {
	            e.printStackTrace();
	            System.exit(1);
	        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
