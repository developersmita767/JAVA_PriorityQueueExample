//package com.example;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		 // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
 
        // Adding items to the pQueue using add()
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(10);
        pQueue.add(12);
        
        System.out.println(pQueue);
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
        System.out.println("pqueue after peek:"+pQueue);
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
        System.out.println("pqueue after poll:"+pQueue);
        // Printing the top element again
        System.out.println(pQueue.peek());
        
       
	}

}
