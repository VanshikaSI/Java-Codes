

public class Main {
    public static void main(String[] args) {
        /* for Static use class name. and it should be  mentioned before creating object  */
        Employee.setCompany("JIO");

        Employee e=new Employee(112, 2333);
        e.displaySalary();
        Manager m=new Manager(113, 2333);
        m.displaySalary();
    }
}
