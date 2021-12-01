package by.jonline.module4.simplest_classes_and_objects.task3;

public class StudentLogic {

	public Student[] getStudentsFromSource() {
		StudentSource creator = StudentSource.getInstance();
		Student[] students = creator.getStudents();

		return students;

	}

	public Student[] findStudentsByMinGrade(int minGrade, Student[] students) {
		Student[] bestStudents;
		int counter = 0;
		int k=0;
		
		for (int i = 0; i < students.length; i++) {
			if (hasMinGrade(minGrade, students[i])) {
				counter++;
			}
		}
		
		bestStudents = new Student[counter];
		
		for (int i = 0; i < students.length; i++) {
			if (hasMinGrade(minGrade, students[i])) {
				bestStudents[k++] = students[i];
			}
		}
		
		return bestStudents;

	}

	private boolean hasMinGrade(int minGrade, Student student) {
		int[] examGrades = student.getExamGrades();

		boolean tmp = true;

		for (int i = 0; i < examGrades.length; i++) {

			if (examGrades[i] < minGrade) {

				tmp = false;
				break;
			}
		}

		return tmp;

	}
}
