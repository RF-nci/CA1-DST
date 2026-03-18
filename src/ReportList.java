/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author xrlei
 */
//Creating the report list
public class ReportList {
    private Node head;
    private int size;
    
    public ReportList(){
        this.head = null;
        this.size = 0;
    }
    //If head is empty we add the report as the 1st in the linked list
    //the else functions checks for a head value and if one exists we replace the head with current report
 
    public void addReport(WasteMain report){
        Node newNode = new Node(report);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    //remove report checks if there is reports available first
    //checks if head is present and if index is larger than size
    //removes head and skips to next 
    public void removeReport(int index){
        if (index < 0 || index >= size || head ==null)
            return;
       if(index == 0){
        head = head.getNext();
    }else{
          Node current = head;
          for (int i = 0; i < index - 1; i++) {
               current = current.getNext();
            }
        current.setNext(current.getNext().getNext());
    }
     size--;
    }
    //checks if the head is empty, if it is we have no reports
    //if head is full we have report, print its details and reportID and move to next
    //if nothing in next end loop
    public String getReports() {
        Node current = head;  
        if (current == null) {
            return "No reports available.";
        }
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.getData()).append("\n");
            current = current.getNext();
        }
        return sb.toString();
    }
    // finds 1 report through its index value
    
    public WasteMain getReport(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
          for (int i = 0; i < index; i++) {
           current = current.getNext();
         }
            return current.getData();
}

       public int getSize() {
       return this.size;
        }
       //Prints reports to display box
       //Use StringBuilder to call our toString for neater display
       public String getAllReports(){
        if (head == null) {
        return "No reports available.";
    }
    
    StringBuilder sb = new StringBuilder();
    Node current = head;
    while (current != null){
        sb.append(current.getData().toString()).append("\n------------------\n");
        current = current.getNext();
    }
    return sb.toString();
}
       
       public WasteMain searchByID(String id) {
           Node current = head;
           while (current != null) {
               if (current.getData().getReportID().equalsIgnoreCase(id)) {
                   return current.getData();
               }
               current = current.getNext();
           }
           return null;
       }
       
       public boolean deleteByID(String id){
    if (head == null) return false;

    // Case 1: The report to delete is the HEAD
    if (head.getData().getReportID().equalsIgnoreCase(id)) {
        head = head.getNext();
        size--;
        return true;
    }
    //If  the report is somewhere else in the list use while loop until id match
    //When ID's match, set the next node as current and lower size
    Node current = head;
    while (current.getNext() != null) {
        if (current.getNext().getData().getReportID().equalsIgnoreCase(id)) {
            current.setNext(current.getNext().getNext());
            size--;
            return true;
        }
        current = current.getNext();
    }
    return false;
}
       }


