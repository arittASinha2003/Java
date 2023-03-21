class Cls1
{
	void method1 (String...a)
	{
		for (String a1 : a)
		{
			System.out.println(a1);
		}
	}
}

class VarNameArg
{
	public static void main (String args[])
	{
		Cls1 O1 = new Cls1();
		O1.method1 ("Rama", "Sita");

		//for (i = 0; i < a.length; i++)
		//{
			//System.out.println(a[i]);
		//}
	}
}