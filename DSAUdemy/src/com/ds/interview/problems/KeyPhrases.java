package com.ds.interview.problems;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyPhrases {

	public static void main(String[] args) {
		String text = "Suppose we have a set of English text documents and wish to rank which document is most relevant to the query, the brown cow . A simple way to start out is by eliminating documents that do not contain all three words the brown , and cow , but this still leaves many documents .";
		ArrayList<String> wordsToExclude = new ArrayList<>();
		wordsToExclude.add("the");
		wordsToExclude.add("a");
		wordsToExclude.add("by");
		wordsToExclude.add("to");
		wordsToExclude.add("and");
		wordsToExclude.add("of");
		wordsToExclude.add(",");
		wordsToExclude.add(".");
		wordsToExclude.add("is");

		HashMap<String, Integer> wordFreq = new HashMap<>();
		int maxFrequency = 0;
		System.out.println(text);
		String[] textSplit = text.split(" ");
		for (String word : textSplit) {
			if (wordsToExclude.contains(word) || word.trim().length() == 0) {
				continue;
			}

			String key = word.trim().toLowerCase();
			if (wordFreq.get(key) == null) {
				wordFreq.put(key, 1);
			} else {
				int frequency = wordFreq.get(key) + 1;
				wordFreq.put(key, frequency);
			}

			if (wordFreq.get(key) > maxFrequency) {
				maxFrequency = wordFreq.get(key);
			}
		}

		for (String key : wordFreq.keySet()) {
			if (wordFreq.get(key) == maxFrequency)
				System.out.println(key + ": " + wordFreq.get(key));
		}
	}
}