package Phase1.assestedPracticeProject;

import java.util.*;  

public class CollectionTreeSet {
 
public static void main(String args[]){  

	TreeSet<String> set=new TreeSet<String>();  
        set.add("Kalyani");  
        set.add("Nikita");  
        set.add("Ankita");  
        set.add("Shradha");  

      Iterator<String> itr=set.iterator();  
        while(itr.hasNext()){  
        	  System.out.println(itr.next());  
        }  
    }  
}  