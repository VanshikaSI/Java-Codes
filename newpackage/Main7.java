import cal.Add;
import cal.Division;
import cal.Multiply;
import cal.Subtraction;

public class Main7 {
    public static void main(String[] args) {
        Add a=new Add(12,13);
        System.out.println(a.Calculation());
       Subtraction s=new Subtraction(12,3);
       System.out.println(s.Calculation());
       Multiply m=new Multiply(12, 2);
       System.out.println(m.Calculation());
       Division d=new Division(12,2);
       System.out.println(d.Calculation());
    }
    
}
