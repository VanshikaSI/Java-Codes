class Fibo
{
    public static void main(String[] args)
    {
        int f1=0;
        int f2=1;
        int n=10;
        int i;
        int f3;
        System.out.println("Fibonaria series");
        System.out.println(f1+"\n"+f2);
        for(i=1;i<=n-2;i++)
        {
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        
        }
    }
}