package week10;

public class SonicAirplane extends Airplane {
	public static final int NORMAL      = 1;
	public static final int SUPERSONIC   = 2;
	
	int FlyMode = NORMAL;
	
	@Override
	public void fly() {
		if (FlyMode == SUPERSONIC)
			System.out.println("음속비행합니다");
		else
			super.fly();
			
	}
}
