import java.util.Scanner;
//import org.apache.commons.lang3.StringUtils;
public class Numbering {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int x = 0;
		Scanner m = new Scanner(System.in);
		while (n<10) {
			x = m.nextInt();
			//if (StringUtils.isNumericSpace(m) == true) {
				n = n + 1;
				if (x % 2 == 0) {
					System.out.print("This number is even");
				}else {
					System.out.print("This number is odd");
				}
			//}else {
				//System.out.print("Please, enter a valid number");
			//}
		}
	}

}