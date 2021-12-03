import java.util.Scanner;
public class MainClass
{   public static void main (String[] args) 
    {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Student's Name:");
       String studentName=sc.nextLine();
       
       System.out.println("Enter Phone Number:");
       int PhoneNumber=sc.nextInt();
       sc.nextLine();
       
       System.out.println("Enter Student's address:");
       String studentAddress=sc.nextLine();
       
       System.out.println("Enter Student's Age:");
       int Age=sc.nextInt();
       
       System.out.println("Grade in Math:");
       int gradeMath=sc.nextInt();
       
       System.out.println("Grade in Science:");
       int gradeScience=sc.nextInt();
       
       System.out.println("Grade in English:");
       int gradeEnglish=sc.nextInt();
       
       System.out.println("Grade in History:");
       int gradeHistory=sc.nextInt();
       
       System.out.println("Grade in PE:");
       int gradePE=sc.nextInt();
       
       while(true)
       {
            System.out.println("Do you want to print your Student data? (Yes/No):");	
            String answer=sc.nextLine();
       
            if(answer.equalsIgnoreCase("yes"))
            {
                Student obj = new Student(PhoneNumber, Age, gradeMath, gradeScience, gradeEnglish, gradeHistory, gradePE, studentName, studentAddress);
               
           
                System.out.println("Student name:"+obj.getStudentName());
                System.out.println("Phone number:"+obj.getPhoneNumber());
                System.out.println("Address:"+obj.getStudentAddress());
                System.out.println("Age:"+obj.getAge());
                System.out.println("\nStudent Grades");
                System.out.println("Math:"+obj.getgradeMath());
                System.out.println("Science:"+obj.getgradeScience());
                System.out.println("English:"+obj.getgradeEnglish());
                System.out.println("History:"+obj.getgradeHistory());
                System.out.println("PE:"+obj.getgradePE());
                break;
            }
           
            else if(answer.equalsIgnoreCase("no"))
            {       
              
                exit();
                break;
            }
            
           
       }
    }

private static void exit() {
exit();
	
}
}