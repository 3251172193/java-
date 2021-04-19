package Student;

import java.util.Scanner;

public class Driver {
	public static SubjectEnrolment mant;
	public static void main(String[] args) {
		int choose = 0;
		while(choose !=5){
			choose = menu();
			switch(choose){
			case 1:creatSubject();break;
			case 2:creatStudent();break;
			case 3:remove();break;
			case 4:print();break;
			default:
				System.out.println("输入有误，请重新选择！");
			}
	}
		
		}

	private static int menu() {
			Scanner scan = new Scanner(System.in);
			int choose=0;
			System.out.println("========WTU选课系统======");
			System.out.println("1.创建课程");
			System.out.println("2.选课");
			System.out.println("3.退选");
			System.out.println("4.打印名单");
			System.out.println("5.退出");				
			System.out.print("请选择（1-5）：");
			choose = scan.nextInt();
			return choose;
			}
		public static void creatSubject() {
			Scanner scan = new Scanner(System.in);
			String id,name;
			int max;
			System.out.print("请依次输入课程id:");
			id=scan.next();
			System.out.print("请依次输入课程名称:");
			name=scan.next();
			System.out.println("请依次输入课程人数:");
			max=scan.nextInt();
			Subject sj=new Subject(id,name,max);
			mant = new SubjectEnrolment();
			mant.addSubject(sj);
			}
		public static void creatStudent() {
			Scanner scan = new Scanner(System.in);
			String id,name;
			System.out.print("请输入选课学生的id:");
			id=scan.next();
			System.out.print("请输入选课学生的姓名:");
			name=scan.next();
			Student st=new Student(id,name);
			mant.addStudent(st);
			System.out.println("恭喜你，选课成功！");
			mant.printf();
		}
		public static void remove() {
			Scanner scan = new Scanner(System.in);
			String id;
			System.out.println("请输入退选学生的id:");
			id=scan.next();
			if(mant.remove(id)) {
				System.out.println("退选成功！新的选课信息如下:");
				mant.printf();
				}
			else
				System.out.println("学号为"+id+"的学生并没有选课！");
			
		}
		public static void print() {
			mant.printf();
		}

}
