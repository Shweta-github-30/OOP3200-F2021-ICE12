module ca.durhamcollege.oop3200f20221ice12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.durhamcollege.oop3200f20221ice12 to javafx.fxml;
    exports ca.durhamcollege.oop3200f20221ice12;
}