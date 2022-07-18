package com.mubashir;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueInJava {

	public static void main(String[] args) {
//     Queue<Integer> queue = new LinkedBlockingQueue<>();
//     queue.add(1);
//     queue.add(2);
//     queue.add(3);
//     queue.add(4);
//     queue.add(5);
//     queue.add(6);
//     queue.add(5);
//     queue.add(9);
     Queue<Integer> queue = new ArrayBlockingQueue<>(6);
     System.out.println(queue.poll());
     System.out.println(queue.peek());

     try {
      queue.offer(1);
      queue.offer(2);
      queue.offer(3);
      queue.offer(4);
      queue.offer(5);
      queue.offer(6);
      queue.offer(5);
      queue.offer(1);
      queue.offer(2);
      queue.offer(3);
      queue.offer(4);
      queue.offer(5);
      queue.offer(6);
      queue.offer(5);
      } catch (IllegalStateException e) {
    	  System.out.println("Queue is full");
      }

      
     
     for (Integer e:queue) {
    	 System.out.println(e);
     }
     System.out.println("***********************");
     System.out.println(queue.remove());
     System.out.println("***********************");
     System.out.println(queue.remove());
     System.out.println("***********************");
    System.out.println(queue.poll());
    System.out.println("***********************");
    System.out.println("First element in queue: "+ queue.peek());

    System.out.println("First element in queue: "+queue.element());
	}

}
