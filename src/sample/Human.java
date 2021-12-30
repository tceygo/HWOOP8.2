package sample;

import java.util.Objects;

public class Human {
	
	private String name;
	private String lastName;
	private HumanSex sex;
	private int age;
	
	public Human(String name, String lastName, HumanSex sex, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public HumanSex getSex() {
		return sex;
	}

	public void setSex(HumanSex sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void inform () {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", lastName=" + lastName + ", sex=" + sex + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, lastName, name, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return age == other.age && Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name)
				&& sex == other.sex;
	}
	
	

}
