package work3;

import java.util.Scanner;

import javax.swing.Spring;

public class no2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int x = 1,y = 0;
		System.out.println("������������������һ����С�ڵڶ���������");
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
		System.out.println("1.���������֮�����������");
		System.out.println("2.���������֮���ż����");
		System.out.println("3.���1��10֮����������ּ���ƽ��");
		System.out.println("4.�����һ�����͵ڶ�����֮������������ƽ����");
		System.out.println("5.�˳�");
		System.out.print("��ѡ������Ҫ�Ĺ��ܣ�");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		return a;
	}


}
