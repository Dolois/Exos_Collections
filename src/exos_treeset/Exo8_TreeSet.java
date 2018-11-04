package exos_treeset;

import java.util.Iterator;
import java.util.TreeSet;

// Ecrire un programme Java pour comparer deux TreeSets.
public class Exo8_TreeSet 
{

	public static void compare(String element, TreeSet set) 
	{
		if (!set.contains(element)) 
		{
			System.out.println("\nL'élément " + element + " n'appartient pas a l'une des deux listes");
		}
		else
		{
			System.out.println("\nL'élément " + element + " est présent dans les deux listes");
		}
	}
	
	public static void main(String[] args) 
	{
		// Declarer et Affecter l'objet ts1 de la classe TreeSet
		TreeSet<String> ts1 = new TreeSet();
		ts1.add("2");
		ts1.add("b");
		ts1.add("1");
		System.out.println("TreeSet n° 1 avant : " + ts1);
		
		// Declarer et Affecter l'objet ts2 de la classe TreeSet
		TreeSet<String> ts2 = new TreeSet();
		ts2.add("1");
		ts2.add("A");
		ts2.add("b");
		System.out.println("TreeSet n° 2 avant : " + ts2);
		
		Iterator<String> itr = ts1.iterator();

		while (itr.hasNext()) {
			compare(itr.next(), ts2);
		}
	}
}