package week7;

public class Pet {
	String type;
	int age;
	int leg; //필드 선언
	
	public Pet(String type, int age) { //클래스에는 leg가 안들어옴
		this.type = type;
		this.age = age;
	}
}
