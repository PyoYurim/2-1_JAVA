package week10;

public class ChildEx {
	public static void main(String[] args) {
		// Parent Ŭ������ ��ڹ޴� Child Ŭ������ �̿��Ͽ� ��ü�� �����Ѵ�
		Child child = new Child();
		
		// �ڽ� Ŭ������ ������ ��ü�� �θ� Ŭ������ ������ ��ü�� ������ �� �ִ�
		// �� ��, �ڵ� Ÿ�� ��ȯ�ȴ�
		Parent parent = child;
		
		parent.method1();
		
		//�ڵ� Ÿ�� ��ȯ�� ����� ��� �θ� Ŭ���� ��ü�� �ڽ� Ŭ������ �����ǵ� �޼ұװ� ȣ��ȴ�
		parent.method2();
		
		// �ڽ� ��ü�� �θ� ��ü�� �ڵ� Ÿ�� ��ȯ�Ǹ� �ڽ� ��ü���� ���ǵ� �޼ҵ�� ȣ���� �� ����
		//parent.method3();
	}
}
