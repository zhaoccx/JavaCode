package com.zcc.datetest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mys {

	public static void getWebCon(String domain) {

		System.out.println("开始抓取邮件地址..(" + domain + ")");
		for (int i = 1; i <= 26; i++) {
			StringBuffer sb = new StringBuffer();
			try {
				java.net.URL url = new java.net.URL(domain + "?pn=" + i);
				BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
				String line;
				while ((line = in.readLine()) != null) {
					parse(line);
				}
				System.out.println();
				in.close();
				sb = null;
			} catch (Exception e) {
				sb.append(e.toString());
				System.err.println(e);

			}
		}
	}

	public static void main(String[] args) {
		System.out.println("start");
		Mys.getWebCon("http://tieba.baidu.com/p/2397637364"); // 这是要抓取的网页,自己可以试下.
		System.out.println("end");
	}

	private static void parse(String line) {
		Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");// 邮箱的正则表达式
		Matcher m = p.matcher(line);
		while (m.find()) {
			System.out.print(m.group() + ";");
		}
	}
}
