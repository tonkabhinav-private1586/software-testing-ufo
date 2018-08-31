package com.abhinavtonk.ufo.enums;

import com.abhinavtonk.ufo.UFOBase;
import com.abhinavtonk.ufo.datamanaging.IDataManager;

public enum FrameworkProperties {

	LOGGER(getFrameworkProperties().getData("logger")),
	REPORTER(getFrameworkProperties().getData("reporter")),
	DATA_SOURCE("properties file")
	//DATA_SOURCE(getFrameworkProperties().getData("data source"))
	;

	private String value;
	private static UFOBase ufoBase;

	FrameworkProperties(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public static IDataManager getFrameworkProperties(){
		if(ufoBase==null){
			ufoBase = new UFOBase();
		}
		return ufoBase.getFrameworkProperties();
	}
}
