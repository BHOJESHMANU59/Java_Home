package com.files;

import java.io.FileReader;

public class FileReaderFromFile 
{
	public static void main(String[] args) {
		try
		{
			FileReader fr=new FileReader("Files.java");
			int i;
			while((i=fr.read())!=-1)
			{
				System.err.print((char)i);
			}
			fr.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
