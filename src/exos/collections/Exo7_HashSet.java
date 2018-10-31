package exos.collections;

import java.util.HashSet;

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
		System.out.println("Contenu du HashSet : " + hs1);

		String[] tab = new String[hs1.size()];
		hs1.toArray(tab);
		System.out.print("Contenu du Tableau : ");
		for(String e : tab)
		{
			System.out.print(e + " ");
		}
	}
}