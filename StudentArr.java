import java.util.Scanner;

class StudentArr
{
    public static void main(String[] args)
    {
        //int[] rollno = {10, 20, 30, 40, 50};
        int[] rollno = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rollno.length; i++)
        {
            System.out.print("Value at index " + i + ": ");
            rollno[i] = sc.nextInt();
        }

        for (int i = 0; i < rollno.length; i++)
        {
            System.out.println(rollno[i]);
        }
    }
}