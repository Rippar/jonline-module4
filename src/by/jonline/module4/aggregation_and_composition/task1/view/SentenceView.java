package by.jonline.module4.aggregation_and_composition.task1.view;

import by.jonline.module4.aggregation_and_composition.task1.bean.Sentence;
import by.jonline.module4.aggregation_and_composition.task1.bean.Word;

public class SentenceView {

	public void printSentence(Sentence sentence) {
		StringBuilder result = new StringBuilder();

		for (Word word : sentence.getSentence()) {
			result.append(word.getWord());
		}

		System.out.println(result);
	}

}
