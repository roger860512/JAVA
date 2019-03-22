package 作業區;

import java.util.Scanner;

public class HW3_6 {

	public static void main(String[] args) {
		System.out.println("請輸入一個大於等於1的整數：");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<=n;i++)if(n/(2<<i)==0) {
			System.out.println(i+1);
			break;
		}
	}
}
