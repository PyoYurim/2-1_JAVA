package exam;

public class Hero extends Person{//상속
	public Hero(String name) {
		super(name, 0);
	}
	private boolean isFlying;

	public boolean isFlying() {
		return isFlying;
	}
	public void setFlying(boolean isFlying) {
		isFlying = isFlying;
	}
	public void attack(Hero hero) {
		System.out.println(this.getName() + "은" + hero.getName() + "과 싸움을 했다");
	}
}
