package by.jonline.module4.simplest_classes_and_objects.task7;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
вычисления площади, периметра и точки пересечения медиан*/

public class TriangleRunner {

	public static void main(String[] args) {

		Point a = new Point(-2, -3);
		Point b = new Point(5, 6);
		Point c = new Point(2, -2);

		Triangle triangleABC = new Triangle(a, b, c);

		System.out.printf("Периметр: %3.4f\n", triangleABC.getArea());
		System.out.printf("Площадь: %3.4f\n", triangleABC.getPerimeter());

		Point center = triangleABC.getCenter();
		System.out.printf("Координаты точки пересечения медиан: x = %3.4f, y = %3.4f", center.getX(), center.getY());

	}

}
