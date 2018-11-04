package exos.collections;

import java.util.ArrayList;
import java.util.ListIterator;

// Ecrire un programme Java pour parcourir tous les éléments d'une arraylist.
public class Exo_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("Bonjour Dominick"); 
		al.add(4); 
		al.add(12.20f); 
		al.add("Salut Dominick");
		
        ListIterator itr1 = al.listIterator();
        System.out.println("Contenu de l'ArrayList : ");
        while (itr1.hasNext()) 
        {
            System.out.print(itr1.next() +  ", ");
        }
	}
}