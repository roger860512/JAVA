package 作業區;

import java.util.Scanner;

public class HW3_8 {

	public static void main(String[] args) {
		System.out.println("請輸入一個大於等於1的整數：");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1;i<=n;i++)if(n%i==0) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

}
