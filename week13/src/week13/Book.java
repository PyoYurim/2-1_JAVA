package week13;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

public class Book implements Lendable {
	
	String bookNo;
	String title;
	String writer;
	String person;
	String checkDate;
	byte   state;
	
	public Book(String bookNo, String title, String writer) {
		this.bookNo = bookNo;
		this.title  = title;
		this.writer = writer;
		
		public void checkOut(String person, String date) {
			if (state == Lendable.STATE_BORROWED) {
				
			}
		}
	}

}
