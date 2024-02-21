import java.util.Scanner;

class day1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		char a = obj.next().charAt(0);
		
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("vovel");
		} else if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
			System.out.println("vovel");
		} else {
			System.out.println("consonent");
		}
		obj.close();

	}
}
