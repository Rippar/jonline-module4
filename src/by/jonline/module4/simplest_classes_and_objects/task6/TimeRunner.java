package by.jonline.module4.simplest_classes_and_objects.task6;

/*Составьте описание класса для представления времени. Предусмотрите возможности установки времени и изменения 
его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых
значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, 
минут и секунд.*/

public class TimeRunner {
	public static void main(String[] args) {

		Time time1 = new Time(18, 50, 59);
		System.out.println(time1 + "\n");

		time1.changeHour(-19);
		System.out.println(time1 + "\n");

		time1.changeMinute(60);
		System.out.println(time1 + "\n");

		time1.changeMinute(-55);
		System.out.println(time1 + "\n");

		time1.changeMinute(-5);
		System.out.println(time1 + "\n");

		time1.changeHour(2);
		System.out.println(time1 + "\n");

		time1.changeSecond(36);
		System.out.println(time1 + "\n");

		time1.changeSecond(25);
		System.out.println(time1 + "\n");

	}

}
