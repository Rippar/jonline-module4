package by.jonline.module4.aggregation_and_composition.task5;

public class Tour {

	private String typeOfTour;
	private String country;
	private String transport;
	private boolean allInclusive;
	private int numOfDays;
	private double price;

	public Tour() {
		typeOfTour = "";
		country = "";
		transport = "";
	}

	public Tour(String typeOfTour, String country, String transport, boolean allInclusive, int numOfDays, double price) {

		this.typeOfTour= typeOfTour;
		this.country = country;
		this.transport = transport;
		this.allInclusive = allInclusive;
		this.numOfDays = numOfDays;
		this.price = price;
	}

	public String getTypeOfTour() {
		return typeOfTour;
	}

	public void setTypeOfTour(String typeOfTour) {
		this.typeOfTour = typeOfTour;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public boolean isAllInclusive() {
		return allInclusive;
	}

	public void setAllInclusive(boolean allInclusive) {
		this.allInclusive = allInclusive;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (allInclusive ? 1231 : 1237);
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + numOfDays;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((typeOfTour == null) ? 0 : typeOfTour.hashCode());
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
		Tour other = (Tour) obj;
		if (allInclusive != other.allInclusive)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (numOfDays != other.numOfDays)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
			return false;
		if (typeOfTour == null) {
			if (other.typeOfTour != null)
				return false;
		} else if (!typeOfTour.equals(other.typeOfTour))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " typeOfTour=" + typeOfTour + ", country=" + country + ", transport="
				+ transport + ", allInclusive=" + allInclusive + ", numOfDays=" + numOfDays + ", price=" + price;
	}

}
