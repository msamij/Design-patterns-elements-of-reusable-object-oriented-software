package builderpattern.main.builder;

/** Specifies an abstract interface for creating parts of a Product object. */
public interface TextConverter {
	public TextConverter convertCharacter(char character);

	public TextConverter convertFontChange(String fontName);

	public TextConverter convertParagraph(char[] paragraph);
}
