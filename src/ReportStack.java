/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Stack;
/**
 *
 * @author xrlei
 */

public class ReportStack {
   private Stack<WasteMain> stack;

    public ReportStack() {
        this.stack = new Stack<>();
    }
    // PUSH: Pushes a report to the stack
    public void push(WasteMain report) {
        stack.push(report);
    }
    // POP: Deletes the last entry to the stack
    //If stack is empty do nothing
    public WasteMain pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null; 
    }
    //Checks if there is any reports in stack
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

