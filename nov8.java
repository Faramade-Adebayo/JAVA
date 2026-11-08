import java.util.Scanner;
public class nov8 {
    public static Employee getEmployeeDetails(){
        Scanner scanner=new Scanner(System.in);
        int id;
        String name;
        double salary;

        System.out.println("Enter id");
        id=scanner.nextInt();
        System.out.println("Enter name:");
        name=scanner.next();
        System.out.println("Enter Salary:");
        salary=scanner.nextDouble();
        Employee employee=new Employee();
        employee.setEmployee();
        employee.setEmployeeName(name);
        employee.setSalary(salary);

        return employee;
    }
    public static int getPRPercentage(){
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter PF Percentage:") ;
          return scanner.nextInt();
          
    }
    public static void main(String [] args){
        Employee employee=getEmployeeDetails();
        int pfp=getPRPercentage();
        employee.calculateNetSalary(pfp); 
        
        System.out.println("Id "+ employee.getEmployeeId());
        System.out.println("Name "+ employee.getEmployeeName());
        System.out.println("Salary "+ employee.getSalary());
        System.out.println("Net Salary "+ employee.getNetSalary());


    }
}

class Employee{
    private int id;
    private String name;
    private double salary;
    private double netSalary;

    public int getEmployeeId(){
        return id;
    }
    public void getEmployeeId(int id){
        this.id=id;
    }
    public String getEmployeeName(){
        return name;
    }
    public void setEmployeeName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getNetSalary(){
        return netSalary;
    }

    public void calculateNetSalary(int pfPercentage){
        double pfAmount=(salary* pfPercentage)/100;
            this.netSalary=salary - pfAmount;
        }
    }

