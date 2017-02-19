package w4practicum2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	private Hotel hotel = new Hotel("Avondrust");

	@Override
	public void start(Stage primaryStage) {
		Label topL = new Label("Voer uw gegevens in!");
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
		Button boekBtn = new Button("boek");
		Button resetBtn = new Button("reset");
		TextField naamTF = new TextField();
		TextField adresTF = new TextField();
		DatePicker vrDP = new DatePicker();
		DatePicker aanDP = new DatePicker();

		LocalDate today = LocalDate.now();
		aanDP.setValue(today);
		vrDP.setValue(today.plusDays(1));
		ComboBox kamerC = new ComboBox();
		kamerC.getItems().addAll(hotel.getKamerTypen());
		kamerC.getSelectionModel().selectFirst();

		FlowPane root = new FlowPane();
		root.setVgap(6);
		root.setPadding(new Insets(5));
		naamTF.setMinWidth(240);
		adresTF.setMinWidth(240);
		vrDP.setMinWidth(240);
		aanDP.setMinWidth(240);
		kamerC.setMinWidth(240);

		boekBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				boek(naamTF, adresTF, aanDP, vrDP, kamerC, topL);
			}
		});

		resetBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				clearFields(naamTF, adresTF, aanDP, vrDP, kamerC, topL);
			}
		});

		HBox topB = new HBox(100);
		topB.getChildren().addAll(topL);
		topB.setMinWidth(350);
		HBox naamHB = new HBox(10);
		naamHB.getChildren().addAll(naamL, naamTF);
		naamHB.setMinWidth(350);
		HBox adresHB = new HBox(10);
		adresHB.getChildren().addAll(adresL, adresTF);
		adresHB.setMinWidth(350);
		HBox aanDHB = new HBox(10);
		aanDHB.getChildren().addAll(aanDateL, aanDP);
		aanDHB.setMinWidth(350);
		HBox vrDHB = new HBox(10);
		vrDHB.getChildren().addAll(vrDateL, vrDP);
		vrDHB.setMinWidth(350);
		HBox kamerHB = new HBox(10);
		kamerHB.getChildren().addAll(kamerL, kamerC);
		kamerHB.setMinWidth(350);
		HBox btnHB = new HBox(10);
		btnHB.setAlignment(Pos.TOP_RIGHT);
		btnHB.getChildren().addAll(boekBtn, resetBtn);
		btnHB.setMinWidth(350);

		root.getChildren().addAll(topB, naamHB, adresHB, aanDHB, vrDHB, kamerHB, btnHB);
		Scene scene = new Scene(root, 350, 200);

		primaryStage.setTitle("HotelApp");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	private void clearFields(TextField naamTF, TextField adresTF, DatePicker aanDP, DatePicker vrDP, ComboBox kamerC, Label topL) {
		naamTF.clear();
		adresTF.clear();
		aanDP.setValue(LocalDate.now());
		vrDP.setValue(LocalDate.now().plusDays(1));
		kamerC.getSelectionModel().selectFirst();
		topL.setText("Voer uw gegevens in!");
	}

	private void boek(TextField naamTF, TextField adresTF, DatePicker aanDP, DatePicker vrDP, ComboBox kamerC, Label topL){
		boolean checker = true;
		String naam = naamTF.getText();
		String adres = adresTF.getText();
		LocalDate aankomst = aanDP.getValue();
		LocalDate vertrek = vrDP.getValue();
		KamerType kt = (KamerType) kamerC.getValue();
		
		if (aankomst.isAfter(vertrek) || vrDP.getValue().isBefore(aanDP.getValue())){
			topL.setText("Voer correcte datums in!");
			checker = false;
		}
		
		if (adres.equals("")){
			topL.setText("Voer een adres in!");
			checker = false;
		}
		
		if (naam.equals("")){
			topL.setText("Voer een naam in!");
			checker = false;
		}
		
		if (checker){
			hotel.voegBoekingToe(aankomst, vertrek, naam, adres, kt);
			System.out.println(hotel);
			clearFields(naamTF, adresTF, aanDP, vrDP, kamerC, topL);
			topL.setText("Boeking succes");
		}
		
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		// placeholder

	}
}