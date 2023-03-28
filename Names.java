import java.util.Scanner;

class Names
{
	public static void main (String args[])
	{
		Scanner r = new Scanner (System.in);
		System.out.println("Enter no. of names: ");
		int n = r.nextInt();	
		String names[] = new String[n];
		System.out.println("Enter the names: ");
		for (int i = 0; i < n; i++)
		{
			names[i] = r.nextString();
			System.out.println (names[i]);
		}
	}
}