/*class Armstrong{
    public static void main(String[] args)
    {
        int n=153;
      int d;
      int sum=0;
      int s;
      s=n;
      for(int i=1;i<=3;i++){
        d=n%10;
         n=n/10;
         sum=sum+(d*d*d);
      }
       if(s==sum){
        System.out.println("It is an armstrong");
       }
       else{
        System.out.println("It is not an armstrong");
       }
    }
}*/
class Armstrong{
  public static void main(String[] args){
    int n=153;
    int d,s,sum=0;
    s=n;
    for(int i=1;i<=3;i++){
      d=n%10;
      n=n/10;
      sum=sum+(d*d*d);
    }
    if(s==sum){
      System.out.println("It is an armstrong no");
    }
    else
  {
    System.out.println("It is not an armstrong no");
  }
  }
}