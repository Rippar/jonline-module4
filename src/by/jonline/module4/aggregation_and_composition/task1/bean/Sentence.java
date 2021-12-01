package by.jonline.module4.aggregation_and_composition.task1.bean;

public class Sentence {

	private Word[] words;

	public Sentence() {
		words = new Word[] { new Word() };
	}

	public Sentence(Word word) {
		words = new Word[] { word };
	}

	public Sentence(Word[] words) {
		this.words = words;

	}

	public Word[] getSentence() {
		return words;
	}

	public void setSentence(Word[] words) {
		this.words = words;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		if (words != null) {

			for (Word word : words) {
				if (word != null) {
					result = result * prime + word.hashCode();
				} else {
					result = result * prime + 0;
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
		Sentence other = (Sentence) obj;

		if (this.words != null && other.words != null) {
			if (words.length != other.words.length) {
				return false;
			}

			for (int i = 0; i < words.length; i++) {
				if (!words[i].equals(other.words[i])) {
					return false;
				}
			}
		} else if (this.words == null) {
			if (other.words != null) {
				return false;
			}

		} else if (other.words == null) {
			if (this.words != null) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			result.append(words[i]);
		}

		return getClass().getSimpleName() + result.toString();
	}

}
