package sample;

import java.util.Comparator;

public class StudentComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		
		String lastName1 = st1.getLastName();
		String lastName2 = st2.getLastName();
		
		
		if (lastName1.compareTo(lastName2)>0) {
			return 1;
		}
		
		if (lastName1.compareTo(lastName2)<0) {
			return -1;
		}
		
		return 0;
	}
	
	

}
