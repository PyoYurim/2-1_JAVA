package week10;

public class Car {
	//�ʵ� = Ŭ������ �Ӽ�
	Tire frontLeft  = new Tire("�տ���", 6); //1�� Ÿ�̾�
	Tire frontRight = new Tire("�տ�����", 2); //2�� Ÿ�̾�
	Tire backLeft   = new Tire("�ڿ���", 3); //3�� Ÿ�̾�
	Tire backRight  = new Tire("�ڿ�����", 4); //4�� Ÿ�̾�
	//���� �޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if (!frontLeft.roll()) {
			stop();
			return 1;                //1�� Ÿ�̾� ����
		}
		if (!frontRight.roll()) {
			stop();
			return 2;               //2�� Ÿ�̾� ����
		}
		if (!backLeft.roll()) {
			stop();
			return 3;
		}
		if (!backRight.roll()) {
			stop();
			return 4;
		}
		return 0;
	}
	//���� �޼ҵ�
	void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	}

}
