package exos.collections;

import java.util.ArrayList;

public class Exo_ArrayListClone 
{
	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add(1);
		al1.add(3);
		al1.add(5);
		al1.add(7);
		al1.add(false);
		al1.add(true);
		
		ArrayList al2 = new ArrayList(al1);
		
		al2.add("Hello");
		
		// clone tout le contenu de l'ArrayList n° 1 dans l'ArrayList n° 2
		// il ecrase la chaine "hello" ajoute a la ligne 23 lors du clonage
		al2 = (ArrayList) al1.clone();
		
		System.out.println("ArrayList n° 1 avant : " + al1);
		System.out.println("ArrayList n° 1 avant : " + al2);
	}
}