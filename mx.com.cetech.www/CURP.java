import java.util.Scanner;

public class CURP {

	public static void main(String[] args) 
	{
		//ENTRADA DE DATOS DEL USUARIO
		Scanner teclado = new Scanner(System.in);
		
		/*
		 * CREACION DE LAS VARIABLES
		 */
		
		//STRINGS NOMBRE COMPLETO
		String nombre, aPaterno, aMaterno, aux = null;
		
		//INT FECHA DE NACIMIENTO
		int dia, mes, anio;
		String fechaCompleta;
		
		//STRING GENERO Y CIUDAD
		String genero, ciudad;
		
		/*
		 * VRIABLES DE SPLIT NOMBRE COMPLETO
		 */
		
		//SPLIT NOMBRE
		String nombreSplit, aPaternoSplit, aMaternoSplit, nombreCompletoSplit;
		
		//SPLIT FECHA DE NACIMIENTO
		String diaSplit, mesSplit, anioSplit;
		
		//SPLIT GENERO Y CIUDAD
		String generoSplit, ciudadSplit;
		
		/*
		 * UPPERCASE SPLIT
		 */
		
		//SPLIT UPPERCASE
		String pCorte;
		
		//BIENVENIDA AL USUARIO
		System.out.println("...:::CREACION DE CURP:::...");
		
		//OBTENCION DEL NOMBRE
		System.out.println("ESCRIBA SU NOMBRE: ");
		nombre = teclado.nextLine();
		
		//OBTENCION DEL APELIDO PATERNO
		System.out.println("ESCRIBA SU APPELIDO PATERNO: ");
		aPaterno = teclado.nextLine();
		
		//OBTENCION DEL APELLIDO MATERNO
		System.out.println("ESCRIBA SU APPELIDO MATERNO: ");
		aMaterno = teclado.nextLine();
		
		
		/*
		 * SIGUE OBTENCION DE EFECHA DE NACIMIENTO
		 */
		
		//MENSAJE AL USUARIO
		System.out.println("A CONTINUACION INTRODUZCA LOS DATOS DE SU FECHA DE NACIMIENTO");
		
		//OBTENCION DEL AÑO
		System.out.println("ESCRIBA SU ANIO DE NACIMIENTO (DD/MM/AAAA) (DEBE AGREGAR LAS DIAGONALES) : ");
		fechaCompleta = teclado.next();
		
		
		/*
		 * SIGUE OBTENCION DE DATOS COMPLEMENTARIOS
		 */
		
		//MESNAJE AL USUARIO
		System.out.println("RESPONDA EST DOS ULTIMAS PREGUNTAS DEL MODO QUE SE INDICA");
		
		//OBTENCION DEL GENERO
		System.out.println("CUAL ES SU GENERO, RESPONDA H ó M SEGUN CORRESPONDA");
		genero = teclado.next();
		
		//OBTENCION DE LA CIUDAD
		System.out.println("CIUDAD DONDE RECIDA, RESPONDA: DF O EDO MEX SEGUN CORRESPONDA");
		ciudad = teclado.next();
		
		/*
		 * SIGUE CORTES DEL NOMBRE
		 */
		
		//SPLIT DE NOMBRE
		
		for(int i=1; i<aPaterno.length();i++){
			aux = aPaterno.substring(i, i+1);
			
				if (aux.equals("A")||aux.equals("E")||aux.equals("I")||aux.equals("U")||aux.equals("U")){
					break;}
				}
		
		aPaternoSplit = aPaterno.substring(0, 1) + aux;
		aMaternoSplit = aMaterno.substring(0, 1);
		nombreSplit = nombre.substring(0, 1);
		
		nombreCompletoSplit = aPaternoSplit + aMaternoSplit + nombreSplit;
		
		/*
		 * SIGUE CORTES DE LA FECHA DE NACIMIENTO
		 */
		
		String paraCorteFeecha [] = fechaCompleta.split("/");
			
		diaSplit = paraCorteFeecha[0];
		mesSplit = paraCorteFeecha[1];
		anioSplit = paraCorteFeecha[2];
		anioSplit = anioSplit.substring(2, 4);
		
		/*
		 * CONCATENACION DE LAS VARIABLES
		 */
		
		System.out.println(nombreCompletoSplit + anioSplit + mesSplit + diaSplit + genero + ciudad);
		
		
		}
		
	}


