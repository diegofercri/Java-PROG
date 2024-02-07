import java.util.Scanner;

public class Ejer13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        /* Este método es super ineficiente, pero funciona correctamente,
        aunque desborda y da un resultado negativo, por eso mismo multiplicamos
        por -1 y arreglamos el problema, aunque de manera chapucera */

        // Solicita al usuario que introduzca dos números
        System.out.println("Introduce dos numeros y te dire su mcm: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Inicializa el número primo a 2 (el primer número primo)
        int primo = 2;

        // Inicializa el mcm a -1
        long mcm = -1;

        // Mientras ambos números sean mayores o iguales a 1
        while (num1 >= 1 && num2 >= 1) {
            // Si ambos números son divisibles por el número primo
            if (num1 % primo == 0 && num2 % primo == 0) {
                // Divide ambos números por el número primo
                num1 /= primo;
                num2 /= primo;
                // Multiplica el mcm por el número primo
                mcm *= primo;
            } 
            // Si solo el primer número es divisible por el número primo
            else if (num1 % primo == 0) {
                // Divide el primer número por el número primo
                num1 /= primo;
                // Multiplica el mcm por el número primo
                mcm *= primo;
            } 
            // Si solo el segundo número es divisible por el número primo
            else if (num2 % primo == 0) {
                // Divide el segundo número por el número primo
                num2 /= primo;
                // Multiplica el mcm por el número primo
                mcm *= primo;
            } 
            // Si ninguno de los números es divisible por el número primo
            else {
                // Incrementa el número primo en 1
                primo++;
            }
        }

        // Imprime el mcm calculado
        System.out.print(mcm);

        // Cierra el escáner para liberar recursos
        scanner.close();
    }
}
