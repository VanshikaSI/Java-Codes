class Count{
    public static void main(String[] args)
    {
        int vow=0,con=0;
        String s ="Nameeees";
        String s1=s.toLowerCase();
        for(int i=0;i<s1.length();i++){
            switch(s1.charAt(i)){

        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        {
          vow++;
          break;
        }
        
        default:
         con++;
            }
        }
        System.out.println("Number of vowels are "+vow+" and number of consonant are "+con);
    }
}