

 class Main {
    public static void main(String[] args) {
        try {
            int ans=5/0;
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();/* it is void type.*/
        }
        System.out.println("done");
        try {
            int arr[]=new int[]{1,2,3,4,5};
            System.out.println(arr[10]);

        } catch (Exception e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();/* it is void type.*/

        }
        try {
            int arr[]=new int[]{1,2,3,4,5};
            int sum=0;
            for (int i = 0; i<=2; i++) {
                sum=sum+arr[i];
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();/* it is void type.*/

            
        }
        try {
            String s="vanshika";
            System.out.println(s.charAt(0));/*correct code so it won't go in catch block */ 
        } catch (Exception e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();/* it is void type.*/

        }
    }
}
