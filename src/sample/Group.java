package sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Group {
	
	
	private String name = "";
	private Student[] me3 = new Student[10];

	public Group(Student[] me3, String name) {
		super();
		this.me3 = me3;
		this.name = name;
	}
	
	public Group(String name) {
		super();
		this.name = name;
	}

	public Group() {
		super();

	}
	
	public String getName() {
		return name;
	}

	public Student[] getMe3() {
		return me3;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setMe3(Student[] me3) {
		this.me3 = me3;
	}

	ClonProtected clon = new ClonProtected();
	public void addStudent(Student stud) {
		int count = 0;
		
		try {
			if (clon.ClonSearch(me3, stud ))
				throw new CloneExeption();
			for (int i = 0; i < me3.length; i++) {
				if (me3[i] == null) {
					me3[i] = stud;
					count++;
					break;
				}
			}

			if (count == 0) {
				throw new FullExeption();
			}
		} catch (FullExeption e) {
			System.out.println("Група заповнена студент не доданий");
		} catch (CloneExeption e) {
			System.out.println("Даний студент вже внесений в групу");
		}

	}

	public void dellStudent(long id) {
		for (int i = 0; i < me3.length; i++) {
			if (me3[i] != null && me3[i].getId() == id) {
				me3[i] = null;
			}
		}
	}

	public Student searchStudent(String lastName) {
		Student temp = new Student();
		for (int i = 0; i < me3.length; i++) {
			if (me3[i] != null && me3[i].getLastName().equals(lastName)) {
				temp = me3[i];
				break;
			} else {
				temp = null;
			}
		}
		return temp;
	}
	
	public void sortStudentsByLastName() {
		Arrays.sort(me3, Comparator.nullsLast(new StudentComparator()));
	}

	@Override
	public String toString() {
		return "Group "+name + " " + Arrays.toString(me3);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(me3);
		result = prime * result + Objects.hash(name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Arrays.equals(me3, other.me3) && Objects.equals(name, other.name);
	}
	
	

}
