package 正则表达式;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class work {
	public static void main(String[] args) {
		String regMoblie="\\w+@\\w+(.\\w+)+";
		int a=0;
		while(a!=1) {
			System.out.println("请输入邮箱地址:");
			Scanner scan=new Scanner(System.in);
			String phone=scan.nextLine();
			Pattern p=Pattern.compile(regMoblie);
			Matcher m = p.matcher(phone);
			if(m.matches()) {
				System.out.println("输入合法");
				a=1;
			}else {
				System.out.println("输入不合法，请重新输入");
			}
		}
	}
}
