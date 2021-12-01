package by.jonline.module4.simplest_classes_and_objects.task9;

public class Book {

	private static int count;

	private final int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int yearOfPublishing;
	private int pages;
	private double price;
	private String bindingType;

	public Book() {
		id = count++;
		title = "";
		author = "";
		publishingHouse = "";
		bindingType = "";
	}

	public Book(String title, String author, String publishingHouse, int yearOfPublishing, int pages, double price,
			String bindingType) {

		id = count++;

		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.yearOfPublishing = yearOfPublishing;
		this.pages = pages;
		this.price = price;
		this.bindingType = bindingType;

	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " id: " + id + "\ntitle: " + title + "\nauthor: " + author
				+ "\npublishingHouse: " + publishingHouse + "\nyearOfPublishing: " + yearOfPublishing + "\npages: "
				+ pages + "\nprice: " + price + "\nbindingType: " + bindingType + "\n";

	}

	@Override
	public int hashCode() {
		int hash0 = 0;
		int hash1 = 0;
		int hash2 = 0;
		int hash3 = 0;

		if (title != null) {
			hash0 = title.hashCode();
		}

		if (author != null) {
			hash1 = author.hashCode();
		}

		if (publishingHouse != null) {
			hash2 = publishingHouse.hashCode();
		}

		if (bindingType != null) {
			hash3 = bindingType.hashCode();
		}

		return (int) (31 * id + yearOfPublishing + pages + price + hash0 + hash1 + hash2 + hash3);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Book other = (Book) obj;

		if (author == null) {
			if (other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
			return false;
		}

		if (bindingType == null) {
			if (other.bindingType != null) {
				return false;
			}
		} else if (!bindingType.equals(other.bindingType)) {
			return false;
		}

		if (id != other.id) {
			return false;
		}

		if (pages != other.pages) {
			return false;
		}

		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}

		if (publishingHouse == null) {
			if (other.publishingHouse != null) {
				return false;
			}
		} else if (!publishingHouse.equals(other.publishingHouse)) {
			return false;
		}

		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}

		if (yearOfPublishing != other.yearOfPublishing) {
			return false;
		}

		return true;
	}

}
