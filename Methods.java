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

    public static void main(String [] args)
    {
        Methods obj = new Methods();
        //Function calling
        obj.addition();
        obj.addition();
        obj.addition();

        obj.subtraction(5, 10);
        obj.subtraction(10, 20);
    }
}

