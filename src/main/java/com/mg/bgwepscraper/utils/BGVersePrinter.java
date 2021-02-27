package com.mg.bgwepscraper.utils;

import org.jsoup.nodes.Document;

import java.io.IOException;

public class BGVersePrinter {
	public static void getBGVerse() throws IOException {
		Document document = BGURLBuilder.getURL();
		BGWebScraper.getTextNumber(document);
		BGWebScraper.getVerse(document);
	}
}
