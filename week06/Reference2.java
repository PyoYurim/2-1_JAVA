package week5;

public class Reference2 {
	public static void main(String[] args) {
		//�ڹٴ� ���ڿ� ���ͷ��� �����ϴٸ� String ��ü�� �����Ѵ�
		String sVal1 = "Java";
		String sVal2 = "Java";
		System.out.println("sVal1==sVal2:"+(sVal1==sVal2?"������ ����":"������ �ٸ�"));
		
		//new �����ڸ� �̿��ϴ� ��쿡�� �� ������ ���ο� String ��ü�� �����ȴ�
		String sVal3 = new String("Java");
		String sVal4 = new String("Java");
		System.out.println("sVal3==sVal4:"+(sVal3==sVal4?"������ ����":"������ �ٸ�"));
		
		//String ��ü�� ������ ���ڿ��� ������ �ִ��� ���� ��쿡��
		//�ݵ�� equals() �޼ҵ带 ����Ѵ�
		if (sVal3.equals(sVal4))
			System.out.println("sVal3�� sVal4�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("sVal3�� sVal4�� ���ڿ��� �ٸ���.");
	}
}
