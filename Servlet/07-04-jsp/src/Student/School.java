package Student;

public class School {
	private String name;
	private Student stu;
	public School(String name, Student stu) {
		super();
		this.name = name;
		this.stu = stu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
}
