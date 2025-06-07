class FindElement{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Target(3,arr));
    }
    static int Target(int n,int arr[]){
        int tar=0;
        for(int i=0;i<=arr.length;i++){
            if(n==arr[i]){
                return i;
                                              
            }
           
            
        }
         return -1;
    }
}










/*class FindElement
{
    public static void main(String[] args)
    {
        int arr[]=new int[]{2,3,4,5,6,7,8,9};
        System.out.println(Find(7,arr));
    }
    static int Find(int t,int arr[])
    {
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            if(t==arr[i])
            {
                return i;
            }
           
        }
        return -1;
    }
}*/
