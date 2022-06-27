module com.company.app.tutojavafxmodules {
    requires javafx.controls;
	requires javafx.fxml;
    
	opens com.company.app.tutojavafxmodules to javafx.graphics, javafx.fxml;
	//exports com.company.app.tutojavafxmodules;
}
