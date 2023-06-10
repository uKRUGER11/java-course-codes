package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
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
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumberOne.getText());
		double number2 = Double.parseDouble(txtNumberTwo.getText());
		double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));
	}
}
