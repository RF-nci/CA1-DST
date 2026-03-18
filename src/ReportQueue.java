/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.PriorityQueue;

/**
 *
 * @author xrlei
 */
//create the Priority Queue for important waste
public class ReportQueue {
    private PriorityQueue<WasteMain> queue;

    public ReportQueue() {
        this.queue = new PriorityQueue<>();
    }
    //Adds a new report to the queue
    public void push(WasteMain report) {
        queue.add(report);
    }
    //Deletes the latest addition to the queue
    public WasteMain pop() {
        return queue.poll();
    }

    //Shows the latest addition to queue without deletion
    public WasteMain peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}