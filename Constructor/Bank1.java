 class Bank1 {
    String s;
    int acc;
    int id;
    String getS(){
        return this.s;
    } 
    int getAcc(){
        return this.acc;
    }
    int getID(){
        return this.id;
    }
    Bank1(String s,int acc,int id){
        this.s="HDFC";
        this.acc=acc;
        this.id=id;
    }
    Bank1(int acc,int id){
        this.acc=acc;
        this.id=id;

    }
    Bank1(String s,int id){
        this.s=s;
        this.id=23;
    }
    
}
