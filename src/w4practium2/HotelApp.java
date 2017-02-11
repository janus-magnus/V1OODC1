import javafx.application.Application;


public class HotelApp extends Application implements EventHandler<ActionEvent> {
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(this);
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}