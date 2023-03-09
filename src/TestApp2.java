import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sizeof Strings : ");
		int x = sc.nextInt();// 4
		sc.nextLine();
		String strings[] = new String[x];

		for (int i = 0; i < strings.length; i++) 
		{
			System.out.println("Enter strings ["+i+"] : ");
			strings[i] = sc.nextLine();
		}
		
		System.out.println("Enter Sizeof Queries : ");
		int y = sc.nextInt(); // 3
		sc.nextLine();
		String queries[] = new String[y];
		for (int i = 0; i < queries.length; i++) 
		{
			System.out.println("Enter queries ["+i+"] : ");
			queries[i] = sc.nextLine();
		}
		int a[] = new int[y];
		for (int i = 0; i < queries.length; i++) 
		{
			int count =0 ; 
			for(int j = 0;j < strings.length ; j++) 
			{
				if (queries[i].equals(strjings[j])) 
				{
					count++;
				}
			}
			a[i] = count;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
}
