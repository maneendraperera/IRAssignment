package com.infosystem;

import java.io.File;
import java.util.List;

import org.tartarus.snowball.ext.PorterStemmer;

import com.infosystem.utility.FileHelper;

public class FileIndexer {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("You have not provided the document folder");
			System.exit(0);
		}
		
		FileHelper fileHelper = new FileHelper();
		System.out.println("----- Listing files in the folder -----");
		List<File> fileList = fileHelper.listAllFiles(args[0]);
		
		/*PorterStemmer pos = new PorterStemmer();
		pos.setCurrent("coming");
		pos.stem();
		System.out.println(pos.getCurrent());*/
		
	}

}
