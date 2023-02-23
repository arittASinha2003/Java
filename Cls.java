class Arithmetic
{
	int a, b;

	void insert (int c, int d)
	{
		a = c;
		b = d;
	}

	int add()
	{
		int addition;
		addition = a + b;
		return addition;
	}
}

class Cls
{
	public static void main (String args[])
	{
		Arithmetic a1 = new Arithmetic();
		a1.insert (5, 6);
		int result = a1.add();
		System.out.println (result);
	}
}