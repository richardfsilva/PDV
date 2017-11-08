/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexao {
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://localhost/restaurante";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    public Connection getConexao() {
        try {
            Class.forName(DRIVER);
           
                return DriverManager.getConnection(URL, USUARIO, SENHA);
           
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
    }
}
