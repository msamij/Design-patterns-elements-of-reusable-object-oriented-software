package builderpattern.main.concretebuilder;

import builderpattern.main.builder.TextConverter;

/**
 * Constructs and assembles parts of the product by implementing the Builder
 * interface.
 * <p/>
 * Defines and keeps track of the representation it creates.
 * <p/>
 * Provides an interface for retrieving the product (e.g., GetASCIIText, GetText
 * Widget).
 */
public class TextWidgetConverter implements TextConverter {
	@Override
	public TextConverter convertCharacter(char character) {
		return new TextWidgetConverter();
	}

	@Override
	public TextConverter convertFontChange(String fontName) {
		return new TextWidgetConverter();
	}

	@Override
	public TextConverter convertParagraph(char[] paragraph) {
		return new TextWidgetConverter();
	}
}
