import java.util.Scanner;
public class Gugudan {
	public static int[] calculate (int item){
		int[] result = new int[9];
		for(int i =0; i < result.length; i++) {
			//��� ����� �迭�� ����
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
		
		//3, 4��(�� �Է� �ޱ�)	
		System.out.print("input number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int a = num * 2;
		System.out.println(a);
	
		//5��(While�� ����)
		int i = 1;
		int output = 1;
		while (i<10) {
			//���� ��� ���
			//i ���� 1 ����
			output = i*5;
			i++;
			System.out.println(output);
		}
		
		System.out.println("---");
		
		//6��(for�� ����)
		int out=0;
		for(int j = 1; j <10; j++) {
			out = j*6;
			System.out.println(out);
		}
		
		System.out.println("---");

		//7��(if�� ����)
		System.out.print("������ �� ����� ����? : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//������ ����ϴ� ���� ����
		//�Է��� ���� ���� 2�̻�, 9�̻����� Ȯ��		
		if (n < 2) {
			//����ڿ��� ���� �޽��� ���
			System.out.println("2���� ū ���ڸ� �Է��ϼ���.");
		}
		else if(n >9) {
			//����ڿ��� ���� �޽��� ���
			System.out.println("9���� ���� ���ڸ� �Է��ϼ���.");
		}
		else {
			//n�� �ش��ϴ� ������ ��� ��� ���
			for(int k =1; k <10; k++) {
				int con  = n*k;
				System.out.println(con);
			}
		}

		System.out.println("---");
		
		//8�� �迭 ���
		int [] con = new int[10];
		for(int j =1; j <10; j++) {
			con[j] = j*8;
			System.out.println(con[j]);
		}

		System.out.println("---");
		
		//2~9�� �迭 ��� ����
		int [] o = new int[10];
		
		for(int j =2; j <10; j++) {
			System.out.println();
			System.out.println(j+"��");
			for(int m =1; m <10; m++) {
				o[m]=m*j;
				System.out.println(o[m]);
			}
		}

		//�޼ҵ带 Ȱ���� ������ ���
		for(int j =2; j <10; j++) {
			//calculate�� print �޼ҵ� Ȱ���� ������ �����ϱ�	
			int [] result = calculate(j);
			print(result);
		}
	}		
}