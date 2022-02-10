package Phase1.assestedPracticeProject;

public class AccessModifiers{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println(obj.getData()); 
   obj.msg();
   B obj1=new B();  
   System.out.println(obj1.getData()); 
   obj1.msg();
  
   }  
}  

class A{  
private int data=40;  
void msg(){
	System.out.println("Hello java");
	}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}  
}

class B{  
	  int data=30;
	  public static void main(String args[]){  
	   B obj = new B(); 
	   obj.msg(); 
	  }
	  public void msg() {
		  System.out.println("Welcome to java");
     
	  }
	public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}  
		
		 
}
