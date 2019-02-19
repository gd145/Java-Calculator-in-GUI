package ui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class MainController {
	
	@FXML
	private Label calcLabel;
	private long number1 = 0;
	private String op = "";
	private boolean start = true;
	private Calculator calculator = new Calculator();
	@FXML
	public void numInput(ActionEvent event) {
		if(start) {
			calcLabel.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		calcLabel.setText(calcLabel.getText()+ value);

	}
	
	@FXML
	public void opInput(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		
		try {
			
			if (!value.equals("=")) {
				if(!op.isEmpty()) 
					return;
				op = value;
				number1 = Long.parseLong(calcLabel.getText());
				calcLabel.setText("");
				
			} else {
				if(op.isEmpty())
					return;
				long number2 = Long.parseLong(calcLabel.getText());
				float calcOutput = calculator.calculate(op, number1, number2);
				calcLabel.setText(String.valueOf(calcOutput));
				op = "";
				start = true;
			}
			
		} catch(NumberFormatException e) {
			return;
			}
		}
	
	@FXML
	public void clear(ActionEvent event) {
		calcLabel.setText("");
		start = false;
		number1 = 0;
		op = "";
	}

}
