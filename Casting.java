
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = (double) 1;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = (int) 1.1;
		double d = 1.1;
		System.out.println(c);
		System.out.println(d);
		
		// 1 to string
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	}

}
