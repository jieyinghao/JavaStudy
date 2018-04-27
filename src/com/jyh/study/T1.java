package com.jyh.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

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
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
	}

}
