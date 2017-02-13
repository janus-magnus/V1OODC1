package w4practicum2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.collections.*;

//@SuppressWarnings("restriction")
public class HotelApp extends Application implements EventHandler<ActionEvent> {
	@Override
	public void start(Stage primaryStage) {
		Label naamL = new Label("naam:");
		naamL.setPrefWidth(100);
		Label adresL = new Label("adres:");
		adresL.setPrefWidth(100);
		Label aanDateL = new Label("aankomstdatum:");
		aanDateL.setPrefWidth(100);
		Label vrDateL = new Label("vertrekdatum:");
		vrDateL.setPrefWidth(100);
		Label kamerL = new Label("kamertype:");
		kamerL.setPrefWidth(100);
		Label topL = new Label("Voer uw gegevens in!");
		Button boekBtn = new Button("boek");
		Button resetBtn = new Button("reset");
		TextField naamTF = new TextField();
		TextField adresTF = new TextField();
		DatePicker vrDP = new DatePicker();
		DatePicker aanDP = new DatePicker();
		ObservableList<String> options = FXCollections.observableArrayList("test1", "test2", "test3");
		ComboBox kamerC = new ComboBox(options);
		FlowPane root = new FlowPane();
		root.setVgap(6);
		root.setPadding(new Insets(5));
		naamTF.setMinWidth(240);
		adresTF.setMinWidth(240);
		vrDP.setMinWidth(240);
		aanDP.setMinWidth(240);
		kamerC.setMinWidth(240);
		
		HBox topB = new HBox(100);
		topB.getChildren().addAll(topL);
		topB.setMinWidth(350);
		HBox naamHB = new HBox(10);
		naamHB.getChildren().addAll(naamL,naamTF);
		naamHB.setMinWidth(350);
		HBox adresHB = new HBox(10);
		adresHB.getChildren().addAll(adresL,adresTF);
		adresHB.setMinWidth(350);
		HBox aanDHB = new HBox(10);
		aanDHB.getChildren().addAll(aanDateL,aanDP);
		aanDHB.setMinWidth(350);
		HBox vrDHB = new HBox(10);
		vrDHB.getChildren().addAll(vrDateL,vrDP);
		vrDHB.setMinWidth(350);
		HBox kamerHB = new HBox(10);
		kamerHB.getChildren().addAll(kamerL,kamerC);
		kamerHB.setMinWidth(350);
		HBox btnHB = new HBox(10);
		btnHB.setAlignment(Pos.TOP_RIGHT);
		btnHB.getChildren().addAll(boekBtn,resetBtn);
		btnHB.setMinWidth(350);				
		
		root.getChildren().addAll(topB,naamHB,adresHB,aanDHB,vrDHB,kamerHB,btnHB);
		Scene scene = new Scene(root, 350, 200);
		
		primaryStage.setTitle("HotelApp");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}