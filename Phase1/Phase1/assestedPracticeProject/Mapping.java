package Phase1.assestedPracticeProject;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Mapping {
	
	 public static void main(String args[]) {
		 Hashtable<String, Integer> contacts = new Hashtable<>();
		 contacts.put("aUser1", 1000000);
		 contacts.put("dUser1", 1000000);
		 contacts.put("eUser1", 2000000);
		 contacts.put("cUser1", 3000000);
		 contacts.put("bUser1", 4000000);
		 
		 System.out.println(contacts);
		 
		 Set<String> keys = contacts.keySet();
		 System.out.println(keys);
		 Iterator<String> it = keys.iterator();
		 
		 while(it.hasNext()) {
			  String key = it.next();
			  System.out.println(key + ":" + contacts.get(key));
		 }
	 }

}
