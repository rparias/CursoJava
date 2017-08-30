package colecciones;

import java.util.HashSet;
import java.util.Set;

public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Ronald Arias", "00001", 20000);
        Cliente cl2 = new Cliente("Gabby Sanmartin", "00002", 15000);
        Cliente cl3 = new Cliente("Erick Arias", "00003", 30000);
        Cliente cl4 = new Cliente("Juan Perez", "00004", 10000);
        Cliente cl5 = new Cliente("Juan Perez", "00004", 10000);

        //creo una coleccion tipo Set porque no voy a repetir clientes ni ordenarlos
        Set <Cliente> clientesBanco = new HashSet<>();
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);

        //ahora no agrega este ultimo porque es un libro igual por numero de cuenta por el equals
        clientesBanco.add(cl5);

        //recorrer la coleccion con un foreach
        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.getNombre() + " | " + cliente.getNumeroCuenta() + " | " + cliente.getSaldo());
        }
    }
}
