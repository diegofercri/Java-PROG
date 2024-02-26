package banco;

public class Ejecutar {
    public static void main(String[] args) {

        Fijo fijo1 = new Fijo("Laura Vico", 15000, 3, 0.5);
        Fijo fijo2 = new Fijo("Marcos Ruiz", 15000, 2, 0.5);
        Fijo fijo3 = new Fijo("Gema Santos", 25000, 4, 0.5);

        Variable vari1 = new Variable("Luis Gonzalez", 15000, 2, 0.5, 0);
        Variable vari2 = new Variable("Sonia Ramos", 15000, 4, 0.25);
        Variable vari3 = new Variable("Ana Perez", 25000, 1, 0.25);

        Pasivo pasivo = new Pasivo();

        pasivo.add(fijo1);
        pasivo.add(fijo2);
        pasivo.add(fijo3);
        pasivo.add(vari1);
        pasivo.add(vari2);
        pasivo.add(vari3);

        System.out.println(pasivo);

        System.out.println(pasivo.getPrestamosFijos());
        System.out.println(pasivo.getPrestamosVariables());


        System.out.println("Prestamos Fijos: " + pasivo.getPrestamosFijosArray());
        System.out.println("Prestamos Variables: " + pasivo.getPrestamosVariablesArray());
    }
}
