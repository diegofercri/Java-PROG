public class For4 {
    public static void main(String[] args) throws Exception {
        for (int t = 0; t < 11; t++) {
            System.out.println("\nTabla del " + t + ":");
            for (int i = 0; i < 11; i++) {
                int acumulador = t * i;
                System.out.println(t + " x " + i + " = " + acumulador);
            }
        }
    }
}
