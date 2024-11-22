package app.components;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class Module extends HttpServlet {
    static String url = "jdbc:mysql://localhost:3306/cdac";
    static String user = "root";
    static String password = "password";
    static Connection conn1;

    static PreparedStatement stmt;
    static Statement stmt2;

    @Override
    public void init() throws ServerException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn1 = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeErrorException(e);
        }catch(SQLException e){
            throw new RuntimeErrorException(e);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException{
        response.setContentType("text/html");
        PrintWriter p=response.getWriter();
    }
}
