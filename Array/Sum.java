//?Find the sum of the no in array
class Sum{
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+i;

        }
        System.err.println(sum);
    }
}


/*class Sum{
    public static void main(String[] args) {
        int a[]= new int[]{2,3,4,5,6,7,8};
        int sum=0;
        for(int i:a){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
*/
    