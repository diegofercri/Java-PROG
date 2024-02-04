public class Ejer4 {
    /*
     * Método factorial(), que calculará el factorial del número que se le pasa como
     * parámetro. Retornará el resultado del calculo del factorial, o bien un -1 en caso
     * de que el parámetro pasado sea negativo, y un -2 en caso de que el parámetro
     * pasado sea cero.
     */

    public static void main(String[] args) {
        int n = 5;
        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }
    
    public static int factorial(int numero) {
        if(numero < 0 ) return -1;
		if(numero == 0 ) return -2;
		
		if (numero == 1) { 
			return 1;
		} else {
			return numero * factorial(numero-1);
		}
    }
}
