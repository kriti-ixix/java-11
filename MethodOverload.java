class MethodOverload
{
    void add(int a, int b)
    {
        int c = a + b;
        System.out.println("Sum of two numbers: " + c);
    }

    void add(int a, int b, int c)
    {
        int d = a + b + c;
        System.out.println("Sum of three numbers: " + d);
    }

    void add()
    {
        System.out.println("No numbers");
    }

    public static void main(String [] args)
    {
        MethodOverload obj = new MethodOverload();
        obj.add();
        obj.add(5, 10);
        obj.add(5, 10, 15);
    }
}