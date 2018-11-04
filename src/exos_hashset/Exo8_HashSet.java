package exos.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Ecrire un programme Java pour convertir un HashSet défini en ArrayList
public class Exo8_HashSet 
{
	public static void main(String[] args) 
	{
		// Creer une instance de la classe HashSet
		HashSet hs1 = new HashSet();
		
		// Ajouter et initialiser des elements dans la HashSet
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);			// numerique
		hs1.add(true);
		hs1.add(false);		// booleen
		hs1.add("A");
		hs1.add("B");
		hs1.add("C");		// chaine de caracteres
		hs1.add('C');		// caractere
		System.out.println("HashSet sans iterator : " + hs1);
		
        System.out.print("HashSet avec iterator : ");
        Iterator itr1 = hs1.iterator();
        while (itr1.hasNext()) 
        {
            System.out.print(itr1.next() + ", ");
        }
        
		// Je met en argument de l'ArrayList mon HashSet pour le convertir
		ArrayList al1 = new ArrayList(hs1);

		System.out.println("\n\nArrayList sans iterator : " + al1);
		
		System.out.print("ArrayList avec iterator : ");
        Iterator itr2 = al1.iterator();
        while (itr2.hasNext()) 
        {
            System.out.print(itr2.next() + ", ");
        }
	}
}