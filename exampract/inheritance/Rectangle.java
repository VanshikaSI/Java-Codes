package exampract.inheritance;

public class Rectangle extends Triangle {
    int s1,s2;
    public Rectangle(int r,float b,float h,int s1,int s2){
        super(r,b,h);
        this.s1=s1;
        this.s2=s2;
    }
    public double  getra(){
        return (2*(s1+s2));
    }
     public double getrp(){
        return (s1*s2);
    }
    public double getcm(){
        return(s1*b);
    }
    
}
