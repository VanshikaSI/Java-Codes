class Largest{
    public static void main(String[] args)
    {
        int a=12;
        int b=32;
        int c=70;
        if(a>b && a>c){
            System.out.println(a+" is largest no");
        }
        else if(b>a && b>c){
            System.out.println(b+"  is largest no");
        }
        else{
            System.out.println(c+ "  is largest no ");
        }
    }
}