package week10;

public class Kumho extends Tire{
	public Kumho(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accRotation;
		if (accRotation < maxRotation) {
			//Ÿ�̾� ������ �����ִ� ���
			System.out.println(location+" ��ȣŸ�̾� ��������: "+(maxRotation-accRotation)+"ȸ");
			return true;
		}else {
			//Ÿ�̾� ������ �� �ǰ� ��ũ�� ���
			System.out.println("*** "+location+" ��ȣŸ�̾� ��ũ***");
			return false;
		}
	}

}