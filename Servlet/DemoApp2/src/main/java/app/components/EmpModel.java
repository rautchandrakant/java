package app.components;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class EmpModel {
    public void getEmployees() throws SQLException{
        var con = DriverManager.getConnection("jdbc:mysql://dac13.local/cdac", "root", "password");

        var statement = con.createStatement();
        var result = statement.executeQuery("select empno , ename, job, sal, deptno from emp");
        result.next();
        var model = new Employees(result);
        
    }
}