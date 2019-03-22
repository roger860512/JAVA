package 作業區;

import java.util.Scanner;

public class HW3_7 {

	public static void main(String[] args) {
		System.out.println("請輸入一個大於等於1之正整數：");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i=1;i<=x;i++) if(i%3==0&&i%2!=0){
			System.out.print(i);
		}else if(i%6==0) {
			System.out.print(" ");
		}
	}
}

