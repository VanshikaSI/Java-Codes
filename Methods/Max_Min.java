class Max_Min{
    public static void main(String[] args)
    {
        System.out.println(Max(2,6,0,9,20,10));
        System.out.println(Min(2,0,4,-5,6,7,9));

    }
    static int Max(int...arr)
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
     static int Min(int...arr)
    {
      int min=arr[0];
      for(int i =1;i<arr.length;i++)
      {
        if(min>arr[i])
        {
            min=arr[i];
        }
      }
      return min;
    }
}