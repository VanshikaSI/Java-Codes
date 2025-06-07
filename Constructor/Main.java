class Bank{
    String name;
    int id;
    int accounts;
   
   
    public void setName(String name){
       this.name=name;
    }
   public String getName(){
       return this.name;
    }
   public void setId(int id){
       this.id=id;
    }
   public int getId(){
       return this.id;
    }
    public void setAccounts(int accounts){
   this.accounts=accounts;
    }
   public int getAccounts(){
       return this.accounts;
    }
    
   }
class Main{
    public static void main(String[] args){
        Bank b= new Bank();//empty constructer is called for()
        b.setName("SBI");
        b.setId(112);
        b.setAccounts(2000);
        Bank b1= new Bank();//empty constructer is called for()
        b1.setName("SBI");
        b1.setId(122);
        b1.setAccounts(2004);

        System.out.println(b.getName());
        System.out.println(b.getId());
        System.out.println(b.getAccounts());

        System.out.println(b1.getName());
        System.out.println(b1.getId());
        System.out.println(b1.getAccounts());
}
}