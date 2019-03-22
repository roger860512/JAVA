package 作業區;
import java.util.Scanner;

public class HW3_5 {

	public static void main(String[] args) {
		System.out.println("請輸入一個大於1之正整數：");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i=2;i<=x;i++) if(i%2==0){
			System.out.print(i);
		}else {
			System.out.print(" ");
		}

	}

}
