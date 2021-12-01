package by.jonline.module4.aggregation_and_composition.task3;

public class CountryView {

	public void printCountryName(Country country) {
		System.out.println("Страна: " + country.getCountryName() + "\n");

	}

	public void printCapitalName(Country country) {
		System.out.println("Столица:  " + country.getCapital().getCityName() + "\n");
	}

	public void printRegionsName(Country country) {
		Region[] regions = country.getRegions();
		System.out.println("Наименование областей: ");

		for (int i = 0; i < regions.length; i++) {
			System.out.println(regions[i].getRegionName());
		}
		System.out.println();
	}

	public void printDistrictsName(Country country) {
		Region[] regions = country.getRegions();

		System.out.println("Наименование районов: ");

		for (int i = 0; i < regions.length; i++) {
			District[] districts = regions[i].getDistricts();

			for (int j = 0; j < districts.length; j++) {
				System.out.println(districts[j].getDistrictName());
			}
		}
		System.out.println();
	}

	public void printRegionsCenterName(Country country) {
		Region[] regions = country.getRegions();

		System.out.println("Наименование областных центров: ");

		for (int i = 0; i < regions.length; i++) {
			City center = regions[i].getRegionCenter();
			System.out.println(center.getCityName());
		}

		System.out.println();
	}

	public void printOtherInfo(String s) {
		System.out.println(s + "\n");
	}

}
