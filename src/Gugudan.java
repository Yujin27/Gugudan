import java.util.Scanner;
public class Gugudan {
	public static int[] calculate (int item){
		int[] result = new int[9];
		for(int i =0; i < result.length; i++) {
			//계산 결과를 배열에 저장
			result[i] = item * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i =0; i <result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		System.out.println("---");
		
		//3, 4단(값 입력 받기)	
		System.out.print("input number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int a = num * 2;
		System.out.println(a);
	
		//5단(While문 연습)
		int i = 1;
		int output = 1;
		while (i<10) {
			//곱셈 결과 출력
			//i 값을 1 증가
			output = i*5;
			i++;
			System.out.println(output);
		}
		
		System.out.println("---");
		
		//6단(for문 연습)
		int out=0;
		for(int j = 1; j <10; j++) {
			out = j*6;
			System.out.println(out);
		}
		
		System.out.println("---");

		//7단(if문 연습)
		System.out.print("구구단 중 출력할 단은? : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//구구단 출력하는 예제 구현
		//입력한 숫자 값이 2이상, 9이사인지 확인		
		if (n < 2) {
			//사용자에게 에러 메시지 출력
			System.out.println("2보다 큰 숫자를 입력하세요.");
		}
		else if(n >9) {
			//사용자에게 에러 메시지 출력
			System.out.println("9보다 작은 숫자를 입력하세요.");
		}
		else {
			//n에 해당하는 구구단 계산 결과 출력
			for(int k =1; k <10; k++) {
				int con  = n*k;
				System.out.println(con);
			}
		}

		System.out.println("---");
		
		//8단 배열 사용
		int [] con = new int[10];
		for(int j =1; j <10; j++) {
			con[j] = j*8;
			System.out.println(con[j]);
		}

		System.out.println("---");
		
		//2~9단 배열 사용 구현
		int [] o = new int[10];
		
		for(int j =2; j <10; j++) {
			System.out.println();
			System.out.println(j+"단");
			for(int m =1; m <10; m++) {
				o[m]=m*j;
				System.out.println(o[m]);
			}
		}

		//메소드를 활용한 구구단 출력
		for(int j =2; j <10; j++) {
			//calculate와 print 메소드 활용해 구구단 구현하기	
			int [] result = calculate(j);
			print(result);
		}
	}		
}