package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DiaTemperatura {
    public static void main(String[] args) {

        File archive = new File("temperatura.txt");
        DataInputStream stream = null;
        System.out.print("Introduce el numero del dia del que quieres saber la temperatura: ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        input.close();
        int count = 0;
        double temp = 0.0;

        try {
            stream = new DataInputStream(new FileInputStream(archive));
            while (true) {
                temp = stream.readDouble();
                if (day == count) {
                    System.out.println("La temperatura del dia " + day + " es: " + temp);
                    break;
                }
                count++;
            }
        } catch (EOFException e) {
            System.out.println("Fin del archivo, el dia no esta registrado");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.out.println("El archivo no se puede leer");
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                System.out.println("No se puede cerrar el archivo");
            }
        }
    }
}
