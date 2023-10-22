package com.files;

import java.io.File;

public class GetFileInformation 
{
	public static void main(String[] args) {
		
		File f=new File("File.txt");
		if(f.exists())
		{
			System.out.println("File Exists "+f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
		}
		else
		{
			System.out.println("File not found");
		}
	}

}
