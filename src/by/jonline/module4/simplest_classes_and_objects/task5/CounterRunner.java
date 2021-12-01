package by.jonline.module4.simplest_classes_and_objects.task5;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными 
значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод, позволяющий получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.*/

public class CounterRunner {

	public static void main(String[] args) {

		Counter c1 = new Counter(0, 100);
		Counter c2 = new Counter(0, 100, 99);

		System.out.println(c1);
		c1.increment();
		System.out.println(c1);

		System.out.println(c2);

		for (int i = 100; i > 1; i--) {
			c2.decrement();
		}
		System.out.println(c2);

		c2.decrement();
		System.out.println("Текущее состояние счетчика: " + c2.getCount());

	}

}
