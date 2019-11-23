package com.infosystem.lucence;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class HtmlFileFilter extends FileFilter{

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.getName().toLowerCase().endsWith(".html");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "html files";
	}

}
