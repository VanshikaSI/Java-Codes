/*
to find the eligible case 
class Age
{
    public static void main(String[] args)
    {
        int a=30;
        
       
        if (a>=0 && a<18)
        {
            System.out.println("You are  not eligible for voting");

        }
        else if (a>18)
        {
            System.out.println("You are eligible for voting");

        }
        else 
        {
            System.out.println("Invalid age");
        }
    }
}*/
class Age{
    public static void main(String[] args) {
        int n=12;
        if (n>=0 &&n<18){
            System.out.println("Not eligible");
        }
        else if(n>18){
            System.out.println("Eligible for voting");
                    }
        else{
            System.out.println("invalid data");
        }
    }}
}