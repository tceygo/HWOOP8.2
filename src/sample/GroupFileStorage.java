package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class GroupFileStorage {

	public void saveGroupToCSV(Group gr) {

		File directory = new File("Groups");
		if (!directory.exists()) {
			directory.mkdirs();
		}

		String nameFile = null;
		for (int i = 0; i < gr.getMe3().length; i++) {
			if (gr.getMe3()[i] != null) {
				nameFile = gr.getName();
				// System.out.println(nameFile);
				break;
			}
		}

		if (nameFile != null) {

			File group = new File("Groups/" + nameFile + ".csv");

			try (PrintWriter pw = new PrintWriter(group)) {

				for (int i = 0; i < gr.getMe3().length; i++) {

					pw.println(gr.getMe3()[i].toCSVString());

				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("В групі немає жодного студента");
		}

	}

	public Group loadGroupFromCSV(File file) throws FileNotFoundException {
		String[] studentsStr = getStudents(file);
		String nameG = (file.getName().replaceFirst(".csv", ""));
		Student s = new Student();
		Student[] fromCVV = new Student[10];
		for (int i = 0; i < studentsStr.length; i++) {
			fromCVV[i] = s.fromCSVString(studentsStr[i]);
		}

		Group group = new Group(fromCVV, nameG);
		return group;

	}

	public File findFileByGroupName(String groupName, File workFolder) throws FileNotFoundException {
		File f = null;
		String[] files = workFolder.list();
		if (files != null) {
			System.out.println(Arrays.toString(files));
			for (int i = 0; i < files.length; i++) {
				if ((groupName + ".csv").equals(files[i])) {
					f = new File(workFolder + "/" + files[i]);
					System.out.println(f);
				}
			}
		}

		return f;

	}

	private String[] getStudents(File file) throws FileNotFoundException {
		String result = "";
		String[] Student = null;
		try (Scanner sc = new Scanner(file)) {

			for (; sc.hasNextLine();) {
				result += sc.nextLine() + System.lineSeparator();
			}

			Student = result.split(System.lineSeparator());
			// System.out.println(Arrays.toString(Student));

		}

		return Student;
	}

}
