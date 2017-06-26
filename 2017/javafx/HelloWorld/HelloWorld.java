import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class HelloWorld extends Application {

	@Override
	public void start(final Stage primaryStage) {
		
		final Button button = new Button();	

		button.setText("Hello, World!");

		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				System.out.println("Hello, World!");
			}	
		});

		/*
		 * There is another way to do the thing above
		 * button.setOnAction((ActionEven event) -> {
		 *   System.out.println("Hello, World");
		 * });
		 */

		final StackPane root = new StackPane();

		root.getChildren().add(button);

		final Scene scene = new Scene(root, 300, 250);

		primaryStage.setTitle("Hello, World!");
		primaryStage.setScene(scene);

		primaryStage.show();	
	}	

	public static void main(final String[] args) {
		launch(args);	
	}
}
