class Grade
{
    public static void main(String[] agrs)
    {
        char ch='B';
        switch(ch)
        {
            case 'A':
                System.out.println("Marks are between 80 to 100");
                break;
            case 'B':
                System.out.println("Marks are between 60 to 80");
                break;
            case 'C':
                System.out.println("Marks are between 50 to 60");
                break;
            default:
                System.out.println("Failed");
        }
    }
}