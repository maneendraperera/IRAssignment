package com.infosystem.lucence;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class TextFileFilter extends FileFilter{

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.getName().toLowerCase().endsWith(".txt");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "text files";
	}

}
