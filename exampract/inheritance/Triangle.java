package exampract.inheritance;

public class Triangle extends Circle {
     
  float b;
  float h;
    public Triangle(int r,float b,float h){
        super(r);
        this.b=b;
        this.h=h;
    }
    public double  getta(){
        return (0.5*b*h);
    }
    public double gettp(){
        return (b*h);
    }

}
