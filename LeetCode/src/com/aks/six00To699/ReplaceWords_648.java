package com.aks.six00To699;

import java.util.Arrays;
import java.util.List;

public class ReplaceWords_648 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat", "bat", "rat");
		String sentence = "the cattle was rattled by the battery";
		System.out.println(replaceWords(list, sentence));
	}

	public static String replaceWords(List<String> dictionary, String sentence) {

		String[] arr = sentence.split(" ");
		for (int i = 0; i < dictionary.size(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].startsWith(dictionary.get(i))) {
					arr[j] = dictionary.get(i);
				}
			}
		}
		// String re="";
		StringBuilder re = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			re.append(arr[i] + " ");
		}

		return re.toString().trim();
	}
}
