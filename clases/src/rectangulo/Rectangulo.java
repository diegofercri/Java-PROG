/*
 * Escribe una clase llamada Rectángulo que posea dos atributos de tipo entero llamados ancho y alto. 
 * La clase debe poseer los siguientes métodos:
 * 
 * - Un método constructor que no reciba ningún parámetro y que inicialice las dimensiones del rectángulo
 *   (ancho y alto) con dos enteros positivos por defecto.
 * 
 * - Otro método constructor que reciba el alto y el ancho como parámetros. Se debe chequear que ambos valores
 *   sean positivos antes de asignárselos a los atributos correspondientes. En caso contrario, se asignarán
 *   valores por defecto.
 * 
 * - Métodos get y set para la clase. Los métodos set deben chequear que las nuevas dimensiones efectivamente
 *   sean enteros positivos.
 * 
 * - Un método que calcule y retorne el área del rectángulo.
 * 
 * - Método que calcule y retorne el perímetro del rectángulo.
 * 
 * - Otro método que determine si el rectángulo es horizontal o vertical. Decimos que el rectángulo es horizontal
 *   si el valor del ancho es mayor que el del alto. En caso contrario, decimos que el rectángulo es vertical.
 * 
 * - Un método que despliegue en pantalla los valores de las dimensiones (ancho y alto) del rectángulo.
 * 
 * - Otro método que dibuje en pantalla el rectángulo mediante asteriscos, utilizando tantas columnas como valor tenga
 *   el ancho y tantas filas como valor tenga el alto. Por ejemplo, si el alto valiera 3 y el ancho valiera 12, se
 *   debería desplegar así:
 *   
 *   ************
 *   ************
 *   ************
*/

package rectangulo;

public class Rectangulo {
    // Atributos
    private int ancho;
    private int alto;

    // Constructores
    public Rectangulo() {
        ancho = (int) (Math.random() * 10) + 1;
        alto = (int) (Math.random() * 10) + 1;
    }

    public Rectangulo(int ancho, int alto) {
        if (ancho > 0) {
            this.ancho = ancho;
        } else {
            ancho = (int) (Math.random() * 10) + 1;
        }

        if (alto > 0) {
            this.alto = alto;
        } else {
            alto = (int) (Math.random() * 10) + 1;
        }
    }

    // Getters y Setters
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        } else {
            this.ancho = (int) (Math.random() * 10) + 1;
        }
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        if (alto > 0) {
            this.alto = alto;
        } else {
            this.alto = (int) (Math.random() * 10) + 1;
        }
    }

    // Métodos
    public int area() {
        return this.ancho * this.alto;
    }

    public int perimetro() {
        return this.ancho * 2 + this.alto * 2;
    }

    public boolean horizontal() {
        return this.ancho > this.alto;
    }

    public boolean vertical() {
        return this.alto > this.ancho;
    }

    public String dimensiones() {
        return "Ancho: " + this.ancho + "\nAlto: " + this.alto;
    }

    public String dibujar() {
        String rectangulo = "";
        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                rectangulo += "*";
            }
            rectangulo += "\n";
        }
        return rectangulo;
    }
}