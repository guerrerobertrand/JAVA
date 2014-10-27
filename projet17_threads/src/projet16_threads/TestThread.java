package projet16_threads;

public class TestThread extends Thread {

	Thread t;

	public TestThread(String name){
		super(name);
		System.out.println("Le statut du thread"+ name+ " = " +this.getState());
		this.start();
		System.out.println("Le statut du thread"+ name+ " = " +this.getState());
	}
	
	public TestThread(String name, Thread t){
		super(name);
		this.t=t;
		System.out.println("Le statut du thread"+ name+ " = " +this.getState());
		this.start();
		System.out.println("Le statut du thread"+ name+ " = " +this.getState());
	}
	
	public void run(){
		for(int i =0;i<10;i++){
			System.out.println("Le status du thread est "+this.getName()+" = "+this.getState());
			if(t!=null)
				System.out.println("status de "+t.getName()+" pendant le thread "+this.getName()+ " = "+t.getState());
		}
	}
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Le nom du thread principal est : "+ Thread.currentThread().getName());
		
	}
*/
}
