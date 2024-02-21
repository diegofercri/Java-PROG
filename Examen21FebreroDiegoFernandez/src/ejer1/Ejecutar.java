package ejer1;

public class Ejecutar {
    public static void main(String[] args) {
        Horario horario = new Horario();
        String[] modulos = {"BDD", "SISI", "LM", "ENDE", "PROG", "FOL", "ING"};
        int[] horas = {6, 6, 4, 3, 6, 3, 2};

        horario.rellenar(modulos, horas);
        horario.get();
    }
}
