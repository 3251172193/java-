package a;

import java.util.Scanner;

public class aa {
	public static void main(String args[]){
		//���ݶ���
		float shuru;
		int meiyuan;
		int wushifen;
		int ershifen;
		int shifen;
		int wufen;
		int ge;
		
		
		//��������
		Scanner scan = new Scanner(System.in);
		System.out.print("�������Ǯ�Ĵ�С��");
		shuru =scan.nextFloat();
		//���ݴ���
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
		
		//�������
		System.out.println("��Ԫ = "+meiyuan );
		System.out.println("��ʮ���� = "+wushifen );
		System.out.println("��ʮ���� = "+ershifen );
		System.out.println("ʮ���� = "+shifen );
		System.out.println("������ = "+wufen );
		System.out.println("һ���� = "+ge );
	}
}
