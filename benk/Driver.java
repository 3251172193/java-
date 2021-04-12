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
	System.out.println("��ӭʹ������ϵͳ��");
	System.out.println("1.����");
	System.out.println("2.���");
	System.out.println("3.ȡ��");
	System.out.println("4.����");
	System.out.println("5.����");
	System.out.println("6.���н���");
	System.out.println("7.��ѯ���");
	System.out.println("8.�˳�");
	System.out.print("��ѡ��1-8����");
	choose = scan.nextInt();
	return choose;
}
public static int submenu() {
	Scanner scan = new Scanner(System.in);
	int choose=0;
	System.out.println("��ѡ�񿨵����ͣ�");
	System.out.println("1.���ÿ�");//CheckingAccount
	System.out.println("2.�洢��");//SavingsAccount
	System.out.println("3.�˳�");
	System.out.print("��ѡ��1-3����");
	choose = scan.nextInt();
	return choose;
}
public static void create() {//����
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
		System.out.println("�����˻���");
	}
	
}
public static void createCA() {
	Scanner scan=new Scanner(System.in);
	System.out.println("���������֤�ţ�");
	String ssn= scan.next();
	System.out.println("������������");
	String name = scan.next();
	System.out.println("�����뿪�����ţ�");
	String accountNum=scan.next();
	System.out.println("���������ÿ�����ѣ�");
	float fee=scan.nextFloat();

	CheckingAccount ca=new CheckingAccount(accountNum,0,fee);
	customer = new Customer(ssn,name,ca,null);

}
public static void createSA() {
	Scanner scan=new Scanner(System.in);
	System.out.println("���������֤�ţ�");
	String ssn= scan.next();
	System.out.println("������������");
	String name = scan.next();
	System.out.println("�����뿪�����ţ�");
	String accountNum=scan.next();
	System.out.println("�����봢������ʣ�");
	double interesRate=scan.nextDouble();
	
	SavingsAccount sa=new SavingsAccount(accountNum,0,interesRate);
	customer = new Customer(ssn,name,null,sa);

	
}
public static void save() {
	Scanner scan=new Scanner(System.in);
	float money = 0;
	if(customer != null) {
	System.out.println("����������:");
	money = scan.nextFloat();
	customer.getCa().setBlance(
			money+customer.getCa().getBlance());
	}
	else
		System.out.println("δ���˻������������룡");
}
public static void withdraw() {
	Scanner scan=new Scanner(System.in);
	float money = 0;
	if(customer != null) {
		System.out.println("������ȡ����:");
		money = scan.nextFloat();
		if(money <= customer.getCa().getBlance())
			{
				customer.getCa().setBlance(
						customer.getCa().getBlance()-money);
			}
		else {
			System.out.println("���㣡");
		}
	}
	else
		System.out.println("δ���˻������������룡");
}
public static void comsume() {
	Scanner scan=new Scanner(System.in);
	float money = 0;
	if(customer != null) {
		System.out.println("���������ѽ��:");
		money = scan.nextFloat();
		if(money <= customer.getCa().getBlance())
			{
				customer.getCa().setBlance(
						customer.getCa().getBlance()-money);
			}
		else {
			System.out.println("���㣡");
		}
	}
	else
		System.out.println("δ���˻������������룡");
}
public static void  repay() {
	Scanner scan=new Scanner(System.in);
	float money = 0;
	if(customer != null) {
		System.out.println("�����뻹����:");
		money = scan.nextFloat();
		customer.getCa().setBlance(customer.getCa().getBlance()-money);
		}
	else
			System.out.println("δ���˻������������룡");
}
public static void settle() {
	Scanner scan=new Scanner(System.in);
	if(customer.getCa() != null) {
		double a=customer.getCa().assessserviceCharge(customer.getCa().getBlance(), customer.getCa().getServiceCharge());
		System.out.println("���ÿ�����ѽ��㣺"+a);
	}
	else
		System.out.println("δ���˻������������룡");
	if(customer.getSa() !=null) {
		double b=customer.getSa().payInterest(customer.getSa().getBlance(), customer.getSa().getInteresRate());
		System.out.println("�洢�����ʽ��㣺"+b);
	}
	else
			System.out.println("δ���˻������������룡");
}
public static void balance() {
	if(customer.getCa() != null) {
		System.out.println("���ÿ����:"+customer.getCa().getBlance());
	}
	else
			System.out.println("δ���˻������������룡");
	if(customer.getSa() != null) {
		System.out.println("�洢�����:"+customer.getSa().getBlance());
	}
	else
			System.out.println("δ���˻������������룡");
}

}
