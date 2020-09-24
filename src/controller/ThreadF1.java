package controller;

public class ThreadF1 extends Thread{
	
	public ThreadF1() {
		
	}
	
	@Override
	public void run() {
		try {

			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
