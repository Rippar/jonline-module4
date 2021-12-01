package by.jonline.module4.simplest_classes_and_objects.task1;

/*Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте 
метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
*/

public class Test1 {

	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void print() {
		System.out.printf("x = %.3f\ny = %.3f\n", x, y);
	}

	public void sum() {
		System.out.printf("Сумма значений = %.3f\n", x + y);
	}

	public void maxValue() {

		if (x > y) {
			System.out.printf("%.3f больше %.3f\n", x, y);

		} else if (x < y) {

			System.out.printf("%.3f больше %.3f\n", y, x);

		} else {

			System.out.println("Числа равны");
		}
	}

	public static void main(String[] args) {

		Test1 test = new Test1();

		test.setX(3.134);

		test.setY(6.322);

		test.print();

		test.sum();

		test.maxValue();

	}

}
