package pandilla;

public class Ejecutar {
    public static void main(String[] args) {
        Pandilla p = new Pandilla(4);

        try {
            p.add(new Amigo("Javier", "Profe"));
            p.add(new Amigo("Ruben", "Rublas"));
            p.add(new Amigo("Luis", "Jhony"));
            p.add(new Amigo("Diego", "Ferxo"));
            p.add(new Amigo("David", "Ocampo"));
            p.add(new Amigo("Anastasio", "Ano"));
        } catch (NoMeGustaTuNombreException e) {
            System.out.println(e.getMessage());
        } catch (PandillaCompletaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(p);

    }
}
