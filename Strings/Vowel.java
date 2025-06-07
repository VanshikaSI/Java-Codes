class Vowel
{
    public static void main(String[] args)
    {
    String s="A";
    String ch=s.toLowerCase();
    switch(ch)
    {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
        System.out.println("Character is vowel");
        break;
        default:
        System.out.println("Character is consontant");
    }
    }
}