package exos.collections;

import java.util.ArrayList;
import java.util.ListIterator;

// Ecrire un programme Java pour extraire un élément (à un index spécifié) d'une arraylist 
public class Exo_ArrayListExtract 
{
	public static void main(String[] args) 
	{
        ArrayList al = new ArrayList<>();

        al.add("A,B,C,D");
        al.add("a,b,c,d");
        al.add(12345);
        al.add(true);
        al.add(null);

        ListIterator itr1 = al.listIterator();

        System.out.println("ArrayList avant : ");
        while (itr1.hasNext()) 
        {
            System.out.print(itr1.next() + ", ");
        }

        al.remove(4);

        ListIterator itr2 = al.listIterator();

        System.out.println("\n\nArrayList après : ");
        while (itr2.hasNext()) 
        {
            System.out.print(itr2.next() + ", ");
        }
	}
}