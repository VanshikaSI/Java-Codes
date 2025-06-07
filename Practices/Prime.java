class Prime{
public static void main(String[] args){
    int a=3;
    int p;
    boolean flage=false;
        for(int i=0;i*i<=a;i++){
            flage=false;
            if(a%i==0)
            {
                flage=true;
                break;
            }
          
        }
        if(flage=true)
        {
           System.out.println(a+" is  a Prime no");
        }
        else
        {
            System.out.println(a+" is  not a prime no");
        }
    }
}


