import java.util.Scanner;

public class Employee
{
    private int Id;
    private String name;
    private double Salary;
    private double tax;
    private double tax1;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Id number: ");
        Id = in.nextInt();
        in.nextLine();
        System.out.print("Enter Name: ");
        name = in.nextLine();
        System.out.print("Enter Salary income: ");
        Salary = in.nextDouble();
        
    }
    
    public void cal() {
     
            tax = Salary *.10;
            tax1=tax-Salary;
    }
    
    public void display() {
        System.out.println("Id Number\tName\t\tSalary\tTax");
        System.out.println(Id + "\t\t" + name + "\t\t" 
            + tax1 + "\t\t" + tax+  " \n\n");
    }
    
    public static void main(String args[]) {
    	 Employee e[] = new Employee[2];
    	  
    	  for(int i=0; i<2; i++) {
    	   
    	   e[i] = new Employee();
    	   e[i].input();

        e[i].cal();
        e[i].display();
    	  }
    }
}