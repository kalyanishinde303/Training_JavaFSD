package Phase1.assestedPracticeProject;

public class ThreadCreation {


public class ThreadDemo3 {

	public static void main(String[] args) {
		
			Math1 math = new Math1();
			math.setPriority(Thread.MAX_PRIORITY);           //setting Priority to Thread
			math.setName("Incrementing Thread");             //changing the Thread name
			math.start();
			
			System.out.println("Program Execution.");
	}

}
}

class Math1 extends Thread {
	
	public void run() {
		 print();
	}
	
	public void print() {
		System.out.println(this.getPriority());
		for(int i=1; i<11; i++) {
			System.out.println(this.getName()  + ":" + i);
		}
		
	}

}
