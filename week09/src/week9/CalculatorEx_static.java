package week9;

public class CalculatorEx_static {
	public static void main(String[] args) {
		//����(static) �ʵ�� ��ü�� �������� �ʾƵ� ������ �����ϴ�
		int radius = 8;
		double circleArea = Calculator_static.pi * radius * radius;
		System.out.printf("�������� %d�� ���� ���� = %2.f\n", radius, circleArea);
		
		int x = 8;
		int y = 7;
		//����(static) �޼ҵ�� ��ġ�� �������� �ʾƵ� ������ �����ϴ�
		System.out.printf("(%d, %d)�� �� = %d\n", x, y, Calculator_static.plus(x, y));
		System.out.printf("(%d, %d)�� �� = %d\n", x, y, Calculator_static.minus(x, y));
	}

}
