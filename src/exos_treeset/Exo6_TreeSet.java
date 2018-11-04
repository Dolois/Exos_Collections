package exos_treeset;

import java.util.Iterator;
import java.util.TreeSet;

// Ecrire un programme Java pour cloner un TreeSet en un autre.
public class Exo6_TreeSet 
{
	public static void main(String[] args) 
	{
		// Declarer et Affecter l'objet ts1 de la classe TreeSet
		TreeSet<String> ts1 = new TreeSet();
		ts1.add("2");
		ts1.add("B");
		ts1.add("false");
				
		System.out.println("TreeSet n° 1 avant : " + ts1);
		
		// Declarer l'objet ts2 de la classe TreeSet pour clonage
		TreeSet<String> ts2 = new TreeSet();
		
		ts2 = (TreeSet<String>) ts1.clone();
		
		System.out.print("\nClone du TreeSet n° 1 dans TreeSet n° 2 : " + ts2);
		
		Iterator<String> itr = ts1.iterator();
		
		System.out.print("\nClone du TreeSet n° 1 dans TreeSet n° 2 avec iterateur : ");
		while (itr.hasNext())
		{
			System.out.print(itr.next() + ", ");
		}
	}
}