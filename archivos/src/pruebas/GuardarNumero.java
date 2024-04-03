package pruebas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class GuardarNumero {
    public static void main(String[] args) throws Exception {
        int num = 20;
        File archive = new File("numero.txt");
        try {
            FileOutputStream stream = new FileOutputStream(archive);
            DataOutputStream data = new DataOutputStream(stream);
            data.write(num);
            data.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
    }
}
