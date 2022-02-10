package Phase1.assestedPracticeProject;

import java.util.Scanner;

public class methodDemo2 {

	public static void main (String args[])  
{  

	Scanner sc = new Scanner(System.in);  
    System.out.print("Enter the number: ");  

    int num = sc.nextInt();  

    findEvenOdd(num);  
}  

public static void findEvenOdd(int num)                             //user defined method
   {  
     if(num%2==0) {
     System.out.println(num+" is even");  
     }
     else {
     System.out.println(num+" is odd");  
     }
   
}  
}