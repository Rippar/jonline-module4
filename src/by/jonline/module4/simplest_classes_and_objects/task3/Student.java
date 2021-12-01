package by.jonline.module4.simplest_classes_and_objects.task3;

public class Student {

	private String surname;
	private String initials;
	private int numOfGroup;
	private final int[] examGrades;

	public Student() {
		surname = "";
		initials = "";
		this.examGrades = new int[StudentConstants.NUM_OF_EXAMS];
	}

	public Student(String surname, String initials, int numOfGroup) {

		this.surname = surname;
		this.initials = initials;
		this.numOfGroup = numOfGroup;
		this.examGrades = new int[StudentConstants.NUM_OF_EXAMS];

	}

	public Student(String surname, String initials, int numOfGroup, int[] examGrades) {

		this.surname = surname;
		this.initials = initials;
		this.numOfGroup = numOfGroup;
		this.examGrades = examGrades;

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getNumOfGroup() {
		return numOfGroup;
	}

	public void setNumOfGroup(int numOfGroup) {
		this.numOfGroup = numOfGroup;
	}

	public int[] getExamGrades() {
		return examGrades;
	}

	public void setExamGrades(int grade, int position) {

		this.examGrades[position] = grade;

	}


	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(
				" surname: " + surname + " initials: " + initials + " numOfGroup: " + numOfGroup + " examGrades: ");

		for (int i = 0; i < examGrades.length; i++) {
			result.append(examGrades[i] + " ");
		}

		return getClass().getSimpleName() + result.toString();

	}

	@Override
	public int hashCode() {

		int hash0 = 0;
		int hash1 = 0;
		int hash2 = 0;

		if (surname != null) {
			hash0 = surname.hashCode();
		}

		if (initials != null) {
			hash1 = initials.hashCode();
		}

		for (int i = 0; i < examGrades.length; i++) {
			hash2 += examGrades[i];
		}

		return (int) (31 * numOfGroup + hash0 + hash1 + hash2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;

		if (surname == null) {

			if (other.surname != null) {
				return false;
			}

		} else if (!surname.equals(other.surname)) {
			return false;
		}

		if (initials == null) {

			if (other.initials != null) {
				return false;
			}

		} else if (!initials.equals(other.initials)) {
			return false;
		}

		if (numOfGroup != other.numOfGroup) {
			return false;
		}

		for (int i = 0; i < 5; i++) {
			if (examGrades[i] != other.examGrades[i]) {
				return false;
			}
		}

		return true;

	}

}