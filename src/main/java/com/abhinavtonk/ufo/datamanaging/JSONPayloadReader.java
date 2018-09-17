package com.abhinavtonk.ufo.datamanaging;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JSONPayloadReader implements IDataManager{
	private String jsonFilePath;
	private File file;
	private DocumentContext dc;
	
	public JSONPayloadReader jsonPayloadReader;

	public JSONPayloadReader(String jsonFilePath){
		this.jsonFilePath = jsonFilePath;
		file = new File(this.jsonFilePath);
		try {
			dc = JsonPath.parse(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Override
	public IDataManager getDataSourceHandle() {
		if(jsonPayloadReader==null)
			jsonPayloadReader = new JSONPayloadReader(jsonFilePath);
		
		return jsonPayloadReader;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <U, T> U getData(T... t) {
		return (U) dc.read("$").toString();
	}

}
