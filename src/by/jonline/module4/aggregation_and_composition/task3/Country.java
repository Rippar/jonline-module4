package by.jonline.module4.aggregation_and_composition.task3;


public class Country {

	private String countryName;
	private City capital;
	private Region[] regions;

	public Country() {
		countryName = "";
		capital = new City();
		regions = new Region[] { new Region() };
	}

	public Country(String countryName, City capital, Region[] regions) {

		this.countryName = countryName;
		this.capital = capital;
		this.regions = regions;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());

		if (regions != null) {
			for (int i = 0; i < regions.length; i++) {

				if (regions[i] != null) {
					result = prime * result + regions[i].hashCode();
				} else {
					result = prime * result + 0;
				}
			}
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;

		if (this.regions != null && other.regions != null) {

			if (this.regions.length != other.regions.length) {
				return false;
			}

			for (int i = 0; i < regions.length; i++) {
				if (!this.regions[i].equals(other.regions[i])) {
					return false;
				}
			}
		} else if (this.regions == null) {
			if (other.regions != null) {
				return false;
			}
		} else if (other.regions == null) {
			if (this.regions != null) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " countryName=" + countryName + ", capital=" + capital + ", regions="
				+ regions;
	}

}
