package exos.collections;

import java.util.ArrayList;
import java.util.ListIterator;

// Ecrire un programme Java pour parcourir tous les éléments d'une arraylist.
public class Exo_ArrayListDisplay 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("a");
		al.add("b");
		al.add("c");
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(true);
		al.add(false);
		
        ListIterator itr1 = al.listIterator();
        System.out.print("Contenu de l'ArrayList : ");
        while (itr1.hasNext()) 
        {
            System.out.print(itr1.next() +  ", ");
        }
		
        System.out.println("\n\nContenu de l'ArrayList : ");
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("Element n° " + i + " est égal à " + al.get(i));
		}
	}
}