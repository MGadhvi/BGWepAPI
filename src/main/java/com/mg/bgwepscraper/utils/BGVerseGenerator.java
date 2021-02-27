package com.mg.bgwepscraper.utils;

import java.util.Random;

public class BGVerseGenerator {

	public static String getChapter() {
		Random random = new Random();
		int chapter =  random.nextInt(18) + 1;
		return Integer.toString(chapter);
	}
}
