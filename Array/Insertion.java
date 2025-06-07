/*
class Insertion{
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,6,7,8};
        arr[2]=34;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int a[]=new int[]{arr.length};
        a[arr.length]=90;
        for(int i=0;i<=arr.length;i++){
            a[i]=arr[i];
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(a[j]);
        }
        a[arr.length]=90;
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}*/

class Insertion{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        arr[2]=23;
        for( int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        int a[]=new int[]{arr.length};
        a[arr.length]=34;//we can't change the length of arr
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
        for (int j=0;j<=arr.length;j++){
            System.err.println(a[j]);
        }
    }
}
/*class Insertion 
{
    public static void  main(String[] args)
    {
        int arr[]=new int[]{23,34,56,78,90,12};
        System.out.println("Insertion");
         arr[2]=67; /*directly can be changed
      int arr2[]= new int[arr.length+1]  for adding at end new arr is required
         arr2[arr.length]=90;
        for(int i=0;i<arr.length;i++)
        {
           arr2[i]=arr[i];

        System.out.println("adding no in end");

        for(int j=0;j<=arr.length;j++)

        {
            System.out.println(arr2[j]);

        }
    }*/
