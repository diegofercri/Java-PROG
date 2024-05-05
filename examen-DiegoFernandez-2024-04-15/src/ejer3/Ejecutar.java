package ejer3;

public class Ejecutar {
    public static void main(String[] args) {
        char[][] sopa = {
                { 'A', 'N', 'Z', 'E', 'T' },
                { 'D', 'F', 'R', 'M', 'A' },
                { 'R', 'A', 'U', 'C', 'F' },
                { 'I', 'S', 'T', 'O', 'E' },
                { 'O', 'C', 'A', 'S', 'A' }
        };

        SopaDeLetras sopaDeLetras = new SopaDeLetras(sopa);

        System.out.println(sopaDeLetras.buscaPalabra("CASA"));
        System.out.println(sopaDeLetras.buscaPalabra("RUTA"));
        System.out.println(sopaDeLetras.buscaPalabra("DIA"));
        System.out.println(sopaDeLetras.buscaPalabra("DIEGO"));
    }
}
