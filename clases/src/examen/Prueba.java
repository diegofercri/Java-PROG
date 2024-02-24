package examen;

import examen.Estudiante.Curso;
import examen.PersonaDeServicio.Seccion;
import examen.Profesor.Departamento;

public class Prueba {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("039448485F", "Laura Vico", Curso.Primero);
		Estudiante e2 = new Estudiante("574364733K", "Marcos Ruiz", Curso.Primero);
		Estudiante e3 = new Estudiante("828273738L", "Gema Santos", Curso.Segundo);
		
		Profesor p1 = new Profesor("336266622V", "Luis Gonzalez", 2010, 204, Departamento.Sistemas);
		Profesor p2 = new Profesor("032233337M", "Sonia Ramos", 2019, 201, Departamento.Arquitectura);
		Profesor p3 = new Profesor("012293834B", "Ana Perez", 2022, 204, Departamento.Sistemas);
		
		PersonaDeServicio ps1 = new PersonaDeServicio("111929233Y", "Marina Gomez", 2008, 204, Seccion.Decanato);
		PersonaDeServicio ps2 = new PersonaDeServicio("029239393J", "Angel Arias", 2016, 106, Seccion.Biblioteca);
		PersonaDeServicio ps3 = new PersonaDeServicio("998383838F", "Jorge Luna", 2021, 307, Seccion.Secretaria);
		
		
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
		
		System.out.println("Alumnos de 1�: " + f.getAlumnosPorCurso(Curso.Primero));
		System.out.println("Personal en el despacho 204: " + f.getPersonalPorDespacho(204));
	}

}
