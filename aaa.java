package a;


import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
	//数据定义
	int chang;
	int kuan;
	int kuangjia;
	double feiyong = 0;
	int yanse;
	int yaguan;
	int yaguanshu = 0;
	
	//数据输入
	Scanner scan = new Scanner(System.in);
	System.out.print("请输入长度：");
	chang = scan.nextInt();
	System.out.print("请输入宽度：");
	kuan = scan.nextInt();
	System.out.println("请选择框架的类型：");
	System.out.println("1.普通框架");
	System.out.println("2.花式框架");
	kuangjia = scan.nextInt();
	System.out.println("是否需要着色：");
	System.out.println("1.需要  0.不需要 ");
	yanse = scan.nextInt();
	System.out.println("是否需要牙冠：");
	System.out.println("1.需要  0.不需要 ");
	yaguan = scan.nextInt();
	if (yaguan == 1) {
		System.out.println("请问需要几个牙冠：");
		yaguanshu = scan.nextInt();
	} 
	//数据处理
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
	//数据输出	
	feiyong = feiyong * 100;
	feiyong = feiyong / 100;
	System.out.println("图片长度为："+chang+"b 图片宽度为："+kuan+"b");
	System.out.println("相框框架费用为："+feiyong);
	}
	

}
