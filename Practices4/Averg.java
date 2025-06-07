


class Averg {
    public static void main(String[] args) {
        Avg(1,2,3,4,5,6,7,8,9,10);
    }
    static void Avg(int...a){
        int sum=0;
        float avg;
        int i;
        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
        avg=sum/a.length;
        System.out.println(avg);
        

    }
}
