package ������ʽ;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class work {
	public static void main(String[] args) {
		String regMoblie="\\w+@\\w+(.\\w+)+";
		int a=0;
		while(a!=1) {
			System.out.println("�����������ַ:");
			Scanner scan=new Scanner(System.in);
			String phone=scan.nextLine();
			Pattern p=Pattern.compile(regMoblie);
			Matcher m = p.matcher(phone);
			if(m.matches()) {
				System.out.println("����Ϸ�");
				a=1;
			}else {
				System.out.println("���벻�Ϸ�������������");
			}
		}
	}
}
