package exam;

public class Person {
	private String name;
	private int age;
	
	public Person() {//기본생성자
		
	}
	public Person(String name, int age) { //오버로드된 생성자
		this.name = name;//초기화
		this.age = age;//초기화
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
