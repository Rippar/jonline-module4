package by.jonline.module4.aggregation_and_composition.task1.main;

import by.jonline.module4.aggregation_and_composition.task1.bean.Sentence;
import by.jonline.module4.aggregation_and_composition.task1.bean.Text;
import by.jonline.module4.aggregation_and_composition.task1.bean.Word;
import by.jonline.module4.aggregation_and_composition.task1.logic.TextLogic;
import by.jonline.module4.aggregation_and_composition.task1.view.TextView;

public class UserActionController {

	private TextLogic logic = new TextLogic();
	private TextView view = new TextView();

	public void addToText(Word word, Text text) {
		logic.addWordToText(word, text);
	}

	public void addToText(Sentence sentence, Text text) {
		logic.addSentenceToText(sentence, text);
	}

	public void setUpHeadline(Sentence sentence, Text text) {
		text.setHeadline(sentence);
	}

	public void printText(Text text) {
		view.printText(text);
	}

}
