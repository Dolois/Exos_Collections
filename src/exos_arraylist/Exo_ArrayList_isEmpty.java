package exos.collections;

import java.util.ArrayList;
import java.util.ListIterator;

// Ecrire un programme Java pour tester une arraylist est vide ou non.
public class Exo_ArrayList_isEmpty 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList<>();

		al.add("A");
		al.add(true);
		al.add(null);
		
        ListIterator itr = al.listIterator();

        // Si l'ArrayList n'est pas vide alors Afficher tout le contenu
        if (!al.isEmpty())
        {
        	System.out.print("Contenu de l'ArrayList : ");
        	while (itr.hasNext()) 
        	{
        		System.out.print(itr.next() + ", ");
        	}
        }
	}
}