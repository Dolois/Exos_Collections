package exos.collections;

import java.util.ArrayList;

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
            System.out.println("L'�l�ment " + element + " est pr�sent dans l'ArrayList");
            return true;
        }
        else
        {
            System.out.println("L'�l�ment " + element + " n'est pas pr�sent dans l'ArrayList");
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