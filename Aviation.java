class Country
{
    String str = "India";
}

class Company extends Country
{
    String str = "Air";
    void Airlines()
    {
        System.out.print(str + " ");
        System.out.println(super.str);
    }
}

class Aviation
{
    public static void main(String[] args)
    {
        Company AR = new Company();
        AR.Airlines();
    }
}