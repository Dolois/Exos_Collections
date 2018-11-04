package exos.collections;

import java.util.HashSet;
import java.util.Iterator;

// Ecrire un programme Java pour supprimer tous les éléments d'un HashSet.
public class Exo11_HashSet 
{
	public static void main(String[] args) 
	{
		// Creer une instance de la classe HashSet
		HashSet<String> hs1 = new HashSet();
		
		// Ajouter et initialiser des elements dans la HashSet
        hs1.add("Tigre");
        hs1.add("puma");
        hs1.add("Guepard");
        hs1.add("Jaguar");
		System.out.println("HashSet sans iterator avant : " + hs1);

		System.out.print("\nHashSet avec iterator avant : ");
        Iterator<String> itr1 = hs1.iterator();
        while (itr1.hasNext()) 
        {
            System.out.print(itr1.next() + ", ");
        }
		
		hs1.clear();
		
		System.out.println("\n\nHashSet sans iterator après : " + hs1);
		
		System.out.println("\nHashSet avec iterator après : ");
        Iterator<String> itr2 = hs1.iterator();
        while (itr2.hasNext()) 
        {
            System.out.println(itr2.next());
        }
	}
}