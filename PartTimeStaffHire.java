public class PartTimeStaffHire extends StaffHire
{
  private int workingHour;
  private double wagesPerHour;
  private String shifts;
  private boolean terminated;
  private double incomePerDay;
  private String theStaffName;
  
 
  public PartTimeStaffHire( int theVacancy_Number, String theDesignation_Type, String theJob_Type, String theStaffName, String thejoiningDate, String theQualification, String theAppointedBy, boolean theJoined, int theWorkingHour, double theWagesPerHour, String theShifts, boolean theTerminated)
  {
      
    super(theVacancy_Number, theDesignation_Type, theJob_Type, theStaffName, thejoiningDate, theQualification, theAppointedBy, theJoined);
    
    workingHour = theWorkingHour;
    wagesPerHour = theWagesPerHour;
    shifts = theShifts;
    theTerminated = false;
    this.workingHour = workingHour;
    this.wagesPerHour = wagesPerHour;
    
    
  }
  
  public int getWorkingHour(){
      return workingHour;
  }
  
  public void setWorkingHour(int workingHour){
      this.workingHour = workingHour;
      updateIncomePerDay();
  }
  
  public double getWagesPerHour(){
      return wagesPerHour;
  } 
 
  public void setWagesPerHour(){
      this.wagesPerHour = wagesPerHour;
      updateIncomePerDay();
      
}
 public String getShifts(){
     return shifts;
 }
 
public void setShifts(String newShifts){
    if (getjoined()){
        shifts = newShifts;
    }else{
        System.out.println("Staff has not joined yet");
    }
}
    
public void Staff_Terminate(){
    if(terminated){
        System.out.println("This staff is already terminated");
    }else
    {
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = true;  
        
    }
}

private void updateIncomePerDay() {
    this.incomePerDay = this.workingHour * this.wagesPerHour;
}

public double getIncomePerDay() {
    return incomePerDay;
}


public void display(){
    super.display();
    
    System.out.println("Working Hours: " + workingHour);
    System.out.println("Wages per Hour: " + wagesPerHour);
    System.out.println("Shifts: " + shifts);
    System.out.println("Terminated staff: " + terminated);
    
    double incomePerDay = workingHour * wagesPerHour;
    System.out.println("Income per Day " + incomePerDay);
}
}
    



