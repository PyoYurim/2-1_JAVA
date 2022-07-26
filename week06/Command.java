package week5;

public class Command {
	public static void main(String[] args) {
		if (args.length != 2) { //배열의 길이가 2가 아니면 
			System.out.println("프로그램 사용법");//이거를 실행해라
			System.out.println("java Command num1 num2");
			System.exit(0);//프로그램을 끝내라
		}
		//배열의 길이가 2면 이걸 실행
		String strNum1 = args[0];//0번째 배열값 저장
		String strNum2 = args[1];//1번째 배열값 저장
		
		int num1= Integer.parseInt(strNum1); //숫자로 바꾸고
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}
}
