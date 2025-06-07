/* to find factorial of no 
class Fact1
{
    public static void main(String[] args){
    int i=1;
    int n=7;
    int fact=1;
    do{
        fact=fact*i;
        i++;
    }while(i<=n);
    System.out.println("Factorial of no is  "+fact);
    }
}*/

class Fact1{
    public static void main(String[] args){
        int i=1;
        int n=7;
        int fact=1;
        do { 
         fact=fact*i;
         i++;
        } while (i<=n);
        System.out.println(fact);
    }
}