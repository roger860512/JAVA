package 作業區;
import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double z = 0;
		int j = 0;
		System.out.println("輸入搭乘里程數（公尺）：");
		Scanner in = new Scanner(System.in);
		x = in.nextFloat();
		y = x/1000;
		z = (x-1250)/250;
		j = ((int)x-1250)/250+1;
			if(y<1.25) {
				System.out.println("70");
			}else if(y%0.25==0){
				System.out.println((int)(70+5*z));
			}else {
				System.out.println(70+5*j);

	}

	}
}
