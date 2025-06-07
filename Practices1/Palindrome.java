class Palindrome{
    public static void main(String[] args)
{
    String s= "man";
    
    String s3="";
    for(int i=s.length()-1;i>=0;i--){
        s3=s3+s.charAt(i);
    }
    if(s3.equals(s))
    {
        System.out.println("it is palindrome");
    }
    else{
        System.out.println("it is not a palindrome");
    }
}
}