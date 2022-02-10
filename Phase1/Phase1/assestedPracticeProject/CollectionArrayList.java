package Phase1.assestedPracticeProject;

import java.util.*;  

public class CollectionArrayList {

   public static void main(String args[]){  
	
ArrayList<String> list=new ArrayList<String>(); 
list.add("Kalyani"); 
list.add("nikita");  
list.add("Ankita");  
list.add("Shradha");  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}