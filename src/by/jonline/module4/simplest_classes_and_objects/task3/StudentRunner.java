package by.jonline.module4.simplest_classes_and_objects.task3;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость 
(массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность 
вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class StudentRunner {
	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.getStudents();

		action.getBestPerformedStudents(StudentConstants.MIN_GRADE);

	}

}
