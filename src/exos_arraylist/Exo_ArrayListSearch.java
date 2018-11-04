package exos.collections;

import java.util.ArrayList;

// Ecrire un programme Java pour rechercher un élément dans une arraylist.
public class Exo_ArrayListSearch
{
	public static boolean searchElement(String element)
	{
        ArrayList<String> al = new ArrayList<>();

        al.add("Tigre");
        al.add("A");
        al.add("y");
        al.add("@");

        if (al.contains(element))
        {
            System.out.println("L'élément " + element + " est présent dans l'ArrayList");
            return true;
        }
        else
        {
            System.out.println("L'élément " + element + " n'est pas présent dans l'ArrayList");
            return false;               
        }
	}
	
	public static void main(String[] args) 
	{
        searchElement("Lion");
        searchElement("A");
        searchElement("@");
	}
}