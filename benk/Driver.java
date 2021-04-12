package benk;

import java.util.Scanner;

public class Driver {
	public static Customer customer = null;
	public static void main(String[] args) {
	int choose = 0;
	while(choose !=8){
		choose = menu();
		switch(choose){
		case 1:create();break;
		case 2:save();break;
		case 3:withdraw();break;
		case 4:comsume();break;
		case 5:repay();break;
		case 6:settle();break;
		case 7:balance();break;
			default:
		}
	}
	System.out.println(customer.toString());
	}

public static int menu() {
	Scanner scan = new Scanner(System.in);
	int choose=0;
	System.out.println("欢迎使用银行系统：");
	System.out.println("1.开户");
	System.out.println("2.存款");
	System.out.println("3.取款");
	System.out.println("4.消费");
	System.out.println("5.还款");
	System.out.println("6.银行结算");
	System.out.println("7.查询余额");
	System.out.println("8.退出");
	System.out.print("请选择（1-8）：");
	choose = scan.nextInt();
	return choose;
}
public static int submenu() {
	Scanner scan = new Scanner(System.in);
	int choose=0;
	System.out.println("请选择卡的类型：");
	System.out.println("1.信用卡");//CheckingAccount
	System.out.println("2.存储卡");//SavingsAccount
	System.out.println("3.退出");
	System.out.print("请选择（1-3）：");
	choose = scan.nextInt();
	return choose;
}
public static void create() {//开户
	if(customer == null) {
		int choose = 0;
		while(choose !=3){
			choose = submenu();
			switch(choose){
			case 1:createCA();break;
			case 2:createSA();break;
				default:
			}
		}
	}
	else {
		System.out.println("已有账户！");
	}
	
}
public static void createCA() {
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入身份证号：");
	String ssn= scan.next();
	System.out.println("请输入姓名：");
	String name = scan.next();
	System.out.println("请输入开卡卡号：");
	String accountNum=scan.next();
	System.out.println("请输入信用卡的年费：");
	float fee=scan.nextFloat();

	CheckingAccount ca=new CheckingAccount(accountNum,0,fee);
	customer = new Customer(ssn,name,ca,null);

}
public static void createSA() {
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入身份证号：");
	String ssn= scan.next();
	System.out.println("请输入姓名：");
	String name = scan.next();
	System.out.println("请输入开卡卡号：");
	String accountNum=scan.next();
	System.out.println("请输入储蓄卡的利率：");
	double interesRate=scan.nextDouble();
	
	SavingsAccount sa=new SavingsAccount(accountNum,0,interesRate);
	customer = new Customer(ssn,name,null,sa);

	
}
public static void save() {
	Scanner scan=new Scanner(System.in);
	float money = 0;
	if(customer != null) {
	System.out.println("请输入存款金额:");
	money = scan.nextFloat();
	customer.getCa().setBlance(
			money+customer.getCa().getBlance());
	}
	else
		System.out.println("未有账户，请重新输入！");
}
public static void withdraw() {
	Scanner scan=new Scanner(System.in);
	float money = 0;
	if(customer != null) {
		System.out.println("请输入取款金额:");
		money = scan.nextFloat();
		if(money <= customer.getCa().getBlance())
			{
				customer.getCa().setBlance(
						customer.getCa().getBlance()-money);
			}
		else {
			System.out.println("余额不足！");
		}
	}
	else
		System.out.println("未有账户，请重新输入！");
}
public static void comsume() {
	Scanner scan=new Scanner(System.in);
	float money = 0;
	if(customer != null) {
		System.out.println("请输入消费金额:");
		money = scan.nextFloat();
		if(money <= customer.getCa().getBlance())
			{
				customer.getCa().setBlance(
						customer.getCa().getBlance()-money);
			}
		else {
			System.out.println("余额不足！");
		}
	}
	else
		System.out.println("未有账户，请重新输入！");
}
public static void  repay() {
	Scanner scan=new Scanner(System.in);
	float money = 0;
	if(customer != null) {
		System.out.println("请输入还款金额:");
		money = scan.nextFloat();
		customer.getCa().setBlance(customer.getCa().getBlance()-money);
		}
	else
			System.out.println("未有账户，请重新输入！");
}
public static void settle() {
	Scanner scan=new Scanner(System.in);
	if(customer.getCa() != null) {
		double a=customer.getCa().assessserviceCharge(customer.getCa().getBlance(), customer.getCa().getServiceCharge());
		System.out.println("信用卡服务费结算："+a);
	}
	else
		System.out.println("未有账户，请重新输入！");
	if(customer.getSa() !=null) {
		double b=customer.getSa().payInterest(customer.getSa().getBlance(), customer.getSa().getInteresRate());
		System.out.println("存储卡利率结算："+b);
	}
	else
			System.out.println("未有账户，请重新输入！");
}
public static void balance() {
	if(customer.getCa() != null) {
		System.out.println("信用卡余额:"+customer.getCa().getBlance());
	}
	else
			System.out.println("未有账户，请重新输入！");
	if(customer.getSa() != null) {
		System.out.println("存储卡余额:"+customer.getSa().getBlance());
	}
	else
			System.out.println("未有账户，请重新输入！");
}

}
