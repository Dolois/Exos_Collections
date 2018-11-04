package exos.collections;

import java.util.HashSet;

// Ecrire un programme Java pour convertir un HashSet en un tableau.
public class Exo7_HashSet 
{
	public static void main(String[] args) 
	{
		// Creer une instance de la classe HashSet
		HashSet<String> hs1 = new HashSet<String>();
		
		// Ajouter et initialiser des elements dans la HashSet
		hs1.add("a");
		hs1.add("b");
		hs1.add("c");
		hs1.add("B");
		hs1.add("A");
		hs1.add("C");
		System.out.println("HashSet sans iterator : " + hs1);

		// Declarer et Initialiser un tableau en donnant sa taille (du HashSet)
		String[] tab = new String[hs1.size()];
		
		hs1.toArray(tab);
		System.out.println("Tableau sans iterator : " + hs1);
		
		System.out.print("\nTableau avec iterator : ");
		for(String e : tab)
		{
			System.out.print(e + ", ");
		}
	}
}