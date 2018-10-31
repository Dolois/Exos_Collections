package exos.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Exo_ArrayListCopy 
{
	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		
		al1.add("Tigre");
		al1.add(15000f);
		al1.add("Bonjour");
		al1.add(12);
		System.out.println("ArrayList n° 1 avant : " + al1);
		
		ArrayList al2 = new ArrayList();
		
		al2.add(true);
		al2.add(1);
		al2.add("A");
		System.out.println("ArrayList n° 2 avant " + al2);
		
		// fusion (merge) de deux ArrayList al1 dans al2
		al2.addAll(al1);
		System.out.println("ArrayList n° 2 après : " + al2);
		
		// copie tout le contenu de l'ArrayList al1 dans l'ArrayList al2
		// en écrasant tout le contenu initial de al2
		Collections.copy(al2, al1);
		System.out.println("ArrayList n° 2 après : " + al2);

		// Ce code ajoute a l'ArrayList al2 tout le contenu de l'ArrayList de al1
		// for (int i = 0; i < al1.size(); i++) 
		// { 
		// 	al2.add(al1.get(i)); 
		// }
	}
}