/*operations is carried out for array and by methods.Methods are similar to functions in c programming */

class Operations{
    public static void main(String[] args)
    {
        System.out.println(Operations("add",2,3,4,5,6,78,9));
        System.out.println(Operations("sub",2,3,4,5,6,78,9));
        System.out.println(Operations("mult",2,3,4,5,6,78,9));
    }

    static int  Operations(String name, int...arr)
{
    int i=0;
    int a=0;
    int mul=1;
    int s=arr[0];
    if(name =="add")
    {
        for( i=0;i<arr.length;i++)
        {
            a=a+arr[i];
            return a;
        }
    }
    else if(name =="sub")
    {
       for( int j=1;j<arr.length;j++)
        {
            s=s-arr[j];
            return s;
        } 
    }
    else if(name =="mult")
    {
        for(int m=0;m<arr.length;m++)
        {
            mul=mul*arr[m];
            return mul;
        }
    }
    else{
        System.out.println("Invalid operation");
        return 0;
    }
    return 0;
}

}