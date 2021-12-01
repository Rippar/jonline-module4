package by.jonline.module4.aggregation_and_composition.task1.bean;

public class Text {

	private Sentence headline;
	private Sentence body;

	public Text() {
		headline = new Sentence();
		body = new Sentence();
	}

	public Text(Word headline) {
		this.headline = new Sentence(headline);
		body = new Sentence();
	}

	public Text(Sentence headline) {
		this.headline = headline;
		body = new Sentence();
	}

	public Text(Sentence headline, Sentence body) {
		this.headline = headline;
		this.body = body;
	}

	public Sentence getHeadline() {
		return headline;
	}

	public void setHeadline(Sentence headline) {
		this.headline = headline;
	}

	public Sentence getBody() {
		return body;
	}

	public void setBody(Sentence body) {
		this.body = body;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((headline == null) ? 0 : headline.hashCode());
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
		Text other = (Text) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (headline == null) {
			if (other.headline != null)
				return false;
		} else if (!headline.equals(other.headline))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\n headline: " + headline + "\n body: " + body;

	}

}
