package by.jonline.module4.simplest_classes_and_objects.task3;

public class UserActionController {

	private StudentLogic logic = new StudentLogic();
	private StudentView view = new StudentView();

	public void getBestPerformedStudents(int minGrade) {
		Student[] students = logic.getStudentsFromSource();
		Student[] bestStudents = logic.findStudentsByMinGrade(minGrade, students);
		if (bestStudents.length != 0) {
			
		    for (int i = 0; i < bestStudents.length; i++) {
		     	view.printNotification("Найден студент с оценками не ниже " + minGrade+" баллов:");
		    	view.printStudent(bestStudents[i]);
			}
		} else {
			view.printNotification("Cтудент с оценками не ниже " + minGrade+ " баллов не найден");
		    	
		    
		}
		   
		
	}

	public void getStudents() {
		Student[] students = logic.getStudentsFromSource();
		for (int i = 0; i < students.length; i++) {
			view.printStudent(students[i]);
		}

	}

}
