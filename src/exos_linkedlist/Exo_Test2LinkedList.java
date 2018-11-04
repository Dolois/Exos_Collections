package exos.collections;

import java.util.LinkedList; 
import java.util.List; 
import java.util.ListIterator; 

public class Exo_Test2LinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList lst = new LinkedList();
		
		lst.add(12); 
		lst.add("Bonjour Dominick !!"); 
		lst.add(12.20f); 

		for(int i = 0; i < lst.size(); i++) 
		{
			System.out.println("Élément à l'index " + i + " = " + lst.get(i)); 

			System.out.println("\n \tParcours avec un itérateur "); 
			System.out.println("-------------------------------- ---");
			
			ListIterator li = lst.listIterator(); 
			
			while(li.hasNext()) 
				System.out.println("ListIterator : " + li.next()); 
		}
	}
}