package week15;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		System.out.println(Math.max(10, 30));//최댓값
		System.out.println(Math.min(10, 30));//최솟값
		System.out.println(Math.abs(-30)); //절댓값
		
		String str = "100";
		int i = Integer.parseInt(str);
		String str2 = String.valueOf(i); //int형을 String형으로 
		System.out.println(i);
		
		Random random = new Random();//랜덤함수
		int rand = random.nextInt(10);//0~9중에서 랜덤으로
		System.out.println(rand);
		
		boolean isMarried = true;
		String ans;
		ans = isMarried ? "결혼 했다" : "결혼 안 했다";
		
		if(isMarried) {
			ans = "결혼 했다";
		}else {
			ans = "결혼 안 했다";
		}
		System.out.println(ans);
		
	}

}
