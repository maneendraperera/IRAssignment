package com.infosystem.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
	
	List<File> files = null;

	public List<File> listAllFiles(String documentFolderPath) {
		File directory = new File(documentFolderPath);
		
	    // Get all files from the directory.
	    File[] fileList = directory.listFiles();
	    if(fileList != null) {
	    	if(files == null) {
	    		files = new ArrayList<File>();
	    	}
	        for (File file : fileList) {
	        	String fileName = file.getName();
	            if (file.isFile() && fileName.endsWith(".htm") || fileName.endsWith(".rtf")) {
	                files.add(file);
	                System.out.println(file.getAbsolutePath());
	            } else if (file.isDirectory()) {
	                listAllFiles(file.getAbsolutePath());
	            }
	        }
	    }
		return files;
	}
	

}
