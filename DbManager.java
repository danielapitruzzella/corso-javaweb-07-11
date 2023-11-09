import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
    String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    String DB_URL ="jdbc:mysql://localhost:3306/scuola";
    String DB_USERNAME = "root";
    String DB_PASSWORD = "root";
    
/* 
    public static void main(String[] args) {
        DbManager dbManager = new DbManager();
        dbManager.connect();
    }
*/
//quello che c'è da scrivere nel main
  
    public void connect() {
        Connection conn = null;
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            if (conn != null) {
                System.out.println("Successfully connected");
            } else {
                System.out.println("Failed to connect");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}