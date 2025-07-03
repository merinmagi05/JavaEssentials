package encapsulation;

class Teacher{
	int teacherId;
	String teacherName;
	float teacherSalary;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public float getTeacherSalary() {
		return teacherSalary;
	}

	public void setTeacherSalary(float teacherSalary) {
		this.teacherSalary = teacherSalary;
	}

	@Override
	public String toString() {
		return "teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSalary=" + teacherSalary
				;
	}
	
}

public class TeacherDetails {

	public static void main(String[] args) {
	Teacher teacher=new Teacher();
	
	teacher.setTeacherId(23);
	teacher.setTeacherName("Merin");
	teacher.setTeacherSalary(32.03f);
	
	System.out.println(teacher.getTeacherId()+"\t"+teacher.getTeacherName()+"\t"+teacher.getTeacherSalary());
	
	System.out.println(teacher);
	}

}
