package sample;

public class ClonProtected {
	
	public boolean ClonSearch (Student []group, Student student) {
		boolean test = false;
		for (int i = 0; i < group.length; i++) {
			if(student.equals(group[i]))
				test = true;
		}
		return test;
	}

}
