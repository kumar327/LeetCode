package com.aks.one000To1100;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacters_1002 {

	public static void main(String[] args) {
		String[] arr = { "bella", "label", "roller" };
		System.out.println(commonChars(arr));

	}

	public static List<String> commonChars(String[] words) {
		List<String> re = new ArrayList<>();
		if (words.length == 1) {
			re.add(words[0]);
			return re;
		}

		String word = words[0];
		for (int i = 0; i < word.length(); i++) {
			String str = word.charAt(i) + "";
			boolean isFound = true;
			for (int j = 1; j < words.length; j++) {
				StringBuilder innerString = new StringBuilder(words[j]);
				int index = innerString.toString().indexOf(str);
				if (index < 0) {
					isFound = false;
					break;
				} else
					words[j] = innerString.replace(index, index + 1, "1").toString();
			}
			if (isFound) {
				re.add(str);
			}
		}
		return re;
	}
}
