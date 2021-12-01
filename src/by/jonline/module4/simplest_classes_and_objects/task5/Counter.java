package by.jonline.module4.simplest_classes_and_objects.task5;

public class Counter {

	private int min;
	private int max;
	private int count;

	public Counter() {
		max = 10;
	}

	public Counter(int min, int max, int count) {

		if (min >= max) {

			this.max = min;
			this.min = max;

		} else {

			this.max = max;
			this.min = min;
		}

		this.count = count;

		if (this.count > this.max) {

			this.count = this.max;
		}

		if (this.count < this.min) {

			this.count = this.min;
		}
	}

	public Counter(int min, int max) {

		if (min >= max) {
			this.max = min;
			this.min = max;

		} else {
			this.max = max;
			this.min = min;
		}

		this.count = this.min + (int) (Math.random() * (this.max - this.min));

	}

	public void increment() {

		if (this.count + 1 <= this.max) {
			this.count++;

		} else {
			System.out.println("Значение счетчика достигло максимума");
		}

	}

	public void decrement() {

		if (this.count - 1 >= this.min) {
			this.count--;

		} else {
			System.out.println("Значение счетчика достигло минимума");
		}

	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\nmin: " + min + "\nmax: " + max + "\ncount: " + count + "\n";
	}

	@Override
	public int hashCode() {
		return 31 * min + max + count;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;

		return count == other.count && max == other.max && min == other.min;
	}

}
