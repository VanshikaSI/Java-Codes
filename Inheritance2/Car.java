
public class Car extends Vehicle
 {
    private String engine;
    Car(int totalseats,String color,int id,String engine){
        super(totalseats, color, id);
        this.engine=engine;
    }
    String getEngine(){
        return this.engine;
    }

}
