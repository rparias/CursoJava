package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class modifica_BD {
    public static void main(String[] args) {
        try{
            //Paso 1: Establecer conexion con la BD
            Connection miConexion = DriverManager.getConnection("jdbc:sqlserver://;database=pruebaJava;integratedSecurity=true;");

            //Paso 2: crear objStatement
            Statement miStatement = miConexion.createStatement();

            String instruccionSQL = "INSERT INTO PRODUCTOS (CodigoArticulo, Seccion, NombreArticulo, Precio, Fecha, Importado, PaisOrigen)" +
                    " values (8, 'Confección', 'Pantalón', 25.35, '2017-09-10', 0, 'Ecuador')";

            miStatement.executeUpdate(instruccionSQL);

            System.out.println("Datos ingresados correctamente");

        }catch (Exception e){
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }
    }
}
