package exos.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Exo_ArrayListInsert 
{
	public static void main(String[] args) 
	{
        ArrayList al = new ArrayList<>();

        al.add(1);
        al.add("Tigre");
        al.add(true);

        ListIterator itr1 = al.listIterator();

        System.out.println("ArrayList avant : ");
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + ", ");
        }

        al.add(0, 0);
        al.add(2, "Lynx");
        al.add(5, false);

        ListIterator itr2 = al.listIterator();

        System.out.println("\n\nArrayList après : ");
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + ", ");
        }
	}
}