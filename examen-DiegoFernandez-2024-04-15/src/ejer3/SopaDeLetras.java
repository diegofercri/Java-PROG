package ejer3;

public class SopaDeLetras {
    private char[][] sopa;

    public SopaDeLetras(char[][] sopa) {
        this.sopa = sopa;
    }

    public String buscaPalabra(String palabra) {
        // Filas
        for (int i = 0; i < sopa.length; i++) {
            String fila = new String(sopa[i]);
            if (fila.contains(palabra)) {
                return "F" + (i + 1);
            }
        }
        // Columnas
        for (int i = 0; i < sopa[0].length; i++) {
            StringBuilder columna = new StringBuilder();
            for (char[] chars : sopa) {
                columna.append(chars[i]);
            }
            if (columna.toString().contains(palabra)) {
                return "C" + (i + 1);
            }
        }

        return "NE";
    }
}
