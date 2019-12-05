
public class Recursivity {
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	public static void printStar(int n) {
		if(n==1) {
			System.out.print("*");
		}
		else {
			System.out.print("*");
			printStar(n-1);
		}
	}
	/*public public static boolean isPalindrome(String str) {
		if(str.length()==1) {
			return true ;
		}
		else if(str.substring(0,1).equals(str.substring(str.length()-1,str.length())) {
			
		}
	}*/
	public static void main(String[]args) {
		printStar(10);
		
	}
}
