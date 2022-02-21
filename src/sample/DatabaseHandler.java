package sample;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DatabaseHandler extends Configs {
    Connection dbConnection;
    public Connection getDbConnection () throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" +dbPort + "/" +dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbConnection;
    }
    public void  signUpUser(String firstName, String lastName,String workerName, String password, String location, String gender){
        String insert = "INSERT INTO "+ Const.WORKERS_TABLE + "(" + Const.WORKERS_FIRSTNAME + "," + Const.WORKERS_LASTNAME + "," + Const.WORKERS_WORKERNAME + ","
                + Const.WORKERS_PASSWORD + "," + Const.WORKERS_LOCATION + "," + Const.WORKERS_GENDER + ")" + "VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, firstName);
            prSt.setString(2, lastName);
            prSt.setString(3, workerName);
            prSt.setString(4, password);
            prSt.setString(5, location);
            prSt.setString(6, gender);
            prSt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
