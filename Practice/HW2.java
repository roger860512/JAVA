package 作業區;
import java.util.Scanner;
import java.math.BigDecimal;
public class HW2 {

	public static void main(String[] args) {
		//取得鍵盤資源
		double x = 0;
		double y = 0;
		double z = 0;
		System.out.println("請輸入國文、英文和數學成績：");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		System.out.print((int)(x+y+z));
		System.out.print(" ");
		System.out.println(Math.round((x+y+z)/3));
		
			
	}
}