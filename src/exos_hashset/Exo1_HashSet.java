package exos.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// Ecrire un programme Java pour ajouter l'élément spécifié à la fin d'un HashSet
public class Exo1_HashSet 
{
	public static void main(String[] args) 
	{
		// Creer une instance de la classe Scanner
		Scanner sc = new Scanner(System.in);
		
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
		
		// englobe le premier HashSet hs1 dans le second HashSet hs2
		// HashSet hs2 = new HashSet(Arrays.asList(hs1));
		
		// System.out.println("Saisir un élément supplémentaire : ");
		// hs.add(sc.next());
		
		// Creer un iterator sur la HashSet hs1
		Iterator i = hs1.iterator();
		
		// System.out.println( "Enumerate the HashSet" );
		// Enumeration e = set.elements();
		// while ( e.hasMoreElements() )
		// System.out.println( e.nextElement() );
		// System.out.println();
		
		// Afficher tout le contenu de la HashSet a partir d'un iterator
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		hs1.add(22500);
		System.out.println("HashSet après : " + hs1);
	}
}