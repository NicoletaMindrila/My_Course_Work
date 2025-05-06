import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener
{
    // Database component
    private ArrayList<StaffHire>staffList;

    // GUI components
    private JTextField VacancyNumber;
    private JTextField DesignationType;
    private JTextField JobType;
    private JTextField staffName;
    private JTextField joiningDate;
    private JTextField qualification;
    private JTextField appointedBy;
    private JTextField joined;
    private JTextField salary;
    private JTextField weeklyFractionalHours;
    private JTextField workingHour;
    private JTextField wagesPerHour;
    private JTextField shifts;
    private JTextField terminateNumber;
    private JTextField displayNumber;
    private JButton JoinStaffButton;
    private JButton submitButton;
    private JButton previewButton;
    private JButton addFullTimeStaffButton;
    private JButton addPartTimeStaffButton;
    private JButton setSalaryButton;
    private JButton setShiftsButton;
    private JButton terminateButton;
    private JButton displayButton;
    private JButton clearButton;

    public GUI()
    {
        // Initialize staffList
        staffList = new ArrayList<StaffHire>();

        // Initialize GUI interface
        JFrame frame = new JFrame("Test app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(20,4));

        // Creating GUI components
        JLabel VacancyNumberLabel = new JLabel("Vacancy Number");
        VacancyNumber = new JTextField(15);

        JLabel DesignationTypeLabel = new JLabel("Designation Type:");
        DesignationType = new JTextField(15);

        JLabel JobTypeLabel = new JLabel("Job Type:");
        JobType = new JTextField(15);

        JLabel staffNameLabel = new JLabel("Staff Name:");
        staffName = new JTextField(15);

        JLabel joiningDateLabel = new JLabel("Joining Date:");
        joiningDate = new JTextField(15);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualification = new JTextField(15);

        JLabel appointedByLabel = new JLabel("Appointed By:");
        appointedBy = new JTextField(15);

        JLabel joinedLabel = new JLabel("Joined:");
        joined = new JTextField(15);

        JLabel salaryLabel = new JLabel("Salary:");
        salary = new JTextField(15);

        JLabel weeklyFractionalHoursLabel = new JLabel("Weekly Fractional Hours:");
        weeklyFractionalHours = new JTextField(15);

        JLabel wagesPerHourLabel = new JLabel("Wages Per Hour:");
        wagesPerHour = new JTextField(15);

        JLabel shiftsLabel = new JLabel("Shifts:");
        shifts = new JTextField(15);

        JLabel terminateNumberLabel = new JLabel("Terminate Number:");
        terminateNumber = new JTextField(15);

        JLabel displayNumberLabel = new JLabel("Display Number:");
        displayNumber = new JTextField(15);
        
        addFullTimeStaffButton = new JButton("Add Full Time Staff:");
        addFullTimeStaffButton.addActionListener(this);
        
        JoinStaffButton = new JButton("Join Staff:");
        JoinStaffButton.addActionListener(this);
        
        addPartTimeStaffButton = new JButton("Add Part Time Staff:");
        addPartTimeStaffButton.addActionListener(this);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        previewButton = new JButton("Preview");
        previewButton.addActionListener(this);

        setSalaryButton = new JButton("Set Salary");
        setSalaryButton.addActionListener(this);

        setShiftsButton = new JButton("Set Shifts");
        setShiftsButton.addActionListener(this);

        terminateButton = new JButton("Terminate Staff");
        terminateButton.addActionListener(this);

        displayButton = new JButton("Display Staff");
        displayButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        frame.add(VacancyNumberLabel);
        frame.add(VacancyNumber);
        frame.add(DesignationTypeLabel);
        frame.add(DesignationType);
        frame.add(JobTypeLabel);
        frame.add(JobType);
        frame.add(staffNameLabel);
        frame.add(staffName);
        frame.add(joiningDateLabel);
        frame.add(joiningDate);
        frame.add(qualificationLabel);
        frame.add(qualification);
        frame.add(appointedByLabel);
        frame.add(appointedBy);
        frame.add(joinedLabel);
        frame.add(joined);
        frame.add(salaryLabel);
        frame.add(salary);
        frame.add(weeklyFractionalHoursLabel);
        frame.add(weeklyFractionalHours);
        frame.add(wagesPerHourLabel);
        frame.add(wagesPerHour);
        frame.add(shiftsLabel);
        frame.add(shifts);
        frame.add(terminateNumberLabel);
        frame.add(terminateNumber);
        frame.add(submitButton);
        frame.add(previewButton);
        frame.add(addFullTimeStaffButton);
        frame.add(addPartTimeStaffButton);
        frame.add(setSalaryButton);
        frame.add(setShiftsButton);
        frame.add(terminateButton);
        frame.add(displayNumberLabel);
        frame.add(displayNumber);
        frame.add(displayButton);
        frame.add(clearButton);
        frame.add(displayNumberLabel);
        frame.add(displayNumber);
        frame.add(JoinStaffButton);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addFullTimeStaffButton){
            
           int VacancyNumberValue = Integer.parseInt(VacancyNumber.getText());
            String DesignationTypeText = DesignationType.getText();
            String JobTypeText = JobType.getText();
            String staffNameText = staffName.getText();
            String joiningDateText = joiningDate.getText();
            String qualificationText = qualification.getText();
            String appointedByText = appointedBy.getText();
            boolean joinedStatus = Boolean.parseBoolean(joined.getText());
            double salaryNumber = Double.parseDouble(salary.getText());
            int weeklyFractionalHoursNumber = Integer.parseInt(weeklyFractionalHours.getText());
            
            if ("Full Time".equalsIgnoreCase(JobTypeText)){
                FullTimeStaffHire FullTimeStaff = new FullTimeStaffHire(VacancyNumberValue, DesignationTypeText, JobTypeText, staffNameText, joiningDateText, qualificationText, appointedByText, joinedStatus, salaryNumber, weeklyFractionalHoursNumber);
                staffList.add(FullTimeStaff);
                JOptionPane.showMessageDialog(null,"Full Time Staff added successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Please write 'Full Time' as the Job Type!");
            }
            }
        if (e.getSource() == addPartTimeStaffButton){
            
           int VacancyNumberValue = Integer.parseInt(VacancyNumber.getText());
            String DesignationTypeText = DesignationType.getText();
            String JobTypeText = JobType.getText();
            String staffNameText = staffName.getText();
            String joiningDateText = joiningDate.getText();
            String qualificationText = qualification.getText();
            String appointedByText = appointedBy.getText();
            boolean joinedStatus = Boolean.parseBoolean(joined.getText());
            double salaryNumber = Double.parseDouble(salary.getText());
            int weeklyFractionalHoursNumber = Integer.parseInt(weeklyFractionalHours.getText());
            double wagesPerHourNumber = Double.parseDouble(wagesPerHour.getText());
            String shiftsText = shifts.getText();
            if ("Part Time".equalsIgnoreCase(JobTypeText)){
                PartTimeStaffHire PartTimeStaff = new PartTimeStaffHire(VacancyNumberValue, DesignationTypeText, JobTypeText, staffNameText, joiningDateText, qualificationText, appointedByText, joinedStatus, weeklyFractionalHoursNumber,wagesPerHourNumber, shiftsText, false);
                staffList.add(PartTimeStaff);
                JOptionPane.showMessageDialog(null,"Part Time Staff added successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Please write 'Part Time' as the Job Type!");
            }
    }
    
        if(e.getSource() == submitButton)
        {
            int VacancyNumberValue = Integer.parseInt(VacancyNumber.getText());
            String DesignationTypeText = DesignationType.getText();
            String JobTypeText = JobType.getText();
            String staffNameText = staffName.getText();
            String joiningDateText = joiningDate.getText();
            String qualificationText = qualification.getText();
            String appointedByText = appointedBy.getText();
            boolean joinedStatus = Boolean.parseBoolean(joined.getText());
            double salaryNumber = Double.parseDouble(salary.getText());
            int weeklyFractionalHoursNumber = Integer.parseInt(weeklyFractionalHours.getText());
            double wagesPerHourNumber = Double.parseDouble(wagesPerHour.getText());
            String shiftsText = shifts.getText();

            if (JobTypeText.equalsIgnoreCase("Part Time")){
                PartTimeStaffHire staff = new PartTimeStaffHire(VacancyNumberValue, DesignationTypeText, JobTypeText, staffNameText,joiningDateText,qualificationText,appointedByText,joinedStatus,weeklyFractionalHoursNumber, wagesPerHourNumber,shiftsText, false);
                staffList.add(staff);  
                JOptionPane.showMessageDialog(null, "Part Time Staff added successfully!"); 
            } 
            else if (JobTypeText.equalsIgnoreCase("Full Time")){

                FullTimeStaffHire staff = new FullTimeStaffHire(VacancyNumberValue, DesignationTypeText, JobTypeText, staffNameText,joiningDateText,qualificationText,appointedByText,joinedStatus, salaryNumber,weeklyFractionalHoursNumber);
                staffList.add(staff);  
                JOptionPane.showMessageDialog(null, "Full Time Staff added successfully!");
            }

        }else if(e.getSource() == previewButton)
            {
                System.out.println("Current contents of the database:");

                for(int i = 0; i < staffList.size(); i++)
                {
                    StaffHire emp = staffList.get(i);
                    System.out.println("Employee at index " + i + ": " + emp); 
                    emp.display();
                }
            }else if (e.getSource() == setSalaryButton) {
                
                try{
                    String staffNameText = staffName.getText();
                    
                    boolean staffFound = false;
                    
                    for (StaffHire staff : staffList) {
                       if (staff instanceof FullTimeStaffHire){
                           FullTimeStaffHire fullTimeStaff = (FullTimeStaffHire) staff;
                           int vacancyNumber = Integer.parseInt(VacancyNumber.getText());
                            if (fullTimeStaff.getVacancy_Number() == vacancyNumber && fullTimeStaff.getstaffName().equalsIgnoreCase(staffNameText)) {
                                 double newSalary = Double.parseDouble(salary.getText());
                                 fullTimeStaff.setSalary(newSalary);
                           JOptionPane.showMessageDialog(null, "Salary was updated successfully for " + staffNameText);
                           staffFound = true;
                           break;
                           
                       }
                       
                    }
                }
                
                if (!staffFound) {
                    JOptionPane.showMessageDialog(null, "Staff is not found!");
                }
                } catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Invalid input! Please try again!");
                }
        
    
                String staffNameText = staffName.getText();
                for (StaffHire staff : staffList){
                    if (staff instanceof FullTimeStaffHire && staff.getstaffName().equals(staffNameText)) {
                        ((FullTimeStaffHire) staff).setSalary(Double.parseDouble(salary.getText()));
                        JOptionPane.showMessageDialog(null, "Salary is successfully set for Full Time Staff!");
                        break;
                    }
                }
                    
            }else if (e.getSource() == setShiftsButton) {

                String staffNameText = staffName.getText();
                for (StaffHire staff : staffList){
                    if (staff instanceof PartTimeStaffHire && staff.getstaffName().equals(staffNameText)){
                        ((PartTimeStaffHire) staff).setShifts(shifts.getText());
                        JOptionPane.showMessageDialog(null, "Shitfs are successfully set for Part Time Staff!");
                        break;

                    }
                }
            }else if (e.getSource() == terminateButton) {

                String staffNameText = staffName.getText();
                for (StaffHire staff : staffList){
                    if (staff instanceof PartTimeStaffHire && staff.getstaffName().equals(staffNameText)) {
                        staffList.remove(staff);                        
                        JOptionPane.showMessageDialog(null, "Part Time Staff terminate!");
                        break;
                    }
                }
            }
            else if (e.getSource() == displayButton) {
                String inputText = displayNumber.getText().trim();
                
                if(inputText.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Please eneter a valid index!");
                }else{
                    try{
                      int displayIndex = Integer.parseInt(inputText); 
                      
                      if (displayIndex >=0 && displayIndex < staffList.size()) {
                    StaffHire staff = staffList.get(displayIndex);
                    staff.display();
                    }else{
                      JOptionPane.showMessageDialog(null, "Not a valid index!");  
                    }
                }catch(NumberFormatException ex) {
                 JOptionPane.showMessageDialog(null, "Invalid Input!");   
                }
                }
    }else if (e.getSource() == clearButton){
                VacancyNumber.setText("");
                DesignationType.setText("");
                JobType.setText("");
                staffName.setText("");
                joiningDate.setText("");
                qualification.setText("");
                appointedBy.setText("");
                joined.setText("");
                salary.setText("");
                weeklyFractionalHours.setText("");
                wagesPerHour.setText("");
                shifts.setText("");
                terminateNumber.setText("");
                displayNumber.setText("");

            }   
        }
        
        public void displayAllStaffMembers() {
    for (StaffHire staff : staffList) {
        staff.display();
    }
}

        public static void main(String[] args){
        new GUI();
    }
}







