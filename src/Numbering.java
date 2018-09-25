import java.util.Scanner;
public class Numbering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int x = 0;
		while (n<100) {
			System.out.print("Enter a number");
			Scanner m = new Scanner(System.in);
			x = m.nextInt();
			n = n + x;
		}
	}

}
