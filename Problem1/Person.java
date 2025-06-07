

public class Person {
    final  String nationality="India";
    String name;
    public Person(String name,String nationality ){
        this.name=name;
        System.out.println(name);
    }
    String getName()
    {
        return this.name;
    }
 void displayinfo(){
    System.out.println("This is a person named  "+name+" and nationality is "+nationality);
 }
 static void greet(){
System.out.println("Welcome to the System");
 }

}
