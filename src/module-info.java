module projeto_1 {
	requires javafx.controls;
	 requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	opens application to javafx.graphics, javafx.fxml;
	opens application.view to javafx.graphics, javafx.fxml;
}
