package exos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

// Ecrire un programme Java d'échange de deux éléments dans une arraylist.
public class Exo_ArrayListSwap 
{
	public static void main(String[] args) 
	{
        ArrayList al1 = new ArrayList<>();

        al1.add("Tigre");
        al1.add(1);
        al1.add(false);

        ListIterator itr1 = al1.listIterator();

        System.out.println("ArrayList avant le swap : ");
        while (itr1.hasNext()) 
        {
            System.out.print(itr1.next() + ", ");
        }

        // Echanger la position de l'element 0 a la position 1
        // et l'element 1 en position 0
        Collections.swap(al1, 0, 1);

        ListIterator itr2 = al1.listIterator();

        System.out.println("\n\nArrayList après le swap : ");
        while (itr2.hasNext()) 
        {
            System.out.print(itr2.next() + ", ");
        } 
	}
}