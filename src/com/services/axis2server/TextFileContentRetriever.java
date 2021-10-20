/**
 * 
 */
package com.services.axis2server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ASUS
 *
 */
public class TextFileContentRetriever {
	
	public String test() {
		String ret="This works correctly";
		
		try {
			return ret;
		} catch (Exception e) {
			System.out.println(e.getMessage() );
			e.printStackTrace();
		}
		return ret;
	}

	

	public String retrieveTextFileContent(String path) {
		File file = new File(path);
		BufferedReader reader = null;
		StringBuilder line = new StringBuilder("");
		
		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;
			while ((text = reader.readLine()) != null) {
				line.append(text)
				.append(System.lineSeparator());
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(line.toString());
		return line.toString();
	}
}
