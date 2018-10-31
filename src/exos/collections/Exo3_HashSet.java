package exos.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Exo3_HashSet 
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
		
		System.out.println("Nombre d'élément(s) dans la HashSet est de : " + hs1.size());

		// Creer un iterator sur la HashSet hs1
		Iterator i = hs1.iterator();
		
		int nbr = 0;
		// Afficher tout le contenu de la HashSet a partir d'un iterator
		while(i.hasNext())
		{
			nbr++;
			System.out.println(i.next());
		}
		System.out.println("Nombre d'élément(s) dans la HashSet est de : " + nbr);
	}
}