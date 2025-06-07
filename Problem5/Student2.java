

public class Student2 {
  int age;
  String name;
  Student2(String name,int age){
    this.name=name;
    this.age=age;
  }    
  String getName(){
    return this.name;
  }
  int getAge(){
    return this.age;
  }
  void display()
    {
      System.out.println("Name : "+this.name+" age : "+this.age);
    }
  

}
