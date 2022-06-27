package com.company.app.tutojavafxmodules;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {
	@FXML
	private Button btn;
	
	//@FXML
	public void exitButton(ActionEvent event) {
		System.out.println("L'application va se fermer!");
		System.exit(0);
	}
}
