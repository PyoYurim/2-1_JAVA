package week9;

public class AreaEx {
	
	public static void main(String[] args) {
		Area areaObj = new Area();
		
		double result1 = areaObj.areaCal(10.5);
		System.out.println("���� ����     = " + result1);
		
		int    result2 = areaObj.areaCal(12);
		System.out.println("���簢���� ���� = " + result2);
		
		int result3 = areaObj.areaCal(6,7);
		System.out.println("���簢���� ���� = " + result3);
	}

}
