//Este programa realiza una peticion al usuario de insertar un pais y el programa busca en su HasMap
//EL pais como llave y da su valor que seria la capital
//En caso de no econtrarlo, pedira al usuario escribir la capital de ese páis y guardarlo
import java.util.HashMap; //importar la libreria de HasMap
import java.util.Scanner;

public class Código7 {

	public static void main(String[] args) { //Falto por main
		Scanner s = new Scanner(System.in); //System.in en el Scanner
		HashMap<String,String> capitales = new HashMap<>(); //Completar la variable capital y corregir el map con <String,String>
		capitales.put("Canadá", "Otawwa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "México DF");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa rica", "San José");
		capitales.put("El Salvador","San Salvador"); //Poner la capital de El Salvador
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Panamá");
		String c = ""; //Declarar bien el tipo String
		
		do {
			System.out.print("Escribe el nombre de un país y te diré su capital: "); //Es System.out no System.in
			c = s.nextLine(); //Line para recibir un String no Double
			
			if (!c.equals("salir")) { //Falto una s en el equals
				if (capitales.containsKey(c)) { //Completar la variable capitales y cambiar el containerValue por containsKey
					System.out.print("La capital de " + c);//Falto el  .out 
					System.out.println(" es " + capitales.get(c)); //Cambiar put por .get()
				} else {
					System.out.print("No conozco la respuesta ");
					System.out.print("¿cuál es la capital de " + c + "?: ");
					String ca = s.nextLine();
					capitales.put(c, ca); //Variable capitales
					System.out.println("Gracias por enseñarme nuevas capitales");
				}
			}
	
		}while (!c.equals("salir")); //Escribir bien while y cerrar el parentesis y poner la linea alado del corchete
	}
}
