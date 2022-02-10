package Phase1.assestedPracticeProject;

class Student{  
	
	int id;  
    String name;  
    
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
   
    void display(){
    	
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  

    Student s1 = new Student(111,"Rakesh");  
    Student s2 = new Student(222,"kalyani");  
    
    s1.display();  
    s2.display();  
   }  
}  