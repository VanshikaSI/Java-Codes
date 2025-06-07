
class Manager extends Employee {
    double bonus=5000;
    Manager(int employeeid,double salary)
    {
        super(employeeid,salary);
       
    }
    void displaySalary(){
        double total=salary+bonus;
        System.out.println("Manager Details");
        System.out.println("Employee Id(Manager):"+employeeid);
        System.out.println("Company Name:"+company_name);
        System.out.println("Salary with bonus:"+total);
    } 
}
