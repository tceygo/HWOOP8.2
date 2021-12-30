package sample;

import java.util.Objects;

public class Student extends Human implements CSVConverter {
	private String group;
	private String faculty;
	private long id;
	
	public Student(String name, String lastName, HumanSex sex, int age, String group, String faculty, long id) {
		super(name, lastName, sex, age);
		this.group = group;
		this.faculty = faculty;
		this.id = id;
	}

	public Student() {
		super();
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

	
	@Override
	public String toCSVString() {
		
		String studentCSV = super.getName() + ";" + super.getLastName()+ ";"+ super.getSex()+";"+super.getAge()+";"+faculty+";"+group+";"+id;
		return studentCSV;
	}

	@Override
	public Student fromCSVString(String csv) {
		String[] studentInfo = csv.split(";");
		Student fromCSV = new Student(studentInfo[0], studentInfo[1], HumanSex.valueOf(studentInfo[2]) , Integer.parseInt(studentInfo[3]), studentInfo[5], studentInfo[4],Long.parseLong(studentInfo[6]));
		return fromCSV;
	}

	@Override
	public void inform() {
		System.out.println(toString());
	}
	

	@Override
	public String toString() {
		return "Student [group=" + group + ", faculty=" + faculty + ", id=" + id + ", Name=" + getName()
				+ ", LastName=" + getLastName() + ", Sex=" + getSex() + ", Age=" + getAge() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(faculty, group, id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(faculty, other.faculty) && Objects.equals(group, other.group) && id == other.id;
	}
	
	
	
}
