package 作業區;
import java.util.Scanner;
public class HW3_2 {

	public static void main(String[] args) {
		System.out.println("請輸入一個大於等於1之正整數：");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int a = 0;
		for(int i=2;i<x; i++) if(x%i!=0){
			a++;
		}else {
			a = 0;
			break;
		}
		if(a>0) {
			System.out.println("是質數");
		}else if(x==2){
			System.out.println("是質數");
		}else {
			System.out.println("不是質數");
		}
		

	}

}
