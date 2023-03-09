package arrademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			list.add(a[i]);
		}
		System.out.println(list);
		
		list.toArray(null)
		
		
		
		
//		ArrayList<String> mainNamesList = new ArrayList<String>();
//		mainNamesList.add("rahul");
//		mainNamesList.add("ankur");
//		mainNamesList.add("krunal");
//		mainNamesList.add("ankit");
//		mainNamesList.add("sagar");
//		ListIterator<String> itr =	mainNamesList.listIterator();
//		while (itr.hasNext()) 
//		{
//			String name = itr.next();
//			System.out.println(name);
//		}
//		ArrayList<String> subNamesList = new ArrayList<String>();
//		
//		subNamesList.add("rahul");
//		subNamesList.add("krunal");
//		mainNamesList.retainAll(subNamesList);
//		System.out.println(mainNamesList);
	
	}
}
