class Season{
public static void main(String[] args)
{
   System.out.println(Season(1));
}

static String Season(int a)// it we want to return string than mention string in method even if input is integer.
{
    String flag;
    switch(a)
    {
        case 1,2,12:
            flag="Winter";
            break;
        case 3,4,5:
            flag="Summer";
            break;
        case 6,7,8:
            flag="monsoon";
            break;
        case 9,10,11:
            flag="autumn";
            break;
        default:
            flag="invalid";
        }
    return flag;
}










}