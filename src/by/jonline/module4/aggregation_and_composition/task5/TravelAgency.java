package by.jonline.module4.aggregation_and_composition.task5;

public class TravelAgency {

	private String name;
	private Tour[] tours;

	public TravelAgency() {
		name = "";
		tours = new Tour[] { new Tour() };
	}

	public TravelAgency(String name, Tour tours[]) {
		this.name = name;
		this.tours = tours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tour[] getTours() {
		return tours;
	}

	public void setTours(Tour[] tours) {
		this.tours = tours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());

		if (tours != null) {
			for (int i = 0; i < tours.length; i++) {
				result = prime * result + (tours[i] == null ? 0 : tours[i].hashCode());
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
		TravelAgency other = (TravelAgency) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		if (this.tours != null && other.tours != null) {
			if (this.tours.length != other.tours.length) {
				return false;
			}

			for (int i = 0; i < this.tours.length; i++) {
				if (this.tours[i] != other.tours[i]) {
					return false;
				}
			}
		}

		if (this.tours == null) {
			if (other.tours != null) {
				return false;
			}
		}

		if (other.tours == null) {
			if (this.tours != null) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(getClass().getSimpleName() + " name=" + name + ", tours:\n");

		for (int i = 0; i < tours.length; i++) {
			result.append(tours[i] + "\n");
		}

		return result.toString();
	}

}
