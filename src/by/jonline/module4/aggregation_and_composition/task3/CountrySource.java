package by.jonline.module4.aggregation_and_composition.task3;

public class CountrySource {

	private City[] cities = new City[] { new City("Minas Tirith"), new City("Calembel"), new City("Pelargir"),
			new City("Osgiliath"), new City("Minas Ithil"), new City("Cair Andros") };

	private District[] districts = new District[] { new District("Anorien", cities[0], 39854),
			new District("Lamedon", cities[1], 32787), new District("Anduin's mouth", cities[2], 31823.24),
			new District("Anfalath", cities[3], 27665), new District("Lebennin", cities[4], 30011),
			new District("Belfalath", cities[5], 25674.12) };

	private Region[] regions = new Region[] {
			new Region("South Gondor", new District[] { districts[0], districts[3] }, cities[0]),
			new Region("North Gondor", new District[] { districts[1], districts[4] }, cities[1]),
			new Region("West Gondor", new District[] { districts[2], districts[5], }, cities[2]) };

	public Country getCountry() {
		return new Country("Gondor", cities[0], regions);
	}

}
