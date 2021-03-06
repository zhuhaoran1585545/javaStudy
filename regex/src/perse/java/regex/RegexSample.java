package perse.java.regex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {
	public static void main(String[] args) {
		StringBuilder content = new StringBuilder();
		try {
			FileInputStream fis = new FileInputStream("D:\\eclipseJeeWorkspace\\regex\\WebContent\\sample.html");
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader brd = new BufferedReader(isr);
			String lineText = "";
			while((lineText = brd.readLine())!=null) {
				content.append(lineText+"\n");
			}
			brd.close();
			// System.out.println(content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pattern p = Pattern.compile("<li>([\\u4e00-\\u9fa5]{2,10})([a-zA-Z]+)</li>");
		Matcher m = p.matcher(content);
		while(m.find()) {
			// System.out.println(m.group(0)); 
			System.out.println(m.group(1));
			System.out.println(m.group(2)); 
		}
	}
}
