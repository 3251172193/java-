package work1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "������ѧ��������Ϣ�������ʽΪ��ѧ�ţ��������Ա𡱣��硰001���������С��������롰end��ʱ�������룩\n"
                + "ѧ���ɼ�������ʽΪ��ѧ�ţ��γ����ƣ��ɼ������硰001��Java��90���������롰end��ʱ�������룩");
        StudentDao dao = new StudentDao();
        ArrayList<Student> students = dao.studentRead();
        ArrayList<Result> results = dao.statis(students);
        dao.display(students, results);
    }
}