package exos.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Exo_ArrayListDelete 
{
	public static void main(String[] args) 
	{
        ArrayList al = new ArrayList<>();

        al.add("Tigre");
        al.add(9);
        al.add(false);

        ListIterator itr1 = al.listIterator();

        System.out.println("ArrayList avant : ");
        while (itr1.hasNext()) 
        {
            System.out.print(itr1.next() +  ", ");
        }
        
        // Supprimer l'element n° 2
        al.remove(2);

        ListIterator itr2 = al.listIterator();

        System.out.println("\n\nArrayList après : ");
        while (itr2.hasNext()) 
        {
            System.out.print(itr2.next() + ", ");
        }
	}
}