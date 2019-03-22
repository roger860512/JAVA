package 作業區;
import java.util.Scanner;

public class HW4_1 {
	public static void main(String[] args) {
		System.out.println("請輸入兩個正整數：");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int i = x;
		while((x%i!=0)||(y%i!=0)) {
			i--;
		}
		System.out.println(i);
	}

}
