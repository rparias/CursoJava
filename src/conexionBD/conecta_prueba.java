package conexionBD;

import java.sql.*;

public class conecta_prueba {
    public static void main(String[] args) {
        try{
            //Paso 1: Establecer conexion con la BD
            Connection miConexion = DriverManager.getConnection("jdbc:sqlserver://;database=pruebaJava;integratedSecurity=true;");

            //Paso 2: crear objStatement
            Statement miStatement = miConexion.createStatement();

            //Paso 3: ejecutar sentencia SQL
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM productos");

            //Paso 4: leer resultSet
            while(miResultSet.next()){
                System.out.println(miResultSet.getString("NombreArticulo") + " " + miResultSet.getString("Fecha")
                + " " + miResultSet.getString("PaisOrigen"));
            }

        }catch (Exception e){
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }
    }
}
