class String1{
    public static void main(String[] args) {
        String s= "errr";
        boolean flag =false;
        for(int i=0;i<s.length();i++){
            {
                switch (s.charAt(i)) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        {
                            flag=true;
                            break;

                        }    
                       default:
                       flag=false;
                }            }
                
        }
        if(flag=true){
                   System.out.println("digit is present");
                }
                else{
                    System.out.println("digit is  notpresent");
                }
    }
}