package Phase1.assestedPracticeProject;

import java.util.*; 

public class StackDemo {
        public static void main(String[] args) { 
          
        	Stack stack1 = new Stack(); 
            Stack<String> stack2 = new Stack<String>(); 

            stack1.push(4); 
            stack1.push("Geeks"); 
            stack1.push("All"); 
   
            System.out.println("index of element  inside the stack"+ stack1.indexOf("All"));
   
            System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 

            stack2.push("ketki"); 
            stack2.push("nikita"); 
            stack2.push("kalyani"); 
   
            System.out.println("The element at the top of the"+ " stack-2 is: " + stack2.peek()); 

            System.out.println(stack1); 
            System.out.println(stack2); 
   
            System.out.println("Popped element from stack 1: " + stack1.pop()); 
            System.out.println("Popped element from stack 2: " + stack2.pop());      
    } 
}
