package exos.collections;

import java.util.LinkedList;

public class Exo1_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(true);
		ll.add(false);
		
		System.out.println("LinkedList avant : " + ll);
		
		ll.addLast(4);
		
		System.out.println("LinkedList après : " + ll);
	}
}