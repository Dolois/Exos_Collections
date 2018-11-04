package exos.collections;

import java.util.HashSet;
import java.util.Iterator;

// Ecrire un programme Java pour comparer deux HashSets et conserver les éléments identiques dans les deux HashSets.
public class Exo10_HashSet 
{
	public static void compareETconserve(String element, HashSet<String> set, HashSet<String> conteneur) 
	{
		if (set.contains(element)) 
		{
			conteneur.add(element);
			System.out.println("L'élément " + element + " appartient aux deux listes");
		}
	}
	
	public static void main(String[] args) 
	{
		// Declarer et initialiser l'objet hs1 (liste n° 1)
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("A");
        hs1.add("B");
        hs1.add("C");
        hs1.add("b");
        hs1.add("c");
        hs1.add("b");        
        
		// Declarer et initialiser l'objet hs2 (liste n° 2)
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("b");
        hs2.add("c");
        hs2.add("b");
        
        // Declarer l'objet hs3 (liste n° 3) pour
        // sauvegarder les elements identiques des listes n° 1 et n° 2
        HashSet<String> hs3 = new HashSet<>();
 
        Iterator<String> itr1 = hs1.iterator();
        
        while (itr1.hasNext()) 
        {
            compareETconserve(itr1.next(), hs2, hs3);
        }

        Iterator<String> itr3 = hs3.iterator();
  
        System.out.print("\nContenu de la liste n° 3 : ");
        while (itr3.hasNext()) 
        {
            System.out.print(itr3.next() + ", ");
        }
	}
}