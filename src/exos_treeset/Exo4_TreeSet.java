package exos_treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// Ecrire un programme Java pour créer une vue inverse des éléments contenus dans un TreeSet donné.
public class Exo4_TreeSet 
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
		
		Iterator itr1 = ts2.iterator();

		System.out.print("\nTreeSet n° 2 après avec iterateur : ");
		while (itr1.hasNext()) 
		{
			System.out.print(itr1.next() + ", ");
		}
		
		System.out.println("\n\nTreeSet n° 2 après sans iterateur descending " + ts2.descendingSet());
		
		Iterator itr2 = ts2.descendingIterator();

		System.out.print("\nTreeSet n° 2 après avec iterateur descending : ");
		while (itr2.hasNext()) 
		{
			System.out.print(itr2.next() + ", ");
		}
	}
}