package projet17_IRunnable;

public class TestCompteEnBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteEnBanque cb= new CompteEnBanque();
		CompteEnBanque cb2= new CompteEnBanque();

		Thread t = new Thread(new RunImpl(cb, "bertrand"));
		Thread t2 = new Thread(new RunImpl(cb, "claire"));
		
		t.start();
		t2.start();
	}

}
