
public class TemaString {

	public static void main(String[] args) 
	{
		//String es una clase de Java que tiene metodos
		
		String str = "Alexis";
		
		//Despues de STR PONEMOS . Y APARECERAN LOS METODOS DE LA CLASE STRING
			
		//METODO QUE TE REGRESA EL TAMAÑO DE LA CADENA
		System.out.println("TAMAÑO DEL STRING: " + str.length());
		
		//METODO QUE TE MUETRA LA POSICION EN DONDE INICIA LO QUE ESTAS BUSCANDO
		String nombre = "Alexis Olveres Medina";
		int posicion = nombre.indexOf("Olv");
		System.out.println("POSICION DE LA APARICION: " + posicion);
		
		//CAMBIAR CARACTERES
		String nuevoNombre = nombre.replace('s', 'z');
		System.out.println("EL NUEVO NOMBRE ES: " + nuevoNombre);
		
		//CAMBIAR STRING COMPLETO
		String nuevoNombreCadena = nombre.replaceAll("Medina", "Majestad Imperial");
		System.out.println("EL NUEVO NOMBRE CON CAMBIO DE CADENA: " + nuevoNombreCadena);
		
		//CAMBIA A MINUSCULAS
		String escuela = "Cetech";
		System.out.println("CAMBIO A MINUSCULAS: " + escuela.toLowerCase());
		
		//CAMBIA A MAYUSCULAS
		System.out.println("CAMBIO A MAYUSCULAS: " + escuela.toUpperCase());
		
		//COMPARAR CADENA (TAMBIEN PUEDE ER UNA VARIABLE)
		System.out.println("SON IGUALES: " + escuela.compareTo("CETECH"));
		
		//ELIMINA ESPACIOS EN BLANCO QUE PUEDA VENIR DE LA BASE DE DATOS
		
		String cadena = "Alexis            ";
		System.out.println("CADENA: " + cadena + "FIN DE CADENA");
		System.out.println("CADENA: " + cadena.trim() + "FIN DE CADENA");
		
		//OBTENER RANGO DE LA CADENA
		String nombreCompletoAgain = "Alexis Olveres Medina";
		System.out.println("USANDO SUBSTRING: " + nombreCompletoAgain.substring(7, 14));
		
		//SPLIT (DIVIDE Y HACE UN ARREGLO
		String fecha = "15 de Julio de 2017";
		String contenedor [] = fecha.split("de");
		
		System.out.println("SPLIT DE FECHA:" + contenedor[1]);
		
		
		for (String recorredor: contenedor){
			System.out.println(recorredor);
		}
		
		
		
		
	}

}
