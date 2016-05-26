package com.xc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetArd {

	public static void main(String[] args) {
		try {

			java.net.URL url = new java.net.URL("http://cl.org.ru/htm_data/7/1411/1296368.html");
			System.out.println(url.openStream().toString());
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String ling = "";
			while ((ling = reader.readLine()) != null) {
				SVNs(ling);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void SVNs(String ling) {
		Pattern pattern = Pattern.compile("");
		Matcher matcher = pattern.matcher(ling);
		while (matcher.find()) {
			System.out.println("ssssssssssssssssssssssss");
		}
	}
}
