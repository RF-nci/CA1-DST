/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author xrlei
 */
public class Node{
    private WasteMain data;
    private Node next;


//Constructor for data
    public Node(WasteMain data){
        this.data = data;
        this.next = null;
    }
    //Getters and Setters for data
    public WasteMain getData(){ 
     return data;
    }
    public void setData(WasteMain data){ 
        this.data = data; 
    }
    public Node getNext(){ 
     return next; 
    }
    public void setNext(Node next){ 
        this.next = next;
    }
    
}
    
