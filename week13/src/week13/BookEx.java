package week13;

public class BookEx {
	public static void main(String[] args) {
		Book book = new Book("863", "코스모스", "칼세이건");
		printState(book);
		book.checkOut("홍길동", "2019-05-19");
		printState(book);
		book.checkOut("홍길동", "2019-05-20");
		book.checkIn();
	}
	
	private static void printState(Book book) {
		if (book.state == Lendable.STATE_NORMAL) {
			System.out.println("------------------");
			System.out.println("제목 : " + book.title);
			System.out.println("대출 상태 : 대출 가능");
			System.out.println("------------------");
		} else if (book.state == Lendable.STATE_BORROWED) {
			System.out.println("------------------");
			System.out.println("제목 : " + book.title);
			System.out.println("대출 상태 : 대출증");
			System.out.println("대출자 : " + book.person);
			System.out.println("대출일 : " + book.checkDate);
			System.out.println("---------------------");
		}
	}
}
