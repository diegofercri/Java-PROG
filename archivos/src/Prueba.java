public class Prueba {
    public static void main(String[] args) throws Exception {
        File archive = new File("C:\Users\micro\Downloads\Diego.txt");

        if (archive.exists()) {
            System.out.println("El archivo existe");
            System.out.println("Ruta: " + archive.getAbsolutePath());
            System.out.println("Tamaño: " + archive.length() + " bytes");
            System.out.println("Ultima modificacion: " + new Date(archive.lastModified()));
        }

    }
}
