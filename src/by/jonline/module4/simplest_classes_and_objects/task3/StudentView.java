package by.jonline.module4.simplest_classes_and_objects.task3;

public class StudentView {
	public void printStudent(Student student) {

		StringBuilder result = new StringBuilder("Фамилия и инициалы студента: " + student.getSurname() + " "
				+ student.getInitials() + "\nНомер группы: " + student.getNumOfGroup() + "\nОценки за экзамен: ");

		int[] examGrades = student.getExamGrades();

		for (int i = 0; i < examGrades.length; i++) {
			result.append(examGrades[i] + " ");
		}
		result.append("\n");

		System.out.println(result);
	}

	public void printNotification(String notification) {
		System.out.println(notification);
	}

}
