/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wastedocklands;

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
    //checks if head is present
    //removes head and skips to next 
    public void removeReport(int index){
        if (index < 0 || size > 0)
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
    public void getReports() {
        Node current = head;  
            if (current == null) {
                System.out.println("No reports available.");
                return;
            }
                int index = 0;
                    while (current != null) {
                    System.out.println(current.getData());
                    current = current.getNext();
                    index++;
    }
    }
    // finds 1 report through its index value
    //
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
  }


