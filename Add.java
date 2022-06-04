class Plus {
	static int performAddition(int a, int b) {
		return a+b;
	}
	static float peformAddition(float a, float b) {
		return a+b;
	}
 }
public class Add{
	public static void main(String[] args) {
		Plus a = new Plus();
//System.out.println(a.peformAddition(9,20));
		System.out.println(a.peformAddition(4.5f,3.2f));

	}

}
