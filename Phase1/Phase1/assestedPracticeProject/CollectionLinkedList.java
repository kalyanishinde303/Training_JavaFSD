package Phase1.assestedPracticeProject;

import java.util.*;
public class CollectionLinkedList {

       public static void main(String args[]){  
    	   
          LinkedList<String> al=new LinkedList<String>();  
             al.add("kalyani");  
             al.add("Shradha");  
             al.add("Nikita");  
             al.add("Ankita");  
       Iterator<String> itr=al.iterator();  
       
        while(itr.hasNext()){  
        	  System.out.println(itr.next());  
       }  
    }  
}  