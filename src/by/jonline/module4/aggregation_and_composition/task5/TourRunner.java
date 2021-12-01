package by.jonline.module4.aggregation_and_composition.task5;

public class TourRunner {
	
	/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
	различного типа (отдых, экскурсии, лечение, шопинг, круиз и т.д) для оптимального выбора. Учитывать 
	возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.getTours();
		action.getToursSortedByDays();
		action.getToursSortedByPrice();

		action.getToursByParam("Самолет", true, 16, 1000, 1600);
		
		action.getToursByParam("Самолет", true, 12, 100, 250);

	}

}
