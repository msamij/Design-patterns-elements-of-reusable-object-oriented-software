package main.flyweight.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import main.flyweight.Glyph;
import main.flyweight.concreteflyweight.Character;

public class FlyweightFactory {
	private final Map<String, Glyph> flyweightFactory = new HashMap<>();

	public Glyph getFlyweight(char characterCode, String color) {
		String key = characterCode + color;
		if (!flyweightFactory.containsKey(key)) {
			flyweightFactory.put(key, new Character(color, characterCode));
		}
		return flyweightFactory.get(key);
	}
}
