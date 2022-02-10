package Phase1.assestedPracticeProject;

public class ThreadSleepWait {


	public static void main(String[] args) {
		
		Factory factory = new Factory();
		Producer p = new Producer(factory);
		Consumer c = new Consumer(factory);

	}

}



class Factory{
	 int value = 0;
	 boolean status = false;
	   
	 public synchronized void create() {
		 while(status) {
			 try {
				 wait();
			 }catch(InterruptedException e) {;
			   e.printStackTrace();
		 }
			 
	 }
		 
		 value++;
		 System.out.println("Value created is:" +value );
		 status = true;
		 notify();
}
	 
	 public synchronized void remove() {
		 while(!status) {
			 try {
				 wait();
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
				 
	  }
		 System.out.println("Value consumed is:" + value);
		 status=false;
		 notify();
		 
		 }
	 }


class Producer implements Runnable {
	Factory factory;
	
	public Producer(Factory factory) {
		this.factory = factory;
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		for(int i = 1; i <11; i++) {
			
			factory.create();
			try {
				 Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}


class Consumer implements Runnable{
	
		Factory factory;
		
		public Consumer(Factory factory) {
			
			this.factory = factory;
			Thread th = new Thread(this);
			th.start();
		}

		@Override
		public void run() {
			for(int i = 1; i < 11; i++) {
				factory.remove();
				try {
					Thread.sleep(1000);
				}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}	
	
	
			
	}
}
	

	
