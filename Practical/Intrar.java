import java.util.*;

interface n1{
    final double pi=3.14;
    public void Circle();
}
interface n2{
    public void area();
    public void circum();

}
class Circle implements n1,n2{
    double r,area,circum;
    public void Circle(){
        System.out.println("This is a circle.");
    }
        public void area(){ 
            System.out.print(" Enter radius:");
             Scanner s= new Scanner(System. in);
              r=s.nextDouble(); 
            area=pi*r*r; 
            System.out.println("Area of circle is:" + area);}
             public void circum(){ 
            circum=pi*r*r; 
            System.out.println("circumference of circle is:" + circum);
    }
}


public class Intrar {
     public static void main(String[] args) {
         Circle c1= new Circle();
         c1.area();
         c1.circum();
     }
}
