package work2;

import java.util.Scanner;

public class no1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int suijishu;
		int shuru;
		String shifou = "Y";
		
		do {
			suijishu = 1+(int)(Math.random()*1000);
			System.out.println(suijishu);
			System.out.println("����һ�������");
			System.out.println("����²¿���");
			System.out.println("�ðɣ���Ϸ��ʼ��");
			Scanner scan = new Scanner(System.in);
			
			for (int i = 0; i < 10; i++) {
				shuru = scan.nextInt();
					if(suijishu == shuru) {
					System.out.println("��ϲ�㣬�¶��ˣ�");
					break;
				}
				else {
					if (suijishu < shuru) {
						System.out.println("���ź����´��ˣ�");
					} else {
						System.out.println("���ź�����С�ˣ�");
					}
				}
			}
			
			System.out.println("��������һ���𣿣�Y/N��");
			Scanner scan1 = new Scanner(System.in);
			shifou = scan1.nextLine();
		}while(shifou.equals("Y"));
		System.out.println("��Ϸ������");
		
		
	}
}
