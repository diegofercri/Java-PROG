package ejercicios.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Cuenta {
    public static void main(String[] args) {
        File archivo = new File(".\\src\\ejercicios\\ejercicio1\\quijote.txt");
        System.out.println("El archivo tiene " + cuentaPalabras(archivo) + " palabras.");
    }

    public static int cuentaPalabras(File archivo) {
        int contador = 0;
        BufferedReader stream = null;

        try {
            stream = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = stream.readLine()) != null) {
                contador += new StringTokenizer(linea).countTokens();
            }

        } catch (IOException e) {
            System.out.println("No se puede leer el archivo");
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                System.out.println("No se puede cerrar el archivo");
            }
        }

        return contador; 
    }
}