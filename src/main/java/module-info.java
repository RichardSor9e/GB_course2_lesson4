module com.example.gb_course2_lesson4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gb_course2_lesson4 to javafx.fxml;
    exports com.example.gb_course2_lesson4;
}