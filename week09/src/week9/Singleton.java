package week9;
// �ϳ��� ���ø����̼� ������ �� �ϳ��� ��ü ������ ����� ��� => �̱��� ���
// �̱��� ����� ���
public class Singleton {
	//1. �ڽ��� ��ü�� �����ؼ� �ʱ�ȭ�Ѵ�.
	//2. private ���������ڸ� �ٿ� �ܺο��� �ʵ尪 ������ �Ұ����ϵ��� �Ѵ�
	private static Singleton singLeton = new Singleton();
	
	//3. �ܺο��� new �����ڷ� ������ ȣ���� �Ұ����ϵ��� private ���� �����ڸ� ���δ�.
	private Singleton() {  }
	
	//4. �ܺο��� ��ü �������̵� ȣ���� �� �ֵ��� ���� �޼ҵ带 �����Ѵ�
	static Singleton getInstance() {
		
		//5. �����ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü�� �����Ѵ�
		return singLeton;
	}
	//6. hryOmstance() �� �̿��Ͽ� ������ ��ü�� ��� ���� ��ü�� �����ϰ� �ȴ�

}
