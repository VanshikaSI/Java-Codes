class Program3{
    public static void main(String[] args)
    {
        String s1="mam";
       
        String s3="";
     
        for(int i=s1.length()-1;i>=0;i--)
        {
           s3=s3+s1.charAt(i);
        }
        System.out.println(s3);
        if(s3.equals(s1))//== problems instead use .equals()
        {
            System.out.println("It is Palindrom");
        }
        else
        {
            System.out.println("It is not an Palindrom");
        }
    }
    
}