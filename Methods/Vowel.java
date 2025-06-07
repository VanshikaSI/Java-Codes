class Vowel{
    public static void main(String[] args)
    {
       Check('a');//for string '' is required
       Check('b');
    Check('1');
}
    static void Check(char ch)
    {
        if(ch>='a'&& ch<='z')
        {
            switch (ch)
            {
                
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println( ch +"it is vowel");
            break;
        default:
            System.out.println( ch +"it is consonant");
            }}    
        else
        System.out.println( ch+ "it is not an alphabate");
      
       
    }
}