package by.jonline.module4.aggregation_and_composition.task1.main;

import by.jonline.module4.aggregation_and_composition.task1.bean.Sentence;
import by.jonline.module4.aggregation_and_composition.task1.bean.Text;
import by.jonline.module4.aggregation_and_composition.task1.bean.Word;
import by.jonline.module4.aggregation_and_composition.task1.constant.*;


/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, 
вывести на консоль текст, заголовок текста.*/

public class TextRunner {

	public static void main(String[] args) {

		Word headline = new Word("Java");

		Word[] words = new Word[] { new Word("Hello"), WordConstant.EXCLAMATION_MARK, WordConstant.SPACE,
				new Word("Java"), WordConstant.SPACE, new Word("runs"), WordConstant.SPACE, new Word("on"),
				WordConstant.SPACE };

		Text text = new Text(new Sentence(headline), new Sentence(words));

		UserActionController action = new UserActionController();

		action.addToText(new Word("3"), text);
		action.addToText(WordConstant.SPACE, text);
		action.addToText(new Word("billion"), text);
		action.addToText(WordConstant.SPACE, text);
		action.addToText(new Word("devices"), text);
		action.addToText(WordConstant.EXCLAMATION_MARK, text);

		action.printText(text);

	}

}
