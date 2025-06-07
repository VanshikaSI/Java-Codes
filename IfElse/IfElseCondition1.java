class IfElseCondition1
{
    public static void main(String[] args)
    {
        int a=200;
        int b=40;
        int sum=a+b;
        if (sum<0)
        {
            System.out.println("sum is less than zero " +sum);

        }
        else if (sum>200)
        {
         System.out.println("sum is greater than 200 " +sum);

        }else if(sum>100)
        {
            System.out.println("sum is greater than 100 "  +sum);
        }
        else{
            System.out.println(sum);
        }
    }
}