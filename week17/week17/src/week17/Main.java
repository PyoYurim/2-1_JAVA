package week17;
import exam.Hero;
import exam.Person;

public class Main {
	public static void main(String[] args) {
		System.out.println(add(50, 10));
		System.out.println(add(30, 10, 30));

		System.out.println(add(1, 2, 3, 4, 5));
		
		Person person = new Person();
		Person person2 = new Person("홍길동", 10);
		
		System.out.println(person);
		System.out.println(person2);
		
		Hero hero = new Hero("슈퍼맨");
		Hero hero2 = new Hero("베트맨");
		hero.attack(hero2);
	}
	public static int add(int x, int y) {
		return x + y;
	}
	public static int add(int x, int y, int z) {// 오버로딩
		return x + y + z;
	}
	public static int add(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + i;
		}
		return sum;
	}
}