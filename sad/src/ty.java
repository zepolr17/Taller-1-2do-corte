
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class ty {
    public static void main (String[] args) throws SQLException{
        Connection conexion;
        String url="jdbc:mysql://localhost:3306/javadb";
        String usuario="roots";
        String clave="armando99";
    
    try {
    conexion=DriverManager.getConnection(url,usuario,clave);
    System.out.println("por fin");
    String cadena="INSERT INTO ejemplo(id,plus) VALUES (7,7)";
    Statement sentencia;
    sentencia=conexion.createStatement();
    sentencia.execute(cadena);
    }catch(SQLException ex){
        System.out.ptintln("no meconecte");
        
        int var;
        var=ex.getErrorcode();
        System.out.println(var);
        System.out.println(ex);
        switch(var){
            case 1062:
                {
                    System.out.println('se han dulicado valores');
                    break:
                
            }
            case 1049:
            {
                System.out.println('base datos erronea');
                break:
                default:
                System.out.println('error desconcido');
            }
        }
    } 
}
    
}
