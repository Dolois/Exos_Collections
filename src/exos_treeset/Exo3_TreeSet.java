package exos_treeset;

import java.util.Iterator;
import java.util.TreeSet;


// Ecrire un programme Java pour ajouter tous les �l�ments d'un TreeSet sp�cifi� � un autre
public class Exo3_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts1 = new TreeSet<String>();

		ts1.add("rouge");
		ts1.add("bleu");
		ts1.add("cuivre");
		System.out.println("TreeSet n� 1 avant : " + ts1);
		
		TreeSet<String> ts2 = new TreeSet<String>();

		ts2.add("orange");
		ts2.add("marron");
		ts2.add("jaune");
		System.out.println("TreeSet n� 2 avant : " + ts2);

		ts2.addAll(ts1);
		System.out.println("\nTreeSet n� 2 apr�s : " + ts2);
		
		Iterator<String> itr = ts2.iterator();

		System.out.print("\nTreeSet n� 2 apr�s avec iterateur : ");
		while (itr.hasNext()) 
		{
			System.out.print(itr.next() + ", ");
		}
	}
}