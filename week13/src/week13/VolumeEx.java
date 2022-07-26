package week13;

public class VolumeEx {
	public static void main(String[] args) {
		//구현 클래스를 이용한 객체 생성
		Radio radio = new Radio();
		TV    tv    = new TV();
		
		// 생성된 객체를 이용한 메소드 호출
		radio.volumeUp(3);
		radio.volumeDown(5);
		tv.volumeUp(6);
		tv.volumeDown(4);
		
		// 인터페이스르 이용한 메소드 호출
		Volume[] vol = new Volume[2];
		vol[0] = radio;
		vol[1] = tv;
		
		for (int i=0; i<2; i++)
			vol[i].volumeUp(3);
	}

}
