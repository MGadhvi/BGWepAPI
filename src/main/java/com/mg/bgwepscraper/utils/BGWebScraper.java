package com.mg.bgwepscraper.utils;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class BGWebScraper {
	public static void getVerse(Document document) {
		Elements translation = document.getElementsByClass("r r-lang-en r-translation");
		List<String> text = translation.eachText();
		System.out.println(text.get(0));
	}

	public static void getTextNumber(Document document) {
		Elements textNumber = document.getElementsByClass("r r-title r-verse");
		List<String> verse = textNumber.eachText();
		System.out.println(verse.get(0));
	}
}