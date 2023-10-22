package com.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		File f=new File("File.txt");
		try {
			
			FileWriter fw=new FileWriter(f);
			if(f.exists())
			{
				fw.write("Java Is PlatForm Indepent Programmin Language\n");
				fw.write("Java Is High Level and Object Oriented Programming Language");
				fw.close();
				System.out.println("Write to File");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
