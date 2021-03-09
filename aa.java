package a;

import java.util.Scanner;

public class aa {
	public static void main(String args[]){
		//数据定义
		float shuru;
		int meiyuan;
		int wushifen;
		int ershifen;
		int shifen;
		int wufen;
		int ge;
		
		
		//数据输入
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入金钱的大小：");
		shuru =scan.nextFloat();
		//数据处理
		shuru = shuru * 100;
		ge = (int) (shuru % 10);
		wufen =ge / 5;
		ge = ge % 5;
		shuru = shuru/10;
		shifen = (int) (shuru % 10);
		wushifen = shifen / 5;
		shifen = shifen %5;
		ershifen = shifen / 2;
		shifen = shifen % 2;
		meiyuan = (int) (shuru / 10);
		
		//数据输出
		System.out.println("美元 = "+meiyuan );
		System.out.println("五十美分 = "+wushifen );
		System.out.println("二十美分 = "+ershifen );
		System.out.println("十美分 = "+shifen );
		System.out.println("五美分 = "+wufen );
		System.out.println("一美分 = "+ge );
	}
}
