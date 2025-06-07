class Largest{
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,4,5,6,7};
        int max=arr[0];
        int min=arr[0];
         
        for(int i=1;i<arr.length;i++)
        {
            if(max<=arr[i])
            {
                max=arr[i];
            }
            if(min>=arr[i])
            {
               min=arr[i];
            }
        }
        System.out.println("maximum no is: "+max+" minimum no is: "+min);
    }
}