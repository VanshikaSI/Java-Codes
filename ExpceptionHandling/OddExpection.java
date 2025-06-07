class OddExpection{
      int n;
     OddExpection(int n) {
        this.n=n;
        try {
            int ans=5/0;
            if(n%2==0){
                System.out.println("No is even");
            }else{
                throw new MyExpection("No is odd");
            }
            
        } catch (MyExpection e) {
            System.out.println("Exception has occured");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}