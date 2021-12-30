package sample;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		
		//Student student1 = new Student("Олександр", "Іваненко", HumanSex.MALE, 34,"МЕ-3", "Економіки і менеджменту", 1345);
		//student1.inform();
		Group p = new Group("МЕ-3");
		AddStudent add = new AddStudent();
		//System.out.println(p.toString());
		//System.out.println(p.toString());
		p.addStudent(new Student("Галина", "Коваленко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1346));
		//System.out.println(p.getMe3()[9]);
		//System.out.println(p.getMe3()[0].getGroup());
		p.addStudent(new Student("Аліна", "Іваненко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1347));
		p.addStudent(new Student("Катерина", "Карпенко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1348));
		p.dellStudent(1348L);
		p.addStudent(new Student("Віталій", "Боднар", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1349));
		
		p.addStudent(new Student("Віталій", "Боднар", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1349));
		p.addStudent(new Student("Антон", "Антоненко", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1350));
		p.addStudent(new Student("Богдана", "Мірошніченко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1351));
		p.dellStudent(1349L);
		p.addStudent(new Student("Ігор", "Гармаш", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1352));
		p.addStudent(new Student("Микола", "Задериборода", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1353));
		p.addStudent(new Student("Олександр", "Бортко", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1354));
		p.dellStudent(1352L);
		p.addStudent(new Student("Каріна", "Марко", HumanSex.FEMALE, 31,"МЕ-3", "Економіки і менеджменту", 1355));
		p.addStudent(new Student("Борис", "Тетерук", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1356));
		p.addStudent(new Student("Кіндрат", "Партко", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1357));
		p.addStudent(new Student("Люк", "Скайвокер", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1358));
		p.dellStudent(1345L);
		//System.out.println(p.me3[0]);
		//p.addStudent(add.newSt());
		
		System.out.println(p.searchStudent("Скайвокер"));
		p.addStudent(new Student("Джон", "Котигорошко", HumanSex.MALE, 31,"МЕ-3", "Економіки і менеджменту", 1358));
		
		System.out.println(p.toString());
//		for (int i = 0; i < p.getMe3().length; i ++) {
//			System.out.println(p.getMe3()[i]);
//		}
//		System.out.println();
		p.sortStudentsByLastName();
//		//System.out.println(p.toString());
//		for (int i = 0; i < p.getMe3().length; i ++) {
//			System.out.println(p.getMe3()[i]);
//		}
//		
//		System.out.println(p);
//	
		//p.addStudent(add.newSt());
		
		GroupFileStorage save = new GroupFileStorage();
		save.saveGroupToCSV(p);
		File f1 = new File("Groups");
		File f2= null;
		try {
			f2 = save.findFileByGroupName("МЕ-3", f1);
		} catch (FileNotFoundException e1) {
			System.out.println("Теку не знайдено!");
		}
		
		//File f = new File("Groups/МЕ-3.csv");
		
		try {
			System.out.println(save.loadGroupFromCSV(f2));
		} catch (FileNotFoundException e) {
			System.out.println("Файл не знайдено!");
		}
	
		System.out.println(p.getMe3()[0].hashCode());
		
		System.out.println(p.hashCode());
		System.out.println(p.getMe3()[0].hashCode());
		
		Human h1 = new Human("sdf", "asdf", HumanSex.MALE, 12);
		Human h2 = new Human("sdf", "asdf", HumanSex.MALE, 12);
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
	}

}
