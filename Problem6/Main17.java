
public class Main17 {
    public static void main(String[] args){
        int []balance= new int[]{100,200};
        String []request=new String[]{"withdraw 1 50","transfer 1 2 70","deposit 2 100"};
        int arr[]=findBalance(balance,request);
        for(int a:arr){
            System.out.println(a);
        }

    }

    static int[] findBalance(int[] balance,String[] request){
        for( String requests:request){
            String[] command=requests.split(" ");/*space is required between " " */
            
        String cmd=command[0];
        switch(cmd){
           case "withdraw":
             int withdrawposition=Integer.valueOf(command[1]);
             int balanceindex=withdrawposition-1;
             int withdrawvalue=Integer.valueOf(command[2]);
             
             balance[balanceindex]-=withdrawvalue;
             break;

            case "deposit" :
           int position1=Integer.valueOf(command[1]);
           int balanceindex1=position1-1;
           int depositvalue1=Integer.valueOf(command[2]);
           balance[balanceindex1]+=depositvalue1;
             break; 
            
            case "transfer":
            int position2=Integer.valueOf(command[1]);
           int balanceindex2=position2-1;

           int position3=Integer.valueOf(command[2]);
           int balanceindex3=position3-1;
           int withdrawvalue2=Integer.valueOf(command[3]);

           balance[balanceindex2]-=withdrawvalue2;
           balance[balanceindex3]+= withdrawvalue2;

           
        }

    }
    return balance;
}
}
