package S1T8N1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{

	public static void main(String[] args) {
		/*- Exercici 1
		A partir d�una llista de Strings, escriu un m�tode que retorna una llista de totes les cadenes que contenen la lletra �o�.
		Imprimeix el resultat.*/

		ArrayList<String> paraules = new ArrayList<>();
		paraules.add("P�jaro");
		paraules.add("Sucursal");
		paraules.add("Silla");
		paraules.add("Estropajo");
		paraules.add("Planta");
		paraules.add("Hola");
		System.out.println("Paraules:");
		paraules.forEach(System.out::println);
		
		System.out.println("\nParaules amb o:");
		List<String> primer = paraules.stream()
			.filter(os -> os.contains("o"))
			.collect(Collectors.toList());
		primer.forEach(System.out::println);
		
		/*- Exercici 2
		Has de fer el mateix que en el punt anterior, per� ara, el m�tode ha de retornar una llista
		amb els Strings que a m�s de contenir la lletra �o� tamb� tenen m�s de 5 lletres. Imprimeix el resultat.*/

		System.out.println("\nParaules amb o y mes de 5 lletres:");
		paraules.stream()
			.filter(os2 -> os2.contains("o"))
			.filter(mesDe5 -> mesDe5.length() > 5)
			.collect(Collectors.toList());
		paraules.forEach(System.out::println);
		
		/*- Exercici 3
		Crea una llista amb els noms dels mesos de l�any. Imprimeix tots els elements de la llista amb una lambda.*/

		ArrayList<String> mesos = new ArrayList<>();
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Mar�");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Septembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Desembre");
		System.out.println("\nMesos amb lambda:");
		mesos.forEach(System.out::println);
		
		/*- Exercici 4
		Fer la mateixa impressi� del punt anterior, per� mitjan�ant method reference.*/ 

		System.out.println("\n"
				+ "Mesos amb method reference:");
		mesos.forEach(System.out::println);
		
		/*- Exercici 5
		Crea una Functional Interface amb un m�tode anomenat getPiValue() que ha de retornar un double.
		Des del main() de la classe principal, inst�ncia la interf�cie i assigna-li el valor 3.1415. Invoca el m�tode getPiValue() i imprimeix el resultat.*/

		System.out.println("\n"
				+ "Numero pi:");
		PiNumber num = () -> {return 3.1415;};
		System.out.println(num.getPiValue());
		
		/*- Exercici 6
		Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de m�s curta a m�s llarga.*/

		ArrayList<String> numCadenes = new ArrayList<>();
		numCadenes.add("5431486");
		numCadenes.add("Anec");
		numCadenes.add("638476");
		numCadenes.add("Granota");
		numCadenes.add("50725");
		numCadenes.add("Rinoceront");
		numCadenes.add("423143");
		numCadenes.add("Zebra");
		numCadenes.add("0");
		numCadenes.add("Gasela");
		numCadenes.add("68,54798");
		numCadenes.add("Cuc");
		System.out.println("\n"
				+ "Cadenes ordenades:");
		numCadenes.sort(Comparator.comparing(String::length));
//		List<String> senseNum = numCadenes.stream()
//				.filter(sin -> (integer)sin / sin == 0)
//	/			.collect(Collectors.toList());
		numCadenes.forEach(System.out::println);
		
		/*- Exercici 7
		Amb la llista de l�exercici anterior, ara ordena-la al rev�s, de cadena m�s llarga a m�s curta.*/
		
		System.out.println("\n"
				+ "Cadenes ordenades enrere:");
		numCadenes.sort(Comparator.comparing(String::length).reversed());
		numCadenes.forEach(System.out::println);
		
		/*- Exercici 8
		Crea una Functional Interface que contingui un m�tode anomenat reverse().
		Aquest m�tode ha de rebre i ha de retornar un String. En el main() de la classe principal,
		injecta a la interf�cie creada mitjan�ant una lambda, el cos del m�tode, de manera que torni la mateixa cadena que rep com a par�metre
		per� al rev�s. Invoca la inst�ncia de la interf�cie passant-li una cadena i comprova si el resultat �s correcte.*/
		
		Reves paraula = (s = "Dolor de cabeza") -> {return s.reversed();};
		System.out.println(paraula.reverse(null));
	}
	
}
