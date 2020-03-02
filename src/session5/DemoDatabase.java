package session5;
// step 1 - import package sql
import java.sql.*;

public class DemoDatabase {

    public static void main(String args[]){
        try {
            // Step 2: Khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            // luu y: coppy file driver vao neu chua co

            // Step 3: Tao URL DB
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";// thuong thi luon la root
            String password = "root"; // "" neu dung xampp "root" neu dung mamp
            // Step 4: Ket noi DB
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Ket noi MYSQL thah cong");
            // Thu truy van lay students
            Statement stm = conn.createStatement();
            String sql_text = "SELECT * FROM students";
            ResultSet rs = stm.executeQuery(sql_text);
            while (rs.next()){
                String line = rs.getInt("id")+"-"+rs.getString("name");
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
