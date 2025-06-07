package package2;

public class max {
   
     public static int Maximum(int...arr)
    {
      int max=arr[0];
      for(int i =1;i<arr.length;i++)
      {
        if(max<arr[i])
        {
            max=arr[i];
        }
      }
      return max;
    }

}
