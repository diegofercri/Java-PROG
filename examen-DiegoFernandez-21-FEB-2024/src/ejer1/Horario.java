package ejer1;
import java.util.Random;

public class Horario {
    // Atributos
    private String[][] horario;

    // Constructor
    public Horario() {
        horario = new String[5][6];
    }

    // Metodo para mostrar el horario
    public void get() {
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                System.out.print(horario[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Metodos
    // Metodo para asignar un modulo a un dia y hora concretos
    public void setModulo(int dia, int hora, String modulo) {
        if (diaValido(dia) && horaValida(hora)) {
            horario[dia - 1][hora - 1] = modulo;
        } else {
            System.out.println("Día u hora no válida");
        }
    }

    // Metodo para obtener el modulo asignado a un dia y hora concretos
    public String getModulo(int dia, int hora) {
        if (diaValido(dia) && horaValida(hora)) {
            return horario[dia - 1][hora - 1];
        } else {
            return "Día u hora no válida";
        }
    }

    // Metodo para rellenar aleatoriamente el horario con los modulos y horas asignadas
    public void rellenar(String[] modulos, int[] horas) {
        int totalHoras = 0;
        // Comprobamos que la suma de las horas sea 30 recorriendo el array de horas y sumandolas
        for (int i = 0; i < horas.length; i++) {
            totalHoras += horas[i];
        }

        if (totalHoras != 30) {
            System.out.println("La suma de las horas no es correcta, ya que no es igual a 30");
            return;
        }

        // Creamos un objeto de la clase Random para generar numeros aleatorios
        Random random = new Random();
        // Recorremos el array de modulos y vamos asignando aleatoriamente
        for (int i = 0; i < modulos.length; i++) {
            int horasAsignadas = 0;
            while (horasAsignadas < horas[i]) {
                int dia = random.nextInt(5) + 1;
                int hora = random.nextInt(6) + 1;
                // Comprobamos que el modulo no este ya asignado a ese dia y hora y si no lo esta lo asignamos y sumamos 1 a horasAsignadas
                if (horario[dia - 1][hora - 1] == null) {
                    horario[dia - 1][hora - 1] = modulos[i];
                    horasAsignadas++;
                }
            }
        }
    }
    
    // Metodo para comprobar si un dia es valido
    private boolean diaValido(int dia) {
        return dia > 0 && dia < 6;
    }

    // Metodo para comprobar si una hora es valida
    private boolean horaValida(int hora) {
        return hora > 0 && hora < 7;
    }
}