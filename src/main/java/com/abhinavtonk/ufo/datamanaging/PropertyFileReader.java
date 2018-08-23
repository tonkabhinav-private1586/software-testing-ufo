package com.abhinavtonk.ufo.datamanaging;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author atonk
 *
 */

public class PropertyFileReader implements IDataManager{
	Properties properties;
	File file;
	FileInputStream fis;
	
	public PropertyFileReader(String filePath){
		populateData(filePath);
	}

	public IDataManager populateData(String dataSource) {
		properties = new Properties();
		file = new File(dataSource);
		try {
			 fis = new FileInputStream(file);
			 properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return this;
	}

	@SuppressWarnings("unchecked")
	public <T> T getData(T... t) {		
		return (T) properties.getProperty((String) t[0]);
	}

	public static void main(String[] args) {
		IDataManager frameworkConfiguration = new PropertyFileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\roughPropertyFile.properties");
		System.out.println(frameworkConfiguration.getData("hghg"));
	}
}
