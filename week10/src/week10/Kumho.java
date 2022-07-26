package week10;

public class Kumho extends Tire{
	public Kumho(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accRotation;
		if (accRotation < maxRotation) {
			//타이어 수명이 남아있는 경우
			System.out.println(location+" 금호타이어 남은수명: "+(maxRotation-accRotation)+"회");
			return true;
		}else {
			//타이어 수명이 다 되고 펑크난 경우
			System.out.println("*** "+location+" 금호타이어 펑크***");
			return false;
		}
	}

}
