package Student;

public class Subject {
	private String subjectId;
	private String subjectName;
	private int maxNum;
	
	public Subject() {
		super();
	}
	
	public Subject(String subjectId, String subjectName, int maxNum) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.maxNum = maxNum;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	@Override
	public String toString() {
		String info = "课程id:"+subjectId+", 课程名称："+subjectName+", 最大人数："+maxNum;
		return info;
	}
	
}
