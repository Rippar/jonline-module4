package by.jonline.module4.simplest_classes_and_objects.task6;

/*��������� �������� ������ ��� ������������� �������. ������������� ����������� ��������� ������� � ��������� 
��� ��������� ����� (���, ������, �������) � ��������� ������������ �������� ��������. � ������ ������������
�������� ����� ���� ��������������� � �������� 0. ������� ������ ��������� ������� �� �������� ���������� �����, 
����� � ������.*/

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
