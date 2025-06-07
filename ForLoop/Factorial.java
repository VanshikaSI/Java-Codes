/*
 Find factorial using for loop
class Factorial
{
    public static void main(String[] args)
    {
        int i;
        int fact=1;
        int n=7;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of no is "+fact);
    }

}*/

class Factorial{
    public static void main(String[] args){
        int i=1;
        int n=7;
        int fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}