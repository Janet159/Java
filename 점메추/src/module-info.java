module 점메추 {
	requires javafx.controls;
	requires javafx.fxml;		//FXML 설정
	requires lombok;
	opens application to javafx.graphics, javafx.fxml;
}
