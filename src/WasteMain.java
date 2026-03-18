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
public class WasteMain implements UrgencyInterface , ReportDisplayInterface, Comparable<WasteMain>{
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
    public String getReportID() {
        return reportID;
    }
    public void setReportID(String reportID) {
        this.reportID = reportID;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public int getUrgency(){
        return this.priority;
    }
    
    public int getPriority() {
        return this.priority;
    }
    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getReport(){
       return ("Report "+reportID);
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
    //To compare priority over two reports
    //If other report is larger we move it up
    //Else if current report is larger we move that up
    //If equal we add to stack
    //
    @Override
    public int compareTo(WasteMain other) {
        if (this.priority < other.priority) {
            return 1;  
                }else
                    if (this.priority > other.priority) {
                    return -1; 
                     }else{
                        return 0;
    }
}
    
}
