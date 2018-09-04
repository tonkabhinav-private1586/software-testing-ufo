package com.abhinavtonk.ufo.enums;

import com.abhinavtonk.ufo.FrameworkBase;
import com.abhinavtonk.ufo.datamanaging.IDataManager;

public enum FrameworkPropertiesKey {

	LOGGER(getFrameworkProperties().getData("logger")),
	REPORTER(getFrameworkProperties().getData("reporter")),
	DATA_SOURCE("properties file")
	//DATA_SOURCE(getFrameworkProperties().getData("data source"))
	;

	private String value;
	private static FrameworkBase frameworkBase;

	FrameworkPropertiesKey(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public static IDataManager getFrameworkProperties(){
		if(frameworkBase==null){
			frameworkBase = new FrameworkBase();
		}
		return frameworkBase.getFrameworkProperties();
	}
}
