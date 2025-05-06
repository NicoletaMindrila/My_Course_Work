public class StaffHire
{
    protected int Vacancy_Number;
    protected String Designation_Type;
    protected String Job_Type;
    protected String staffName;
    protected String joiningDate;
    protected String qualification;
    protected String appointedBy;
    protected boolean joined;
    
    
    public StaffHire(int theVacancy_Number, String theDesignation_Type, String theJob_Type, String theStaffName, String thejoiningDate, String theQualification, String theAppointedBy, boolean theJoined){

        Vacancy_Number = theVacancy_Number;
        Designation_Type = theDesignation_Type;
        Job_Type = theJob_Type;
        staffName = theStaffName;
        joiningDate = thejoiningDate;
        qualification = theQualification;
        appointedBy = theAppointedBy;
        joined = theJoined;
    }
    
    public int getVacancy_Number(){
        return Vacancy_Number;
    }
    public int setVacancy_Number(){
        return Vacancy_Number;
    }
    public String getDesignation_Type(){
        return Designation_Type;
    }
    public String setDesignation_Type(){
        return Designation_Type;
    }
    public String getJob_Type(){
        return Job_Type;
    }
    public String setJob_Type(){
        return Job_Type;
    }
    public String getstaffName(){
        return staffName;
    }
    public String setstaffName(){
        return staffName;
    }
    
    public String getjoiningDate(){
        return joiningDate;
    }
    
    public String setjoiningDate(){
        return joiningDate;
    }
    
    public String getqualification(){
        return qualification;
    }
    
    public String setqualification(){
        return qualification;
    }
    
    public String getappointedBy(){
        return appointedBy;
    }
    
    public String setappointedBy(){
        return appointedBy;
    }
    
    public boolean getjoined(){
        return joined;
    }
    
    public boolean setjoined(){
        return joined;
    }
    
    
    public void display(){
        System.out.println("Vacancy Number:" + Vacancy_Number);
        System.out.println("Designation type:" + Designation_Type);
        System.out.println("Job Type:" + Job_Type);
        System.out.println("Staff Name:" + staffName);
        System.out.println("Joining Date:" + joiningDate);
        System.out.println("Qualification:" + qualification);
        System.out.println("Appointed by:" + appointedBy);
        System.out.println("Joined:" + joined);
        
    }
    
}

