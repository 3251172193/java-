package a;


import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
	//���ݶ���
	int chang;
	int kuan;
	int kuangjia;
	double feiyong = 0;
	int yanse;
	int yaguan;
	int yaguanshu = 0;
	
	//��������
	Scanner scan = new Scanner(System.in);
	System.out.print("�����볤�ȣ�");
	chang = scan.nextInt();
	System.out.print("�������ȣ�");
	kuan = scan.nextInt();
	System.out.println("��ѡ���ܵ����ͣ�");
	System.out.println("1.��ͨ���");
	System.out.println("2.��ʽ���");
	kuangjia = scan.nextInt();
	System.out.println("�Ƿ���Ҫ��ɫ��");
	System.out.println("1.��Ҫ  0.����Ҫ ");
	yanse = scan.nextInt();
	System.out.println("�Ƿ���Ҫ���ڣ�");
	System.out.println("1.��Ҫ  0.����Ҫ ");
	yaguan = scan.nextInt();
	if (yaguan == 1) {
		System.out.println("������Ҫ�������ڣ�");
		yaguanshu = scan.nextInt();
	} 
	//���ݴ���
	feiyong = chang*kuan*(0.02+0.07) + feiyong;
	if(kuangjia == 1) {
		feiyong = 2*(chang+kuan)*0.15 + feiyong;
	}
	else {
		feiyong =  2*(chang+kuan)*0.25 + feiyong;
	}
	if(yanse == 1){
		feiyong = feiyong + (2*(chang+kuan)*0.1);
	}
	feiyong = feiyong + (yaguanshu*0.35);
	//�������	
	feiyong = feiyong * 100;
	feiyong = feiyong / 100;
	System.out.println("ͼƬ����Ϊ��"+chang+"b ͼƬ���Ϊ��"+kuan+"b");
	System.out.println("����ܷ���Ϊ��"+feiyong);
	}
	

}
