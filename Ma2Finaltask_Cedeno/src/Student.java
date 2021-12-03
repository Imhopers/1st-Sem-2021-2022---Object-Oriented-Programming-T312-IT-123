public class Student
{
    private int PhoneNumber,gradeMath,gradeScience,gradeEnglish,gradeHistory,gradePE, Age;
    private String studentName, studentAddress ;
    
    public Student(int PhoneNumber,int Age, int gradeMath, int gradeScience,int gradeEnglish,int gradeHistory,int gradePE,String studentName, String studentAddress)
    {
        this.studentAddress=studentAddress;
        this.studentName=studentName;
        this.Age=Age;
        this.PhoneNumber=PhoneNumber;
        this.gradeMath=gradeMath;
        this.gradeScience=gradeScience;
        this.gradeEnglish=gradeEnglish;
        this.gradeHistory=gradeHistory;
        this.gradePE=gradePE;
       
    }
    
    public Student(int PhoneNumber,int Age, int gradeMath,int gradeScience,int gradeEnglish,int gradeHistory,int gradePE, String studentName, String studentAddress, String collegeName)
    {
        this(PhoneNumber,Age,gradeMath,gradeScience,gradeEnglish,gradeHistory,gradePE,  studentName, studentAddress);//invoking a constructor
   
    }
    public int getAge()
    {
        return this.Age;
    }
    
    public int getgradeMath()
    {
        return this.gradeMath;
    }
    public int getgradeScience()
    {
        return this.gradeScience;
    }
    public int getgradeEnglish()
    {
        return this.gradeEnglish;
    }
    public int getgradeHistory()
    {
        return this.gradeHistory;
    }
    public int getgradePE()
    {
        return this.gradePE;
    }
    public int getPhoneNumber()
    {
        return this.PhoneNumber;
    }
    
    public String getStudentName()
    {
        return this.studentName;
    }
    
    public String getStudentAddress()
    {
        return this.studentAddress;
    }
    
  
}