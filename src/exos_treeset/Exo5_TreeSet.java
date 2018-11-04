package exos_treeset;

import java.util.Iterator;
import java.util.TreeSet;

// Ecrire un programme Java pour obtenir les premier et dernier éléments d'un TreeSet
public class Exo5_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts1 = new TreeSet();
		ts1.add("2");
		ts1.add("B");
		ts1.add("false");
				
		System.out.println("TreeSet n° 1 avant : " + ts1);
		
		TreeSet<String> ts2 = new TreeSet();

		ts2.add("A");
		ts2.add("true");
		ts2.add("1");
		System.out.println("TreeSet n° 2 avant : " + ts2);

		ts2.addAll(ts1);
		System.out.println("\nTreeSet n° 2 après : " + ts2);
		
		System.out.println("\nValeur du premier element de la TreeSet n° 2 est : " + ts2.first());
		System.out.println("Valeur du dernier element de la TreeSet n° 2 est : " + ts2.last());
	}
}