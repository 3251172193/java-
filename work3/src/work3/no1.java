package work3;


import java.util.Scanner;

public class no1 {
	public static int a[] =new int[5];
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
						System.out.println("学生的平均分数为："+jun);
						break;
					}else{
						System.out.println("请先输入分数再执行功能！");
						break;
					}
				}
				case 3:{
					if (a[0] != 0) {
						int max;
						max = max();
						System.out.println("最高成绩位："+max);
						break;
					} else {
						System.out.println("请先输入分数再执行功能！");
						break;
					}	
				}
				case 4:{
					if (a[0] != 0) {
						int min;
						min = min();
						System.out.println("最低成绩位："+min);
						break;
					} else {
						System.out.println("请先输入分数再执行功能！");
						break;
					}
					
				}
				default:{
					System.out.println("输入错误！请重新输入：");
				}
			}
			a1 = caidan();
		}
		

	}
	public static int  caidan() {
		int a ;
		System.out.println("===学生成绩系统====");
		System.out.println("1.输入学生成绩。");
		System.out.println("2.成绩的平均值");
		System.out.println("3.最高分");
		System.out.println("4.最低分");
		System.out.println("5.退出");
		System.out.print("请选择你需要的选项：");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		return a;
	}
	public static void shuru() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"位学生成绩：");
				int b = scan.nextInt();
				if (b>=0 && b<=100) {
					a[i] = b;
				} 
				else {
					System.out.println("输入格式错误！请重新输入：");
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
