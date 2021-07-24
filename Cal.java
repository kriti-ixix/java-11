class cal
{
int c;
int add(int a, int b)
{
c=a+b;
return c;
}
int sub(int a, int b)
{
c=a-b;
return c;
}
int mul(int a, int b)
{
c=a*b;
return c;
}
int div(int a, int b)
{
c=a/b;
return c;
}
class Result{
public static void main(String[] args){
Cal c1=new Cal();
c1.add(4,3);
System.out.println("Add: "+c1.c);
c1.sub(14,3);
System.out.println("Sub: "+c1.c);
c1.mul(4,3);
System.out.println("mul: "+c1.c);
c1.div(44,2);
System.out.println("div: "+c1.c);
}}
