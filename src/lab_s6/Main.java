package lab_s6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage productStage;

    public static ObservableList<Product> cart = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        productStage = primaryStage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            primaryStage.setTitle("Manage products");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
