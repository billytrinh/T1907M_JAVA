package connector;

import java.sql.*;

public class Connector { // ket noi db va truy van - trong java co trinh don rac
    private String url = "jdbc:mysql://localhost:3306/t1907m";
    private String username = "root";// thuong thi luon la root
    private String password = "root"; // "" neu dung xampp "root" neu dung mamp

    private Statement stm;

    private static Connector con; // ko lien quan den doi tuong khi sinh ra

    private Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url,username,password);
            stm = conn.createStatement();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Connector getInstance(){
        if(con==null){
            con = new Connector();
        }
        return con;
    }

    public ResultSet getQuery(String sql) throws Exception{
        return stm.executeQuery(sql);
    }

    public Boolean excuteUpdate(String sql) throws Exception{
        if(stm.executeUpdate(sql) > 0){
            return true;
        }
        return false;
    }

}
