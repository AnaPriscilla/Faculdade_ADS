/*
 */
package br.com.AnaPriscilla.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @anapriscilla
 */
public class Conexao {
    
    private static Connection c = null;
    
    public static Connection getConnection(){
    
        if(c != null){
            return c;
        }else{
        
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://localhost:5432/bd_anapriscilla";
            String user = "postgres";
            String password = "12356";
            
            try {
                Class.forName(driver);
                c = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return c;
        
        }
    }
}
