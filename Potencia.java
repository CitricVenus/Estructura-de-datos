
public class Potencia {
	public static int power(int base, int exp) {
		if(exp==1) {
			 return base;
		}
		else if(exp==0){
			return 1;
		}
		else {
			return base* power(base, exp-1);
		}
	}
	public static void printBinary_A(int n) {
		if(n<0) { 
			System.out.println("-");
		}
		else if(n<2) {
			System.out.println(n);
		}
		else {
			int lastDigit=n%2;
			int retOfNumber=n/2;
			printBinary_A(retOfNumber);
			printBinary_A(lastDigit);
			
		}
	}
	public static void main (String []args) {
		System.out.println(power(3,2));
		printBinary_A(22);
	}
}
