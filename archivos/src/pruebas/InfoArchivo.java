package pruebas;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class InfoArchivo {
    public static void main(String[] args) throws Exception {
        File archive = new File("C:/Users/micro/Downloads/Diego.txt");

        if (archive.exists()) {
            System.out.println("El archivo existe");
            System.out.println("Ruta: " + archive.getAbsolutePath());
            System.out.println("Tamanio: " + archive.length() + " bytes");
            System.out.println("Ultima modificacion: " + new Date(archive.lastModified()));
            System.out.println("Ultima modificacion: " + DateFormat.getDateInstance().format(new Date(archive.lastModified())));
            System.out.println("Permiso de lectura: " + archive.canRead());
            System.out.println("Permiso de escritura: " + archive.canWrite());
        }

    }
}
