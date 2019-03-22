package 作業區;
import java.util.Scanner;
public class HW3_3 {

	public static void main(String[] args) {
		System.out.println("請輸入一個大於等於1的整數：");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int p1 = 1;
		int p2 = 1;
		int res = 0;
		System.out.print("1 1 ");
		for(int i=3;i<=num;i++) {
			res=p1+p2;
			p1=p2;
			p2=res;
			System.out.print(res);
			System.out.print(" ");
		}if(num==1) {
			System.out.print("1");
		}else if(num==2) {
			System.out.print("1 1");
		}
	}

}
