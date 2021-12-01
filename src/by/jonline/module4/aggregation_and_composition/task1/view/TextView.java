package by.jonline.module4.aggregation_and_composition.task1.view;

import by.jonline.module4.aggregation_and_composition.task1.bean.Text;

public class TextView {

	private SentenceView view = new SentenceView();

	public void printText(Text text) {
		view.printSentence(text.getHeadline());
		view.printSentence(text.getBody());
	}

	public void printHeadline(Text text) {
		view.printSentence(text.getHeadline());
	}

	public void printBody(Text text) {
		view.printSentence(text.getBody());
	}

}
