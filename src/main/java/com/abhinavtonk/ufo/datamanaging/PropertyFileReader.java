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
		properties = new Properties();
		file = new File(filePath);
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
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <S,T> S getData(T... t) {		
		return (S) properties.getProperty((String) t[0]);
	}

/*	public static void main(String[] args) {
		HashSet<IDataManager> set = new HashSet<IDataManager>();
		IDataManager frameworkConfiguration1 = new PropertyFileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\roughPropertyFile.properties");
		IDataManager frameworkConfiguration2 = new PropertyFileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\roughPropertyFile.properties");

		System.out.println(frameworkConfiguration1.getData("name"));
		set.add(frameworkConfiguration1);
		set.add(frameworkConfiguration2);
		System.out.println(set.size());

	}*/
}
