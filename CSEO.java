class CSEO
{
	int rollno;
	String name;

	public static void main (String args[])
	{
		CSEO S1 = new CSEO();
		CSEO S2 = new CSEO();
			S1.rollno = 1;
			S1.name = "One";
			S2.rollno = 2;
			S2.name = "Two";
		System.out.println(S1.rollno + " " + S1.name);
		System.out.println(S2.rollno + " " + S2.name);
	}
}