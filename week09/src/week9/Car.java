package week9;
//�޼ҵ�
//void setGas(int gas)
//boolean isLeftGas()
//void run()
public class Car {
	int gas ;
	
	public Car() {
		System.out.println("Car ������ ����");
	}
	
	void setGas(int gas) {  //���� ����
		this.gas = gas;
	}
	boolean isLeftGas() {  //���� ���� �Ǵ�
		boolean result;
		if (gas > 0) {
			System.out.println("gas�� �ֽ��ϴ�.");
			result = true;
		}
		else {
			System.out.println("gas�� �����ϴ�.");
			result = false;
		}
		return result;
	}
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.printf("�޸��ϴ�. (gas �ܷ� : %d)\n", gas);
				gas--;
			}else {
				System.out.printf("����ϴ�. (gas �ܷ� : %d)\n", gas);
				break;
			}
		}
	}
}
