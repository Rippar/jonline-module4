package by.jonline.module4.aggregation_and_composition.task1.logic;

import by.jonline.module4.aggregation_and_composition.task1.bean.Sentence;
import by.jonline.module4.aggregation_and_composition.task1.bean.Word;

public class SentenceLogic {

	public void addWordToSentence(Word word, Sentence sentence) {

		Word[] oldSentence = sentence.getSentence();
		int length = oldSentence.length;
		Word[] newSentence = new Word[length + 1];

		for (int i = 0; i < length; i++) {
			newSentence[i] = oldSentence[i];
		}

		newSentence[length] = word;

		sentence.setSentence(newSentence);

	}

	public void addSentenceToSentence(Sentence addThatSentence, Sentence addToSentence) {

		Word[] oldSentence = addToSentence.getSentence();
		int oldLength = oldSentence.length;
		int newLength = oldLength + addThatSentence.getSentence().length;
		Word[] newSentence = new Word[newLength];
		int k = 0;

		for (int i = 0; i < oldLength; i++) {
			newSentence[i] = oldSentence[i];
		}

		for (int i = oldLength; i < newLength; i++) {
			newSentence[i] = addThatSentence.getSentence()[k++];
		}

		addToSentence.setSentence(newSentence);

	}

}
