package week13;

public class Lendable {
	public byte STATE_BORROWED = 1; //대출중
	public byte STATE_NOMAL    = 0; //대출가능
	
	void checkOut(String person, String date);
	void checkIn();
}
