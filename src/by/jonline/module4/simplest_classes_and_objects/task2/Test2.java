package by.jonline.module4.simplest_classes_and_objects.task2;

/*Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте 
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.*/

public class Test2 {

	private double x;
	private double y;

	public Test2(double x, double y) {
		
		this.x = x;
		this.y = y;
	}

	public Test2() {}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void print() {
		System.out.printf("x = %.3f\ny = %.3f\n", x, y);
	}

	public static void main(String[] args) {

		Test2 test = new Test2(3.633, 6.366);

		test.setX(2.211);

		test.print();

	}

}
