package week13;

public class Lendable {
	public byte STATE_BORROWED = 1; //������
	public byte STATE_NOMAL    = 0; //���Ⱑ��
	
	void checkOut(String person, String date);
	void checkIn();
}
