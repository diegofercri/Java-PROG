package facultad;

public class Ejecutar {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Laura", "Vico","039448485F", "S1DAM");
		Estudiante e2 = new Estudiante("Marcos", "Ruiz","574364733K", "S2DAM");
		Estudiante e3 = new Estudiante("Gema", "Santos","828273738L", "S1DAM");
		
		Profesor p1 = new Profesor( "Luis", "Gonzalez", "336266622V", 201, "Sistemas");
		Profesor p2 = new Profesor( "Sonia", "Ramos", "032233337M", 201, "Arquitectura");
		Profesor p3 = new Profesor( "Ana", "Perez", "012293834B", 204, "Sistemas");
		
		PersonaServicio ps1 = new PersonaServicio("Marina", "Gomez", "111929233Y", 204, "Decanato");
		PersonaServicio ps2 = new PersonaServicio("Angel", "Arias", "029239393J", 106, "Biblioteca");
		PersonaServicio ps3 = new PersonaServicio("Jorge", "Luna", "998383838F", 307, "Secretaria");
		
		
		Facultad f = new Facultad();
		
		f.add(e1);
		f.add(e2);
		f.add(e3);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(ps1);
		f.add(ps2);
		f.add(ps3);
		
		System.out.println(f);
		
		System.out.println("Alumnos de S1DAM: " + f.getAlumnosPorCurso("S1DAM"));
		System.out.println("Personal en el despacho 204: " + f.getPersonalPorDespacho(204));

		System.out.println("Alumnos de S1DAM: " + f.getAlumnosPorCursoArray("S1DAM"));
		System.out.println("Personal en el despacho 204: " + f.getPersonalPorDespachoArray(204));
	}

}
