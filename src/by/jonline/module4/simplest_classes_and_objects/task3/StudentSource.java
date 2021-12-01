package by.jonline.module4.simplest_classes_and_objects.task3;

public class StudentSource {

	private static StudentSource instance;
	private static int id = 0;
	private static Student[] students;

	private StudentSource() {
		students = new Student[StudentConstants.NUM_OF_STUDENTS];

		for (int i = 0; i < StudentConstants.NUM_OF_STUDENTS; i++) {
			String surname = "Default";
			String initials = "D" + id++;
			int numOfGroup = (int) (100 + Math.random() * 10);
			int[] examGrades = new int[StudentConstants.NUM_OF_EXAMS];

			for (int j = 0; j < StudentConstants.NUM_OF_EXAMS; j++) {
				// допустим, что студент учится хорошо
				examGrades[j] = (int) (8 + Math.random() * 3);
			}

			students[i] = new Student(surname, initials, numOfGroup, examGrades);
		}

	}

	public Student[] getStudents() {
		return students;
	}

	public static StudentSource getInstance() {

		if (instance == null) {
			instance = new StudentSource();
			return instance;

		} else {
			return instance;
		}
	}
}
