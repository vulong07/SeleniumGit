package com.qa.selection03;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class thaydoitaptintextbangApacje {

	public static void main(String[] args) throws IOException {
		File file = new File("src/test/resource/text/text");
		List<String> list = FileUtils.readLines(file,"UTF-8");
		System.out.println(list);
		Collections.sort(list);
		FileUtils.write(file, "", "UTF-8", false);
		for(String x:list) {
			FileUtils.write(file, x+"\n", "UTF-8", true);
			System.out.println(x);
     
}

}
}