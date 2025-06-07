public class Main2 {
    public static void main(String[] args) {
        Bank1 b=new Bank1("Sbi",12,56);
        System.out.println(b.getS());
        System.out.println(b.getAcc());
        System.out.println(b.getID());
        Bank1 b1=new Bank1(12,34);
        System.out.println(b1.getAcc());
        System.out.println(b1.getID());
        Bank1 b2=new Bank1("SBI",34);
        System.out.println(b2.getS());
        System.out.println(b2.getID());
       
/*onces paramatrized is mentioned empty one will not work ,So mention empty function in class Bank */


    }
}
