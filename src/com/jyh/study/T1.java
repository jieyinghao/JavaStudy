package com.jyh.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @desc 
 * 
 * @Author jieyinghao
 * @2018年4月27日 下午8:55:32 
 
 */
public class T1 {

	public static void main(String[] args)throws Exception {

		URL url = new URL("https://www.apple.com/cn/shop/buy-mac/macbook");
		URLConnection conn = url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String s = "";
		Pattern p = Pattern.compile("jpeg");
		
		while((s=br.readLine())!=null) {
			//System.out.println(s);
			Matcher m = p.matcher(s);
			if(m.find()) {
				String[] str = s.split("\"");
				System.out.println(str[1]);
			}
		}
	}

}
