import java.sql.*;

public class Main {
    public static void main(String[] args)throws SQLException {
        Connection connection=null;
        DbHelper helper=new DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        try{
            connection=helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select * from sınıf");
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        }
        catch(SQLException exception){
            helper.getErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
}