package by.jonline.module4.aggregation_and_composition.task3;

public class UserActionController {

	private CountryLogic logic = new CountryLogic();
	private CountryView view = new CountryView();

	public void getCountryName() {
		Country country = logic.getCountryFromSource();
		view.printCountryName(country);
	}

	public void getCapital() {
		Country country = logic.getCountryFromSource();
		view.printCapitalName(country);
	}

	public void getNumOfRegions() {
		Country country = logic.getCountryFromSource();
		view.printOtherInfo("Количество областей: " + logic.getNumOfRegions(country));
	}

	public void getSquare() {
		Country country = logic.getCountryFromSource();
		view.printOtherInfo("Площадь: " + logic.getSquare(country));
	}

	public void getRegionsCenter() {
		Country country = logic.getCountryFromSource();
		view.printRegionsCenterName(country);
	}

	public void getRegionsName() {
		Country country = logic.getCountryFromSource();
		view.printRegionsName(country);
	}

	public void getDistrictsName() {
		Country country = logic.getCountryFromSource();
		view.printDistrictsName(country);
	}

}
