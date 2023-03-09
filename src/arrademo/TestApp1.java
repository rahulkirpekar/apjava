package arrademo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{	
		System.out.println("Enter No "); 
		int no=sc.nextInt();
		ArrayList<Integer>list = new ArrayList<String>();
		
		list.add("rahul");//<----itr
		list.add(no);// AutoBoxing Rule----int ---Interger-----
		list.add(true);
		list.add(12.31245);
		list.add(1234.23f);
		Student s = new Student();
		s.scan();
		list.add(s);
		list.add('R');
		
		Iterator<String>itr =	list.iterator();
		System.out.println(itr);
		while(itr.hasNext()) 
		{
			String obj = itr.next();
			System.out.println(obj);
		}
		
//		for(int i=0;i<list.size();i++) 
//		{
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}

		for(Object obj : list) 
		{
			System.out.println(obj);			
		}
	}
}
