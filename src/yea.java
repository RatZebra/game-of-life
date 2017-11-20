
public class yea {

	public static void main(String args[]) {
		
	System.out.println(zing(0));
	
		
	}
	
	public static int zing(int n) {
		if(n>10)
			return n-2;
		else {
			n = n*3;
			return n + zing(n+2);
		}
	}
	
}
