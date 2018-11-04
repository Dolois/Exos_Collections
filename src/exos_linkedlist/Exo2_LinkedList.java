package exos.collections;

import java.util.LinkedList;

public class Exo2_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();

		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(true);
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add(false);
		ll.add("A");
		ll.add("B");
		ll.add("C");
		
		for (int i = 0; i < ll.size(); i++)
		{
			System.out.println("L'élément n° " + i + " de la LinkedList a la valeur : " + ll.get(i));
		}
	}
}