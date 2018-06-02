import java.util.Scanner;
public class homwork {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 단? ");
		int input = scan.nextInt();
		
		int result = 0;
		
		for(int i = 2; i <= input; i++) {
			System.out.println(i + "단");
			for(int j =1; j <= input; j++) {
				result = i * j;
				System.out.println(i + "*" + j + " = " + result);
				result = 0;
			}
			System.out.println( );
		}
	}

}
