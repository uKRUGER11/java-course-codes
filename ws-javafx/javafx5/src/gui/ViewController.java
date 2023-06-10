package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController implements Initializable {
	
	@FXML
	private TextField txtNumberOne;
	
	@FXML
	private TextField txtNumberTwo;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	public void onBtSumAction() { 
		try {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumberOne.getText());
		double number2 = Double.parseDouble(txtNumberTwo.getText());
		double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumberOne);
		Constraints.setTextFieldDouble(txtNumberTwo);
		
		Constraints.setTextFieldMaxLength(txtNumberOne, 5);
		Constraints.setTextFieldMaxLength(txtNumberTwo, 5);
		
	}
}
