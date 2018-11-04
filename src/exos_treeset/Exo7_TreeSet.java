package exos_treeset;

import java.util.TreeSet;

//  Ecrire un programme Java pour obtenir le nombre d'éléments d'un TreeSet.
public class Exo7_TreeSet 
{
	public static void main(String[] args) 
	{
		// Declarer et Affecter l'objet ts1 de la classe TreeSet
		TreeSet<String> ts1 = new TreeSet();
		ts1.add("2");
		ts1.add("b");
		ts1.add("false");
		ts1.add("Tigre");
		ts1.add("Puma");
		ts1.add("Jaguar");
		ts1.add("Guépard");
		
		System.out.println("Contenu du TreeSet n° 1 : " + ts1);
		System.out.println("Nombre d'element(s) du TreeSet n° 1 : " + ts1.size());
	}
}