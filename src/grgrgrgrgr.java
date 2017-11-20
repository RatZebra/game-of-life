
public class grgrgrgrgr {

	public static void main(String args[]) {
		
		crch(12);
		
	}
	
	
	public static void crch(int n) {
		
		if (n <= 0)
			System.out.print(n);
		else {
			crch(n / 3);
			System.out.print("," + n);
		}
	}
	
}
