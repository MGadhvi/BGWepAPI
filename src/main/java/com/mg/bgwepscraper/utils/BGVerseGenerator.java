package com.mg.bgwepscraper.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class BGVerseGenerator {

	private final ArrayList<String> multipleVerses = new ArrayList<>();
	private final HashMap<Integer, Integer> versesPerChapter = new HashMap<>();

	{
		multipleVerses.add("1/16-18/");
		multipleVerses.add("1/21-22/");
		multipleVerses.add("1/32-35/");
		multipleVerses.add("1/37-38/");
		multipleVerses.add("2/42-43/");
		multipleVerses.add("5/8-9/");
		multipleVerses.add("5/27-28/");
		multipleVerses.add("6/11-12/");
		multipleVerses.add("6/13-14/");
		multipleVerses.add("6/20-23/");
		multipleVerses.add("10/12-13/");
		multipleVerses.add("11/10-13/");
		multipleVerses.add("11/26-27/");
		multipleVerses.add("11/41-42/");
		multipleVerses.add("12/3-4/");
		multipleVerses.add("12/6-7/");
		multipleVerses.add("12/13-14/");
		multipleVerses.add("12/18-19/");
		multipleVerses.add("13/8-12/");
		multipleVerses.add("14/22-25/");
		multipleVerses.add("16/1-3/");
		multipleVerses.add("16/11-12/");
		multipleVerses.add("17/5-6/");
		multipleVerses.add("17/26-27/");
		multipleVerses.add("17/26-27/");
		multipleVerses.add("18/51-53/");

		versesPerChapter.put(1,46);
		versesPerChapter.put(2,72);
		versesPerChapter.put(3,43);
		versesPerChapter.put(4,42);
		versesPerChapter.put(5,29);
		versesPerChapter.put(6,47);
		versesPerChapter.put(7,30);
		versesPerChapter.put(8,28);
		versesPerChapter.put(9,34);
		versesPerChapter.put(10,42);
		versesPerChapter.put(11,55);
		versesPerChapter.put(12,20);
		versesPerChapter.put(13,35);
		versesPerChapter.put(14,27);
		versesPerChapter.put(15,20);
		versesPerChapter.put(16,24);
		versesPerChapter.put(17,28);
		versesPerChapter.put(18,78);
	}

	public static String getChapter() {
		Random random = new Random();
		int chapter = random.nextInt(18) + 1;
		return Integer.toString(chapter);
	}

	//TODO: To be implemented
	public static String getVerse() {
		return "";
	}

}
