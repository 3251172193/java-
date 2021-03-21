package work3;

import java.util.Scanner;

import javax.swing.Spring;

public class no2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x = 1,y = 0;
		System.out.println("请输入两个整数（第一个数小于第二个数）：");
		Scanner scan = new Scanner(System.in);
		while (x>=y) {
			x = scan.nextInt();
			y = scan.nextInt();
		}
		int a1 = caidan();
		while (a1 != 5) {
			switch(a1) {
			case 1:{
				int z =x;
				while (z <= y) {
					if (z%2!=0) {
						System.out.print(z+" ");
					}
					z++;
				}
				System.out.println();
			}
			break;
			case 2:{
				int z = x,sum = 0;
				while (z <= y) {
					if (z%2==0) {
						sum = sum+z;
					}
					z++;
				}
				System.out.println(sum);
			}
			case 3:{
				int z = x;
				while(z <= y){
					if (z>=1 && z<=10) {
						System.out.print(z+" ");
						System.out.println(z*z+" ");
					}
					z++;
				}
			}
			case 4:{
				int z = x;
				double sum = 0;
				while (z <= y) {
					if (z%2!=0) {
						sum = sum+Math.pow(z, 2);
					}
					z++;
				}
				System.out.println(sum);
			}
			}
			a1 = caidan();
		}
	}
	public static int  caidan() {
		int a ;
		System.out.println("1.输出两个数之间的所有奇数");
		System.out.println("2.输出两个数之间的偶数和");
		System.out.println("3.输出1到10之间的所有数字及其平方");
		System.out.println("4.输出第一个数和第二个数之间所有奇数的平方和");
		System.out.println("5.退出");
		System.out.print("请选择你需要的功能：");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		return a;
	}


}
