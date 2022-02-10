package Phase1.assestedPracticeProject;


import java.util.*;  
  
public class CoollectionVector {

public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Rakesh");  
v.add("Sahil");  
v.add("Ashish");  
v.add("Garima");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  