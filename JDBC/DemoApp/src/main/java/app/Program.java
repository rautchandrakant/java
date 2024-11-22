package app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException {
        //step 1: connection to the database;
        Connection con = DriverManager.getConnection("jdbc:mysql://DAC13.local/cdac","root", "password");

        //step 2: Create a statement i.e (Statement(),PreparedStatement(),CallableStatement())
        CallableStatement statement1 = con.prepareCall("{call proce5()}");

        statement1.execute();
        con.close();

    }
}
