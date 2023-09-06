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
public class AsciiConverter implements TextConverter {
	@Override
	public TextConverter convertCharacter(char character) {
		AsciiConverter asciiConverter = new AsciiConverter();
		asciiConverter.getAsciiText(character);
		return asciiConverter;
	}

	@Override
	public TextConverter convertFontChange(String fontName) {
		return new AsciiConverter();
	}

	@Override
	public TextConverter convertParagraph(char[] paragraph) {
		return new AsciiConverter();
	}

	private String getAsciiText(char character) {
		return Character.toString(character);
	}
}
