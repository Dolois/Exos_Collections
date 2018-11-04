package exos.collections;

import java.util.ArrayList;
import java.util.ListIterator;

// Ecrire un programme Java pour comparer deux arraylists.
public class Exo_ArrayListCompare 
{
	public static void main(String[] args) 
	{
        ArrayList<String> al1 = new ArrayList();

        al1.add("Tigre");
        al1.add("Lion");
        al1.add("Jaguar");

        ArrayList<String> al2 = new ArrayList();
        al2.add("Guepard");
        al2.add("Lion");
        al2.add("Puma");

        ListIterator<String> itr1 = al1.listIterator();

        ListIterator<String> itr2 = al2.listIterator();

        while (itr2.hasNext()) 
        {
        	String felin1 = itr1.next();
        	String felin2 = itr2.next();

        	if (felin1.equals(felin2))
        		System.out.println("L'élément " + felin1 + " des deux listes en position " + al1.indexOf(felin1) + " est identique.");
            else
            	System.out.println("L'élément en position " + al1.indexOf(felin1) + " est " + felin1 + " dans la liste n° 1 et " 
            						+ felin2 + "" + " dans la liste n° 2");
        }
	}
}