/*class Traget{
    public static void main(String[] args) {
        int a[]= new int[]{1,2,3,4,5,6,7,8};
        int flag=0;
        int target=3;
        int i;
        for( i=0;i<a.length;i++)
        {
            if(target==a[i])
            {
                flag=1;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            System.out.println(i);
        }
        else
        System.out.println("not found");
    }
}*/
class Traget
{
    public static void main(String[] args)
    {
        int i;
        int[] arr=new int[]{2,3,4,5,6,7,8};
        int flag=0;
        int tar1=5;
        for( i=0;i<arr.length;i++)
        {
            if(tar1==arr[i])
            {
                flag=1;
                break;
            }
        }
            if (flag==1)
            {
                System.out.println("found at index "+i);
                
            }
            else{
                System.out.println("not found");
            }
        }
    }
