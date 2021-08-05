package com.vinodh.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchString {
	public static void main(String[] args) {

		//System.out.println(isContainExactWord("ontId,ontPort", "ontPort"));
		//System.out.println(isContainExactWord("TA5000", "TA5000,TA5004,TA5006"));
		String regex = "^[0-9-]+$";
		String scp="21-1-1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(scp);
		System.out.println(matcher.matches());

	}
	public static boolean isContainExactWord(String partWord,String fullString){
		String pattern = "\\b"+partWord.toLowerCase()+"\\b";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(fullString.toLowerCase());
		return m.find();
	}

}
