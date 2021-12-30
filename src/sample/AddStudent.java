package sample;


import javax.swing.JOptionPane;

public class AddStudent {

	private Student news = new Student();

	public AddStudent() {
		super();
	}

	public AddStudent(Student news) {
		super();
		this.news = news;
	}

	public Student newSt() {

		news.setName(getName());
		news.setLastName(getLName());
		news.setSex(getSex());
		news.setAge(getAge());
		news.setFaculty(getFaculty());
		news.setId(getId());
		news.setGroup(getGroup());

		return news;
	}
	


	private String getName() {

		for (;;) {
			try {
				String name;
				name = String.valueOf(JOptionPane.showInputDialog("Введіть ім'я"));
				if (name.equals("")) {
					throw new EmptyExeption();
				}

				return name;
			} catch (EmptyExeption e) {
				JOptionPane.showMessageDialog(null, "Поле має бути заповнене");
			}
		}
	}

	private String getLName() {

		for (;;) {
			try {
				String lName;
				lName = String.valueOf(JOptionPane.showInputDialog("Введіть прізвище"));
				if (lName.equals("")) {
					throw new EmptyExeption();
				}
				return lName;

			} catch (EmptyExeption e) {
				JOptionPane.showMessageDialog(null, "Поле має бути заповнене");
			}
		}

	}

	private HumanSex getSex() {

		for (;;) {
			try {
				HumanSex setSex;
				String getSex;
				getSex = String.valueOf(JOptionPane.showInputDialog(null, "Введіть стать: Male або Female","Виберіть", JOptionPane.QUESTION_MESSAGE, null, HumanSex.values(), HumanSex.FEMALE));
				setSex = HumanSex.valueOf(getSex.toUpperCase());

				return setSex;
			} catch (IllegalArgumentException e) {
				return null;
			}
		}

	}

	private int getAge() {
		int age;
		for (;;) {
			
			try {
				
				age = Integer.valueOf(JOptionPane.showInputDialog("Введіть кількість повних років цифрами"));
				System.out.println(age);
				if (age < 0) {
					throw new NegativValueExeption();
				}

				return age;
			} catch (NullPointerException e) {
				age =0;
				return age;
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Потрбноввести число наприклад: 25");
			} catch (NegativValueExeption e) {
				JOptionPane.showMessageDialog(null, "Вік не може бути негативним числом");
			}
		}

	}

	private String getFaculty() {

		for (;;) {
			try {
				String faculty;
				faculty = String.valueOf(JOptionPane.showInputDialog("Введіть Факультет"));
				if (faculty.equals("")) {
					throw new EmptyExeption();
				}
				return faculty;

			} catch (EmptyExeption e) {
				JOptionPane.showMessageDialog(null, "Поле має бути заповнене");
			}
		}

	}

	private long getId() {

		for (;;) {
			try {
				long id;
				id = Long.valueOf(JOptionPane.showInputDialog("Введіть номер залікової"));
				if (id <= 0) {
					throw new NegativValueExeption();
				}
				return id;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Потрбно ввести число");
			} catch (NegativValueExeption e) {
				JOptionPane.showMessageDialog(null, "Номер залікової не може бути негативним числом");
			}
		}
	}

	private String getGroup() {

		for (;;) {
			try {
				String Group;
				Group = String.valueOf(JOptionPane.showInputDialog("Введіть групу"));
				if (Group.equals("")) {
					throw new EmptyExeption();
				}
				return Group;

			} catch (EmptyExeption e) {
				JOptionPane.showMessageDialog(null, "Поле має бути заповнене");
			}
		}

	}

}
