class While1
{
    public static void main(String[] args)
    {
        
    int i=1;
    int fact=1;
    int n=7;
    while(i<=n)
    {
        fact=fact*i;
        i++;

    }
    System.out.println("Factorial of no is "+fact);
    }
}