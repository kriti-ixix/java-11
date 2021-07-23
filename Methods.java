class Methods
{
    int x = 5;
    int y = 10;

    //Function definition
    void addition() //Default method, Void return 
    {
        int z = x + y;
        System.out.println("Sum: " + z);
    }

    void subtraction(int a, int b) //Parameterised method
    {
        int c = a - b;
        System.out.println("Difference: " + c);
    }

    int multiplication(int a, int b) //Parameterised method, int return type
    {
        int c = a * b;
        return c;
    }

    double division(double a, double b)
    {
        double c = a / b;
        return c;
    }

    public static void main(String [] args)
    {
        Methods obj = new Methods();
        //Function calling
        obj.addition();
        obj.addition();
        obj.addition();

        obj.subtraction(5, 10); //Arguments
        obj.subtraction(10, 20);

        int p1 = obj.multiplication(10, 20);
        int p2 = obj.multiplication(100, 200);

        System.out.println("Products were: " + p1 + " " + p2);

        System.out.println(obj.division(5.0, 10.0));
    }
}

