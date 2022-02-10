package Phase1.assestedPracticeProject;

class Line
{

	synchronized public void getLine()                     
	{
		
		for(int i=1;i<=3;i++)
		{
			try{
	    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }  
		System.out.println("running thread state is : "+ Thread.currentThread().getName()+ " :-- " + Thread.currentThread().getState());  
	    System.out.println("Thread Name : "+ Thread.currentThread().getName()+ " :-- "+ i);  
	    System.out.println("Is my thread alive or not? : "+ Thread.currentThread().getName()+ " :-- " + Thread.currentThread().isAlive()); 
	    System.out.println("The thread id is : "+ Thread.currentThread().getName()+ " :-- " + Thread.currentThread().getId()); 
		}  
	
		}
	}

class Sync extends Thread
{
	// reference to Line's Object.
	Line line;

	Sync(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}

public class ThreadSync  {

		
	public static void main(String[] args) {
		
		Line obj = new Line();

		
		Sync bus1 = new Sync(obj);
		Sync bus2 = new Sync(obj);
		Sync bus3= new Sync(obj);
		
		bus1.setName("IT");
		bus2.setName("HR");
		bus3.setName("Finance");
		
		bus1.start();
		bus2.start();
		bus3.start();
		
		

	}

}
