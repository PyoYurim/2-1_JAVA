package week10;

public class Child extends Parent {
	//Parent Ŭ������ ���ǵ� methode2()�� �������Ѵ�
	@Override
	public void method2() {
		System.out.println("Child-method2");
	}
	
	//method3()�� Child Ŭ�������� ���ǵ� �޼ҵ��̴�
	public void method3() {
		System.out.println("Child-method3");
	}
}
