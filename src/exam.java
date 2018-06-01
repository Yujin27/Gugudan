import java.util.Scanner;

public class exam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("어디까지 구하고 싶어? ");
		int input = scan.nextInt();
		int result = 1;
		boolean flag = true;
		
		for(int j = 1; j <= input; j++) {
			for(int i =1; i < 10; i++) {
				result = i * j;
				System.out.println(result);
					if(i == j) {
						
				}
			}
			System.out.println();
		}
	}
}