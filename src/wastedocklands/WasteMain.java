/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wastedocklands;

/**
 *
 * @author xrlei
 */
// declare my attributes and link interfaces to main class
public class WasteMain implements UrgencyInterface , ReportDisplayInterface{
    public String reportID;
    public String location;
    public int priority;
    public String type;

    //Used to store attributes entered through the GUI input fields
     public WasteMain(String reportID, String location, String type, int priority){
            this.reportID = reportID;
            this.location = location;
            this.type = type;
            this.priority = priority;
            
    }
     
     
    //Declare getters and setters for indexing
   // Getter and setter for urgency int value for priority queue
     @Override
    public String getReportID() {
        return reportID;
    }
    @Override
    public void setReportID(String reportID) {
        this.reportID = reportID;
    }
    @Override
    public String getLocation() {
        return location;
    }
    @Override
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public int getPriority() {
        return priority;
    }
    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String getReport(){
       System.out.println("Report "+reportID);
    }
    
    //toString for output syntax of Reports
    @Override
    public String getReports(){
        return toString();
    }

    @Override
    public String toString() {
        return "WasteMain{" + "Report ID = " + reportID + ", Location = " + location + ", Priority = " + priority + ", Waste =" + type + '}';
    }

    
}
