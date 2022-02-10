package Phase1.assestedPracticeProject;

public class Inheritance {

}
class Employee{  
	 float salary=50000;  
	}  
	class Programmer extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
		      Programmer p=new Programmer();  
		      
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
}  