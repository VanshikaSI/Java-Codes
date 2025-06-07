class Practical{
    public static void main(String[] args)
    {
        String s1="   Hi,My    Name is Vanshika";
        String result1=s1.trim();
        String result2=result1.replace('m','e');
        String result3=result2.toUpperCase();
        String result4=result3.replaceAll("VANSHIKA","RISHITA");
        System.out.println(result4);
        }
}