package televisor;

public class Ejecutar {
    public static void main(String[] args) {
        Televisor tv2 = new Televisor(5);
        Televisor tv3 = new Televisor(8,10);

        System.out.println(tv2.getCanal());
        System.out.println(tv3.getCanal());
        System.out.println(tv2.getVolumen());
        System.out.println(tv3.getVolumen());

        tv2.subirVolumen();
        tv3.bajarVolumen();
        tv2.subirCanal();
        tv3.bajarCanal();

        System.out.println(tv2.getCanal());
        System.out.println(tv3.getCanal());
        System.out.println(tv2.getVolumen());
        System.out.println(tv3.getVolumen());
    }
}
