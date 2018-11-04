package exos_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Exo2_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("rouge");
		ts.add("bleu");
		ts.add("cuivre");
		ts.add("orange");
		ts.add("marron");
		ts.add("jaune");

		Iterator i = ts.iterator();
		
		int nbr = 0;
		// Afficher tout le contenu du TreeSet a partir d'un iterator
		while(i.hasNext())
		{
			nbr++;
			System.out.println(i.next());
		}
		System.out.println("Nombre d'élément(s) dans la HashSet est de : " + nbr);
	}
}