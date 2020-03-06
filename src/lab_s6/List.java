package lab_s6;

import connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

import java.sql.*;

public class List implements Initializable {
    public ListView<Product> lsView = new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{


            String sql_text = "SELECT * FROM products";
            Connector connector = Connector.getInstance();
            ResultSet rs = connector.getQuery(sql_text);

            ObservableList<Product> ls = FXCollections.observableArrayList();
            while (rs.next()){
                ls.add(new Product(rs.getInt("id"),rs.getString("name"),
                        rs.getString("description"),rs.getDouble("price"),
                        rs.getInt("quantity"))
                    );
            }
            lsView.setItems(ls);

        }catch (Exception e){

        }

    }
    // SPA - SINGLE PAGE APPLICATION
    public void form(){
        // day la noi chuyen man hinh
        try {
            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.productStage.getScene().setRoot(form);
            // mainStage la 1 bien static trong lop Main
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void addToCart(){
        Product selected = lsView.getSelectionModel().getSelectedItem();
        Main.cart.add(selected);
        System.out.println("Add to cart successfully");
    }

    public void cart(){
        try {
            Parent cart = FXMLLoader.load(getClass().getResource("cart.fxml"));
            Main.productStage.getScene().setRoot(cart);
            // mainStage la 1 bien static trong lop Main
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
