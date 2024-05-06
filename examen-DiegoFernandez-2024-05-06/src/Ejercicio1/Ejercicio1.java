package ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ejercicio1 {

    public static File archivoLlamadas = new File(".\\src\\ejercicio1\\llamadas.txt");
    public static File archivoResumen = new File(".\\src\\ejercicio1\\resumen.txt");

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = leerLlamadas();
        System.out.println(clientes);
        escribirResumen(clientes);
        System.out.println(clientes);
    }

    public static ArrayList<Cliente> leerLlamadas() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        BufferedReader stream = null;

        try {
            stream = new BufferedReader(new FileReader(archivoLlamadas));
            String linea;
            
            while ((linea = stream.readLine()) != null) {
                StringTokenizer llamada = new StringTokenizer(linea, "-");
                while (llamada.hasMoreTokens()) {
                    StringTokenizer clienteToken = new StringTokenizer(llamada.nextToken(), " ");
                    while (clienteToken.hasMoreTokens()) {
                        int id = Integer.parseInt(clienteToken.nextToken());
                        int destino = Integer.parseInt(clienteToken.nextToken());

                        Cliente cliente = findClienteById(clientes, id);
                        if (cliente == null) {
                            cliente = new Cliente(id);
                            clientes.add(cliente);
                        }
                        cliente.getDestinos().add(destino);
                    }
                }
                
            }
        } catch (IOException e) {
            System.out.println("No se puede leer el archivoLlamadas");
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                System.out.println("No se puede cerrar el archivoLlamadas");
            }
        }
        return clientes;
    }

    public static void escribirResumen(ArrayList<Cliente> clientes) {
        BufferedWriter stream = null;

        try {
            stream = new BufferedWriter(new FileWriter(archivoResumen));
            for (Cliente cliente : clientes) {
                stream.write(cliente.toString());
                stream.newLine();
            }
        } catch (IOException e) {
            System.out.println("No se puede escribir el archivo");
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                System.out.println("No se puede cerrar el archivo");
            }
        }
    }

    public static Cliente findClienteById(ArrayList<Cliente> clientes, int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
}
