class String1{
    public static void main(String[] args)
    {
        String s1="hello world";
        String s2="hello world";
        String s3= new String("hello world");
        String s4="HELLO WORLD";
        String s5="    HELLO WORLD     ";
        String s6="      HELLO        WORLD    ";//trims only starting and ending space
        String s7="hello world hi world hey world";


        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1==s2);//false

         System.out.println(s1.toUpperCase());
        System.out.println(s4.toLowerCase());

        System.out.println(s5.trim());
        System.out.println(s6.trim());

        System.out.println(s1.charAt(5));

        System.out.println(s1.replace('h','r'));
        System.out.println(s1.replaceAll("hello","hi"));
        System.out.println(s7.replaceFirst("world","country")); 
        System.out.println(s7.replaceFirst("w","c"));  
           
}
}