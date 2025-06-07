class GCD{
    public static void main(String[] args){
        System.out.println(Gcd(36,60));
    }
    static  int Gcd(int a,int b){
        	if(b==0)  //if second number is zero (base condition)
	        return a;  //gcd is a	  
	else if(a<b) //for swapping
	   return(Gcd(b,a));  
	else
	   return(Gcd(b,a%b)); 
    }
}