package arrademo;

import java.util.Scanner;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entert Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Entert Name : ");
		name = sc.nextLine();
		System.out.println("Entert Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std);
	}
	@Override
	public String toString() 
	{
		return rno + " " + name + " " + std;
	}
}
