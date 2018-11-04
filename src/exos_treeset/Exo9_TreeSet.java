package exos_treeset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

// Ecrire un programme Java pour trouver les nombres inférieurs à 7 dans un TreeSet.
public class Exo9_TreeSet 
{
	public static void main(String[] args) 
	{
		// Declarer et Affecter l'objet ts1 de la classe TreeSet
		TreeSet<Integer> ts1 = new TreeSet();
		ts1.add(14);
		ts1.add(21);
		ts1.add(6);
		ts1.add(2);	
		System.out.println("TreeSet n° 1 avant : " + ts1);

        SortedSet ts2 = ts1.headSet(7);

        Iterator<Integer> itr = ts2.iterator();

        System.out.print("\nListe de nombre(s) inférieur(s) à 7 : ");
        while (itr.hasNext()) 
        {
             System.out.print(itr.next() + ", ");
        }
	}
}