package work3;


import java.util.Scanner;

public class no1 {
	public static int a[] =new int[5];
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a1 = caidan();
		while(a1!=5) {
			Scanner scan = new Scanner(System.in);
			switch(a1)
			{
				case 1:shuru();break;
				case 2:{
					if (a[0] != 0) {
						double jun;
						jun = pinjun();
						System.out.println("ѧ����ƽ������Ϊ��"+jun);
						break;
					}else{
						System.out.println("�������������ִ�й��ܣ�");
						break;
					}
				}
				case 3:{
					if (a[0] != 0) {
						int max;
						max = max();
						System.out.println("��߳ɼ�λ��"+max);
						break;
					} else {
						System.out.println("�������������ִ�й��ܣ�");
						break;
					}	
				}
				case 4:{
					if (a[0] != 0) {
						int min;
						min = min();
						System.out.println("��ͳɼ�λ��"+min);
						break;
					} else {
						System.out.println("�������������ִ�й��ܣ�");
						break;
					}
					
				}
				default:{
					System.out.println("����������������룺");
				}
			}
			a1 = caidan();
		}
		

	}
	public static int  caidan() {
		int a ;
		System.out.println("===ѧ���ɼ�ϵͳ====");
		System.out.println("1.����ѧ���ɼ���");
		System.out.println("2.�ɼ���ƽ��ֵ");
		System.out.println("3.��߷�");
		System.out.println("4.��ͷ�");
		System.out.println("5.�˳�");
		System.out.print("��ѡ������Ҫ��ѡ�");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		return a;
	}
	public static void shuru() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("�������"+(i+1)+"λѧ���ɼ���");
				int b = scan.nextInt();
				if (b>=0 && b<=100) {
					a[i] = b;
				} 
				else {
					System.out.println("�����ʽ�������������룺");
					i--;
				}
		}
	}
	public static double pinjun() {
		int sum = 0;
		double jun;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		jun = sum/a.length;
		return jun ;
	}
	public static int max() {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	public static int min() {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]>min) {
				min = a[i];
			}
		}
		return min;
	}
	
}
