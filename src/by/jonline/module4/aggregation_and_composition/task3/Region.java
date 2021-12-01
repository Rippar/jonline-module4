package by.jonline.module4.aggregation_and_composition.task3;

public class Region {

	private String regionName;
	private District[] districts;
	private City regionCenter;

	public Region() {
		regionName = "";
		districts = new District[] { new District() };
		regionCenter = new City();
	}

	public Region(String regionName, District[] districts, City regionCenter) {
		this.regionName = regionName;
		this.districts = districts;
		this.regionCenter = regionCenter;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public District[] getDistricts() {
		return districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	public City getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(City regionCenter) {
		this.regionCenter = regionCenter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((regionCenter == null) ? 0 : regionCenter.hashCode());
		result = prime * result + ((regionName == null) ? 0 : regionName.hashCode());

		if (districts != null) {
			for (int i = 0; i < districts.length; i++) {

				if (districts[i] != null) {
					result += prime * result + districts[i].hashCode();

				} else {
					result += prime * result + 0;
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
		Region other = (Region) obj;

		if (this.districts != null && other.districts != null) {
			if (this.districts.length != other.districts.length) {
				return false;
			}

			for (int i = 0; i < districts.length; i++) {
				if (!this.districts[i].equals(other.districts[i])) {
					return false;
				}
			}

		} else if (this.districts == null) {
			if (other.districts != null) {
				return false;

			}

		} else if (other.districts == null) {
			if (this.districts != null) {
				return false;
			}
		}

		if (regionCenter == null) {
			if (other.regionCenter != null)
				return false;
		} else if (!regionCenter.equals(other.regionCenter))
			return false;
		if (regionName == null) {
			if (other.regionName != null)
				return false;
		} else if (!regionName.equals(other.regionName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " regionName=" + regionName + ", districts=" + districts + ", regionCenter="
				+ regionCenter;
	}

}
