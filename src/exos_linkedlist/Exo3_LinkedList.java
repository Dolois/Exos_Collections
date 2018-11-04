package exos.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Exo3_LinkedList 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
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

		System.out.println("Saisir la position de départ de la LinkedList : ");
		int index = sc.nextInt();
		
		for (int i = index; i < ll.size(); i++)
		{
			System.out.println("L'élément n° " + i + " a la valeur : " + ll.get(i));
		}
	}
}