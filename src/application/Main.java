package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Label l1 = new Label("Counter");
		TextField t1 = new TextField("0");
		t1.setEditable(false);
		t1.setDisable(true);
		Button b1 = new Button("Count");
		b1.setOnAction(e->{
			int num = Integer.parseInt(t1.getText());
			num++;
			t1.setText(String.valueOf(num));

		});
		
		
		HBox root = new HBox(l1,t1,b1);
		root.setPadding(new Insets(10));
		root.setSpacing(10);
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
