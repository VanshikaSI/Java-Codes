package package2;

public class min {
    public static  int Mininimum(int...arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            
        }
        return min;
    }
}
