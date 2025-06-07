


/*Method overriding */

class Employee {
final int employeeid;
 protected double salary;
 static String company_name;

 Employee( int employeeid,double salary ) 
 {
this.employeeid=employeeid;
this.salary=30000;
 }
static void setCompany(String NAME)
{
company_name=NAME;
}
void displaySalary(){
    System.out.println("Employee Details");
    System.out.println("Employee Id:"+employeeid);
    System.out.println("Company Name:"+company_name);
    System.out.println("Salary:"+salary);
} 
}
