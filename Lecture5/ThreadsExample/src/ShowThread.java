
class MyThread1 extends Thread{
	
	public MyThread1(){
	}
	
	public void run(){
		for(int i=0; i<1000; i++){
			System.out.print("Thread1 " + i);
			System.out.println();
		}
	}
}

class MyThread2 extends Thread{
	
	public MyThread2(){
	}
	
	public void run(){
		for(int i=0; i<1000; i++){
			System.out.print("Thread2 " + i);
			System.out.println();
		}
	}
}

public class ShowThread {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();
		
		thread1.start();
		thread2.start();
	}
}
