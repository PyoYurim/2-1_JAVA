package week10;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i <= 5; i++) {
			int flat = car.run();
			if (flat == 1) {
				System.out.println("�ѱ�Ÿ�̾�� ��ü");
				car.frontLeft = new Hankook("�տ���", 15);
			} else if(flat == 2) {
				System.out.println("�ѱ�Ÿ�̾�� ��ü");
				car.frontRight = new Hankook("�տ�����", 15);
			}else if (flat == 3) {
				System.out.println("��ȣŸ�̾�� ��ü");
				car.frontRight = new Kumho("�ڿ���", 20);
			}else if (flat == 4) {
				System.out.println("��ȣŸ�̾�� ��ü");
				car.frontRight = new Kumho("�ڿ�����", 20);
			}
			System.out.println("----------------------------------");
		}
	}
}
