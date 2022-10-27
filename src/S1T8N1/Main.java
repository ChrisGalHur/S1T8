package S1T8N1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*- Exercici 1
		A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’.
		Imprimeix el resultat.

		- Exercici 2
		Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista
		amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.

		- Exercici 3
		Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.

		- Exercici 4
		Fer la mateixa impressió del punt anterior, però mitjançant method reference. 

		- Exercici 5
		Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double.
		Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.

		- Exercici 6
		Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.

		- Exercici 7
		Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.

		- Exercici 8
		Crea una Functional Interface que contingui un mètode anomenat reverse().
		Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal,
		injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre
		però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.*/
		
		ArrayList<String> paraules = new ArrayList<>();
		paraules.add("Pájaro");
		paraules.add("Sucursal");
		paraules.add("Silla");
		paraules.add("Estropajo");
		paraules.add("Planta");
		paraules.add("Hola");
		System.out.println("Paraules: \n" + paraules + "\n");
		
		System.out.println("Paraules amb o:");
		List<String> primer = paraules.stream().
			filter(os -> os.contains("o")).
			collect(Collectors.toList());
		System.out.println(primer + "\n");
		
		System.out.println("Paraules amb o y mes de 5 lletres:");
		List<String> segon = paraules.stream().
			filter(os2 -> os2.contains("o")).
			filter(mesDe5 -> mesDe5.length() > 5).
			collect(Collectors.toList());
		System.out.println(segon + "\n");
		
		
		
		
	}
	
}
