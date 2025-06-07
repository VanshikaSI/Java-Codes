class PrintEvenno
{ 
  public static void main(String[] args)
  {
  Even(1,2,3,4,5,6,7,8,9,10);
  }

  static void Even(int...arr)//?when we give the arr during calling the function, then we need to mention function(int...arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==2)
      {
        System.out.println(arr[i]);

      }
    }
   
  }
}





/*class PrintEvenno
{ 
    public static void main(String[] args)
    {
    int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,151,161,17,18,19,20};
      Even(arr);
    }
    static void Even(int arr[]){
  
    for(int i=0 ; i< arr.length ; i++)
    {
        if(arr[i]%2==0)
           {
            System.out.println(arr[i]);
           
           }
    }   
    
    }
}*/