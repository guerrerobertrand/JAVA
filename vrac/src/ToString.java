
public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pointo a = new Pointo(1,2);
		Pointo b = new Pointo(5,6);
		System.out.println("a = "+ a.toString());
		System.out.println("b = "+ b.toString());
		Object o=new Pointo(3,4);
		System.out.println("mon objet o = "+o);
	}

}


class Pointo{
	public Pointo(int abs, int ord){
		x=abs;
		y=ord;
	}
	private int x, y;
}
