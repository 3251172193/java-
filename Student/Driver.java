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
				System.out.println("��������������ѡ��");
			}
	}
		
		}

	private static int menu() {
			Scanner scan = new Scanner(System.in);
			int choose=0;
			System.out.println("========WTUѡ��ϵͳ======");
			System.out.println("1.�����γ�");
			System.out.println("2.ѡ��");
			System.out.println("3.��ѡ");
			System.out.println("4.��ӡ����");
			System.out.println("5.�˳�");				
			System.out.print("��ѡ��1-5����");
			choose = scan.nextInt();
			return choose;
			}
		public static void creatSubject() {
			Scanner scan = new Scanner(System.in);
			String id,name;
			int max;
			System.out.print("����������γ�id:");
			id=scan.next();
			System.out.print("����������γ�����:");
			name=scan.next();
			System.out.println("����������γ�����:");
			max=scan.nextInt();
			Subject sj=new Subject(id,name,max);
			mant = new SubjectEnrolment();
			mant.addSubject(sj);
			}
		public static void creatStudent() {
			Scanner scan = new Scanner(System.in);
			String id,name;
			System.out.print("������ѡ��ѧ����id:");
			id=scan.next();
			System.out.print("������ѡ��ѧ��������:");
			name=scan.next();
			Student st=new Student(id,name);
			mant.addStudent(st);
			System.out.println("��ϲ�㣬ѡ�γɹ���");
			mant.printf();
		}
		public static void remove() {
			Scanner scan = new Scanner(System.in);
			String id;
			System.out.println("��������ѡѧ����id:");
			id=scan.next();
			if(mant.remove(id)) {
				System.out.println("��ѡ�ɹ����µ�ѡ����Ϣ����:");
				mant.printf();
				}
			else
				System.out.println("ѧ��Ϊ"+id+"��ѧ����û��ѡ�Σ�");
			
		}
		public static void print() {
			mant.printf();
		}

}
