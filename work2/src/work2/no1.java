package work2;

import java.util.Scanner;

public class no1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int suijishu;
		int shuru;
		String shifou = "Y";
		
		do {
			suijishu = 1+(int)(Math.random()*1000);
			System.out.println(suijishu);
			System.out.println("我有一个随机数");
			System.out.println("你想猜猜看吗？");
			System.out.println("好吧，游戏开始！");
			Scanner scan = new Scanner(System.in);
			
			for (int i = 0; i < 10; i++) {
				shuru = scan.nextInt();
					if(suijishu == shuru) {
					System.out.println("恭喜你，猜对了！");
					break;
				}
				else {
					if (suijishu < shuru) {
						System.out.println("真遗憾！猜大了！");
					} else {
						System.out.println("真遗憾！猜小了！");
					}
				}
			}
			
			System.out.println("还想再玩一次吗？（Y/N）");
			Scanner scan1 = new Scanner(System.in);
			shifou = scan1.nextLine();
		}while(shifou.equals("Y"));
		System.out.println("游戏结束！");
		
		
	}
}
