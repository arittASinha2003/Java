class CSEO
{
	int id;
	String name;
}

class Cls1
{
	public static void main (String args[])
	{
		CSEO S1 = new CSEO();
			S1.id = 1;
			S1.name = "One";
		System.out.println(S1.id + " " + S1.name);
	}
}