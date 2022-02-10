package Phase1.assestedPracticeProject;


public class ExceptionHandling 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new Exception("temp"); 
        } 
        catch (Exception ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}



class ExceptionHand  extends Exception 
{ 
    public ExceptionHand(String s) 
    { 
        super(s); 
    } 
} 
