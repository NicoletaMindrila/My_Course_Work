public class FullTimeStaffHire extends StaffHire
{
    private double salary;
    private int  weeklyFractionalHours;
   
    public FullTimeStaffHire(int theVacancy_Number, String theDesignation_Type, String theJob_Type, String theStaffName, String thejoiningDate, String theQualification, String theAppointedBy, boolean theJoined, double theSalary, int theWeeklyFractionalHours){
      
    super(theVacancy_Number, theDesignation_Type,theJob_Type, theStaffName, thejoiningDate, theQualification, theAppointedBy, theJoined);
     
    salary = theSalary;
    weeklyFractionalHours = theWeeklyFractionalHours;
}

public boolean isJoined(){
    return joined;
}

public double getSalary(){
    return salary;
}

public int getWeeklyFractionalHours(){
    return weeklyFractionalHours;
}

public void setSalary(double newSalary){
    if (getjoined()){
      salary = newSalary;  
    }else{
        System.out.println("There is no staff appointed to set the salary");
    }
}

public void setWeeklyFractionalHours(int newWeeklyFractionalHours){
    weeklyFractionalHours = newWeeklyFractionalHours;
}

public void display(){
    super.display();
    
    System.out.println("Salary: " + salary);
    System.out.println("Weekly Fractional Hours: " + weeklyFractionalHours);    
}

public boolean getjoined(){
    return super.joined;
}
    }
    
    
    

