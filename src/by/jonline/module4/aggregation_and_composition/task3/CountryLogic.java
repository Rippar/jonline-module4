package by.jonline.module4.aggregation_and_composition.task3;

public class CountryLogic {

	public Country getCountryFromSource() {
		CountrySource source = new CountrySource();
		return source.getCountry();
	}

	public City getCapital(Country country) {
		return country.getCapital();
	}

	public Region[] getRegions(Country country) {
		return country.getRegions();
	}

	public int getNumOfRegions(Country country) {
		return country.getRegions().length;
	}

	public double getSquare(Country country) {
		Region[] regions = country.getRegions();
		double sum = 0.0;

		for (int i = 0; i < regions.length; i++) {
			District[] districts = regions[i].getDistricts();

			for (int j = 0; j < districts.length; j++) {
				sum += districts[j].getSquare();
			}
		}

		return sum;
	}

	public City[] getRegionsCenter(Country country) {
		Region[] regions = country.getRegions();
		City[] regionCenters = new City[regions.length];

		for (int i = 0; i < regions.length; i++) {
			regionCenters[i] = regions[i].getRegionCenter();
		}

		return regionCenters;

	}

	public District[] getDistricts(Country country) {

		Region[] regions = country.getRegions();
		int count = 0;
		int k = 0;
		for (int i = 0; i < regions.length; i++) {
			count += regions[i].getDistricts().length;
		}

		District[] districts = new District[count];

		for (int i = 0; i < regions.length; i++) {
			District[] tmp = regions[i].getDistricts();

			for (int j = 0; j < tmp.length; j++) {
				districts[k++] = tmp[j];
			}

		}

		return districts;

	}

}
