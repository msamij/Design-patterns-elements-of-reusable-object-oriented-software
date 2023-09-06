package builderpattern.main.director;

import builderpattern.main.builder.TextConverter;

/** Constructs an object using the Builder interface. */
public class RtfReader {
	private TextConverter textConverter;

	public RtfReader(TextConverter textConverter) {
		this.textConverter = textConverter;
	}

	public void parseRtf() {
		textConverter.convertCharacter('0');
		textConverter.convertFontChange(null);
		textConverter.convertParagraph(null);
	}

	public TextConverter getBuilder() {
		return this.textConverter;
	}
}
