package week10;

public class AirplaneEx2 {
	public static void main(String[] args) {
		SonicAirplane sPlane = new SonicAirplane();
		sPlane.takeOff();
		sPlane.fly();
		sPlane.land();
		
		sPlane.FlyMode = SonicAirplane.SUPERSONIC;
		sPlane.fly();
		sPlane.FlyMode = SonicAirplane.NORMAL;
		sPlane.fly();
	}

}
