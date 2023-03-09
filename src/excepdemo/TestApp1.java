package excepdemo;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans;
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		String name =null;
		try 
		{
			
			try 
			{
				ans = no1 / no2;
				System.out.println("Ans : "+ ans);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			try 
			{
				name = "rahul";
				System.out.println(name.charAt(name.length()));
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			try 
			{
				name = null;
				System.out.println(name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			// other code
		}catch(Exception e) 
		{
			System.out.println("Exception---Handled");
		}
	}
}
