package Sample;

public class Condition {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		if(a == b) {
			System.out.println("Both numbers are same");
		}else if (a > b) {
			System.out.println("A is  greater than B");
		}
		else if(a < b) {
			System.out.println("A is less than B");
		}
		
		else {
			System.out.println("Numbers doesn't Match");
		}

	}

}
