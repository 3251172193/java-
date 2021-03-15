package work2;


import java.util.Scanner;

public class no2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a;
		
		int min=1,mat;
		int and =0;
		int z;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入3到7之间的一个正整数：");
		a = scan.nextInt();
		int b[] = new int[a];
		
		for (int i = 0; i < a-1; i++) {
			min = min*10;
		}
		mat = (min*10)-1;
		
		for (int i = min; i <= mat; i++) {
			z = i;
			for (int j = 0; j < a; j++) {
				b[j] = z%10;
				z = z/10;
			}
			
			for (int j = 0; j < a; j++) {
				and = (int) Math.pow(b[j], a) + and;
			}
			if (and == i) {
				System.out.println(i);
			}
			and = 0;
		}
			
	}
}
