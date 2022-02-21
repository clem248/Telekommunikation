package sample.configs;
import sample.Worker;
import sample.configs.Configs;
import sample.configs.Const;
import java.sql.ResultSet;
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
    public void  signUpUser(Worker worker){
        String insert = "INSERT INTO "+ Const.WORKERS_TABLE + "(" + Const.WORKERS_FIRSTNAME + "," + Const.WORKERS_LASTNAME + "," + Const.WORKERS_WORKERNAME + ","
                + Const.WORKERS_PASSWORD + "," + Const.WORKERS_LOCATION + "," + Const.WORKERS_GENDER + ")" + "VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, worker.getFirstname());
            prSt.setString(2, worker.getWorkername());
            prSt.setString(3, worker.getLastname());
            prSt.setString(4, worker.getPassword());
            prSt.setString(5, worker.getLocation());
            prSt.setString(6, worker.getGender());
            prSt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getUser (Worker worker){
        ResultSet resSet = null;
        String select = "select * from workers where workername =? AND password =?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, worker.getWorkername());
            prSt.setString(2, worker.getPassword());

            resSet = prSt.executeQuery();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;

    }
}
