package by.jonline.module4.aggregation_and_composition.task1.logic;

import by.jonline.module4.aggregation_and_composition.task1.bean.Sentence;
import by.jonline.module4.aggregation_and_composition.task1.bean.Text;
import by.jonline.module4.aggregation_and_composition.task1.bean.Word;

public class TextLogic {
	private SentenceLogic logic = new SentenceLogic();

	public void addSentenceToText(Sentence sentence, Text text) {
		logic.addSentenceToSentence(sentence, text.getBody());
	}

	public void addWordToText(Word word, Text text) {
		logic.addWordToSentence(word, text.getBody());
	}

}
