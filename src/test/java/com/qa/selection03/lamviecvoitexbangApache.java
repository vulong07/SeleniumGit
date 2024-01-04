package com.qa.selection03;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class lamviecvoitexbangApache {

	public static void main(String[] args) throws IOException {
	File file = new File("src/test/resource/text/text");
	String readFile = FileUtils.readFileToString(file,"UTF-8");
	System.out.println("[Read File: "+readFile+"]");
	List<String>list=FileUtils.readLines(file,"UTF-8");
	System.out.println("[readline:"+list+"]");
		
		

	}

}
