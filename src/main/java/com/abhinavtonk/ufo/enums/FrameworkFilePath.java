package com.abhinavtonk.ufo.enums;

public enum FrameworkFilePath {
	FRAMEWORK_PROPERTIES_FILE_PATH(System.getProperty("user.dir")+ "\\src\\main\\resources\\ufo.properties");
	
	private String value;

	FrameworkFilePath(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}
}
