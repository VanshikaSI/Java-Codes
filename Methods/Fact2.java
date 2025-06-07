class Fact2{
    public static void main(String[] args) {
        System.out.println(Fact(4));
    }
    static int Fact (int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}












/*class Fact2
{
    public static void main(String[] args)
    {
        System.out.println(Fact(4));
    }
    static int Fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}*/