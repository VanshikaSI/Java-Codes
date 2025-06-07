

public class Circle {
    private int r;
    final float  pi=3.14;

    public Circle(int r){
        this.r=r;
    }

    public float getcp(){
        return (2*pi*r);
    }
    public float getca(){
        return (pi*r*r);
    }
   

    

}
