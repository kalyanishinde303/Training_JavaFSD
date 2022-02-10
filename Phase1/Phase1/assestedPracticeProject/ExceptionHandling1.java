package Phase1.assestedPracticeProject;


public class ExceptionHandling1 extends Exception {
	
	   String str1;
	   ExceptionHandling1(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("Exception Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new Exception("This is My error Message");
		}
		catch(Exception exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}
