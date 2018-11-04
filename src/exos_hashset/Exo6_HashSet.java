package exos.collections;

import java.util.HashSet;

// Ecrire un programme Java pour cloner un HashSet en un autre.
public class Exo6_HashSet 
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
		System.out.println("HashSet n° 1 : " + hs1);
		
		// Creer une instance de la classe HashSet pour le clonage de hs1 
		HashSet hs2 = new HashSet();

		hs2 = (HashSet) hs1.clone();
		System.out.println("HashSet n° 2 : " + hs2);
	}
}