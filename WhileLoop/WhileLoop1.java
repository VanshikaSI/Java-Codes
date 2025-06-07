class WhileLoop1
{
    public static void main(String[] args)
    {
        int i=0;
        int n=20;
        int sum=0;
        while(i<=n)
        {
            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of no is  "+sum);
    }
}