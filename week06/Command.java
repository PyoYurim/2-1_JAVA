package week5;

public class Command {
	public static void main(String[] args) {
		if (args.length != 2) { //�迭�� ���̰� 2�� �ƴϸ� 
			System.out.println("���α׷� ����");//�̰Ÿ� �����ض�
			System.out.println("java Command num1 num2");
			System.exit(0);//���α׷��� ������
		}
		//�迭�� ���̰� 2�� �̰� ����
		String strNum1 = args[0];//0��° �迭�� ����
		String strNum2 = args[1];//1��° �迭�� ����
		
		int num1= Integer.parseInt(strNum1); //���ڷ� �ٲٰ�
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}
}
