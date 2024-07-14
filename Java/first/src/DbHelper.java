import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static String username="root";
    static String password="123456";
    static String dburl="jdbc:mysql://localhost:3306/deneme";

    public Connection getConnection()throws SQLException {
        return DriverManager.getConnection(dburl,username,password);
    }

    public void getErrorMessage(SQLException exception) {
        System.out.println("Hata Mesajı ="+ exception.getMessage());
        System.out.println("Hata kodu :"+exception.getErrorCode());
    }
}
