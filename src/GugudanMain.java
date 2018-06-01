
public class GugudanMain {
	public static void main(String[] args) {
		
		for(int j =2; j <10; j++) {
			//calculate와 print 메소드 활용해 구구단 구현하기	
			int [] result = Gugudan.calculate(j);
			Gugudan.print(result);
		}		
	}
}
