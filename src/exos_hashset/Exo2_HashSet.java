package exos.collections;

import java.util.HashSet;
import java.util.Iterator;

// Ecrire un programme Java pour parcourir tous les éléments d'un HashSet.
public class Exo2_HashSet 
{
	public static void main(String[] args) 
	{
		// Creer une instance de la classe HashSet
		HashSet hs1 = new HashSet();
		
		// Ajouter et initialiser des elements dans la HashSet
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(true);
		hs1.add(false);
		hs1.add("A");
		hs1.add("B");
		hs1.add("C");		// chaine de caracteres
		hs1.add('C');		// caractere
		System.out.println("HashSet avant : " + hs1);

		// Creer un iterator sur la HashSet hs1
		Iterator i = hs1.iterator();
		
		// Afficher tout le contenu de la HashSet a partir d'un iterator
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}