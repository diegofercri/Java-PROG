public class Ejer7 {
    /*
     * Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de
     * caracteres. Estos métodos reciben un String y retornan ese String ya cifrado o
     * descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que está
     * dos puestos mas adelante( la ‘a’ se cambia por la ‘c’), teniendo en cuenta que el
     * cambio es circular, es decir, la ‘z’ se cambiará por la ‘b’. El proceso de
     * descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán
     * ningún cambio.
     */
    public static void main(String[] args) {
        String frase = "DiegozZyYaAbB";
        System.out.println(descifrar(cifrar(frase)));
    }

    public static String cifrar(String frase) {
        StringBuilder cifrado = new StringBuilder();

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'Y') {
                    c = 'A';
                } else if (c == 'y') {
                    c = 'a';
                } else if (c == 'Z') {
                    c = 'B';
                } else if (c == 'z') {
                    c = 'b';
                } else {
                    c += 2;
                }
                cifrado.append(c);
            } else {
                cifrado.append(c);
            }
        }

        return cifrado.toString();
    }

    public static String descifrar(String frase) {
        StringBuilder descifrado = new StringBuilder();

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'A') {
                    c = 'Y';
                } else if (c == 'a') {
                    c = 'y';
                } else if (c == 'B') {
                    c = 'Z';
                } else if (c == 'b') {
                    c = 'z';
                } else {
                    c -= 2;
                }
                descifrado.append(c);
            } else {
                descifrado.append(c);
            }
        }

        return descifrado.toString();
    }
}
