import java.util.Scanner;

public class Ejer14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos palabras e intercalare sus letras: ");
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        int longitud;

        if (str.length() > str1.length()) {
            longitud = str.length();
        } else {
            longitud = str1.length();
        }

        for (int i = 0; i < longitud; i++) {
            
        }
