package assignment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import lab1.Student;
// Step 1
import java.sql.*;


public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void submitStudent() throws Exception{
        try{
            // Step 2
            Class.forName("com.mysql.jdbc.Driver");

            // Step 3:
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";// thuong thi luon la root
            String password = "root"; // "" neu dung xampp "root" neu dung mamp

            //Step 4
            Connection conn = DriverManager.getConnection(url,username,password);

            String name = txtName.getText();
            Integer age = Integer.parseInt(txtAge.getText());
            Integer mark = Integer.parseInt(txtMark.getText());
            Student s = new Student(name,age,mark);

            String sql_text = "INSERT INTO students(name,age,mark) VALUES('"+name+"',"+age+","+mark+")";

            Statement stm = conn.createStatement();
            int row_number = stm.executeUpdate(sql_text);// tra ve so row du lieu bi anh huong
            if(row_number>0){
                Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }else{
                // thong bao gi do --> validation
            }


        }catch (Exception e){
            System.out.println(e.getMessage()); // Crash app
        }

    }

}
