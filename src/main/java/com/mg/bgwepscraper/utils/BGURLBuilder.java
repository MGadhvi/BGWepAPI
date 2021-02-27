package com.mg.bgwepscraper.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class BGURLBuilder {
	public static Document getURL() throws IOException {
		return Jsoup.connect("https://vedabase.io/en/library/bg/" + BGVerseGenerator.getChapter() + "/1/").get();
	}
}