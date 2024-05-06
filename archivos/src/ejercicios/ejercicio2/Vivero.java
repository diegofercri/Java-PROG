package ejercicios.ejercicio2;

import java.io.*;
import java.util.ArrayList;

public class Vivero {

    public static File archivo = new File(".\\src\\ejercicios\\ejercicio2\\Plantas.venta");  
    public static void main(String[] args) {
		//obtener los objetos Planta
		ArrayList<Planta> listaDePlantas = getPlantas();
		System.out.println(listaDePlantas);
		//actualizar el precio de los objetos Planta
		actualizarPrecio(listaDePlantas);
		System.out.println(listaDePlantas);
		//guardar los objetos Planta en el archivo
		savePlantas(listaDePlantas);
		System.out.println( getPlantas() );
    }

    public static ArrayList<Planta> getPlantas() {
        ArrayList<Planta> lista = new ArrayList<Planta>();
		ObjectInputStream stream = null;

        try {
			stream = new ObjectInputStream(new FileInputStream(archivo));

			while(true) {
				Planta p = (Planta) stream.readObject();
				lista.add(p);
			}

        } catch (EOFException e) {
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
			e.printStackTrace();
            System.out.println("No se puede leer el archivo");
        } catch (ClassNotFoundException e) {
            System.out.println("El archivo no contiene objetos de tipo Planta");
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                System.out.println("No se puede cerrar el archivo");
            }
        }

        return null;
    }

    public static void actualizarPrecio(ArrayList<Planta> listaDePlantas) {
		for (Planta planta : listaDePlantas) {
			if(planta.getCantidad() < 10) {
				planta.setPrecio( planta.getPrecio() * 0.8 );
			}else if(planta.getCantidad() <= 50) {
				planta.setPrecio( planta.getPrecio() * 0.7 );
			}else {
				planta.setPrecio( planta.getPrecio() * 0.6 );
			}
		}
	}

    public static void savePlantas(ArrayList<Planta> listaDePlantas) {
		ObjectOutputStream stream = null;

		try {
			stream = new ObjectOutputStream(new FileOutputStream(archivo));

			for (Planta planta : listaDePlantas) {
				stream.writeObject(planta);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error de escritura");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("No se puede cerrar el archivo");
			}
		}
	}
}
