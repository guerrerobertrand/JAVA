package projet16_threads;

public class Classe1_Chapitre25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThread t = new TestThread("AAAA");
		TestThread t2 = new TestThread("  BBBB", t);
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("status du thread "+t.getName()+" = "+t.getState());
		System.out.println("status du thread "+t2.getName()+" = "+t2.getState());
		
	}

}
