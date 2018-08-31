package com.abhinavtonk.ufo.enums;

public enum FrameworkFilePaths {
	FRAMEWORK_PROPERTIES_FILE_PATH(System.getProperty("user.dir")+ "\\src\\main\\resources\\ufo.properties");
	
	private String value;

	FrameworkFilePaths(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}
}
