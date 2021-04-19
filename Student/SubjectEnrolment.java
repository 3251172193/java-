package Student;

public class SubjectEnrolment {
	private Student studentList[];
	private Subject subjectList;
	private int count;

	public SubjectEnrolment(){
		super();
		subjectList = new Subject();
		studentList = new Student[subjectList.getMaxNum()];
		count = 0;
	}
	
	public boolean addSubject(Subject subject) {
		if(subject == null)
			return false;
		subjectList = subject;
		System.out.println("创建课程成功，信息如下：");
		System.out.println(subjectList.toString());
		studentList = new Student[subjectList.getMaxNum()];
		return true;
	}
	public boolean addStudent(Student student) {
		if(student == null)
			return false;
		if(count>=studentList.length)
			return false;
		studentList[count]=student;
		count++;
		return true;
	}
	public boolean remove(String id) {
		for(int i=0;i<studentList.length && studentList[i] != null;i++) {
			if(studentList[i].getId().equals(id)) {
				studentList[i]=studentList[i+1];
				count--;
				return true;
			}
		}
		return false;
	}
	public void printf() {
		System.out.println("目前选课情况如下:");
		System.out.println(subjectList.toString());
		System.out.print("学号"+"\t"+"姓名"+"\n");
		for(int i=0;i<count && studentList[i] != null;i++)
			System.out.println(studentList[i].toString());
	}

}
