
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //1. Crear la instancia de la clase Connection de JAR JDBC
    
    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g56_db";
    String usuario = "root";
    String contrasena ="";
        
    //2. Añadimos el constructos de la clase sin argumnetos

    public Conexion() {
        //3. Intentar hacer conexion con la base de datos desde el constructor de la clase
        try {   
            Class.forName(driver);
            //4. Llamamos la instancia conection a la cual le enviamos los parametros de conexion de BD
            connection=DriverManager.getConnection(cadenaConexion,usuario, contrasena);
            if(connection != null){
                System.out.println("Conexion exitosa");
            }        
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion fallida");   
        }
        
    }
    
    public Connection getConnection(){
        return connection;
    }
}
