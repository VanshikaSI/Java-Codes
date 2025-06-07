

 class Vehicle {
    private  int totalseats;
    private String color;
    private int id;
    Vehicle(int totalseats,String color,int id){
        this.totalseats=totalseats;
        this.color=color;
        this.id=id;
    }
    int getTotalSeats(){
        return this.totalseats;
    }
    String getColor(){
        return this.color;
    }

    int getId(){
        return this.id;
    }

}
