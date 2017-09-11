package conexionBD;

import java.sql.*;

public class Inserta_Clientes_Pedidos {
    public static void main(String[] args) {

        Connection miConexion = null;

        try{

            //Paso 1: Establecer conexion con la BD
            miConexion = DriverManager.getConnection("jdbc:sqlserver://;database=pruebaJava;integratedSecurity=true;");

            miConexion.setAutoCommit(false);    //para q se trate a todas las instrucciones como bloque

            //Paso 2: crear objStatement
            Statement miStatement = miConexion.createStatement();

            String instruccionSql_1="INSERT INTO CLIENTES (CODIGOCLIENTE, EMPRESA, DIRECCIÓN) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";
            miStatement.executeUpdate(instruccionSql_1);

            String instruccionSql_2="INSERT INTO PEDIDOS (NUMERODEPEDIDO, CODIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";
            miStatement.executeUpdate(instruccionSql_2);

            miConexion.commit();    //confirma q se ejecuto el bloque entero

            System.out.println("Datos INSERTADOS correctamente");

        }catch(Exception e){
            System.out.println("ERROR EN LA INSERCIÓN DE DATOS!!");

            try {
                miConexion.rollback();  //si el bloque falla no se hace nada
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

            e.printStackTrace();
        }
    }
}
