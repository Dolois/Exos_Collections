package exos.collections;

import java.util.HashSet;
import java.util.Iterator;

// Ecrire un programme Java pour comparer deux HashSets.
public class Exo9_HashSet 
{  
    public static void compare(String element, HashSet<String> set) 
    {
        if (set.contains(element)) 
        {
            System.out.println("L'élément " + element + " appartient aux deux listes.");
        }
    }
    
	public static void main(String[] args) 
	{
		// Creer une instance de la classe HashSet
		HashSet<String> hs1 = new HashSet();
		
		// Ajouter et initialiser des elements dans la HashSet
        hs1.add("Tigre");
        hs1.add("puma");
        hs1.add("Guepard");
        hs1.add("Jaguar");
		System.out.println("HashSet n°1 sans iterator : " + hs1);
		
		// Creer une instance de la classe HashSet
		HashSet<String> hs2 = new HashSet();
		
		// Ajouter et initialiser des elements dans la HashSet
        hs2.add("tigre");
        hs2.add("Puma");
        hs2.add("guepard");
        hs2.add("Jaguar");
		System.out.println("HashSet n° 2 sans iterator : " + hs2);
		System.out.println("");
		
		Iterator<String> itr1 = hs1.iterator();
		while (itr1.hasNext())
		{
			compare(itr1.next(), hs2);
		}
	}
}