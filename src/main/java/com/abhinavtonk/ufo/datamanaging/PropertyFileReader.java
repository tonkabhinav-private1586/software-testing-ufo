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
	private Properties properties;
	private File file;
	private FileInputStream fis;
	private String filePath;
	private PropertyFileReader propertyFileReader;

	public PropertyFileReader(String filePath){
		this.filePath = filePath;
		properties = new Properties();
		file = new File(this.filePath);		
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
	public IDataManager getDataSourceHandle() {
		if(propertyFileReader==null)
			propertyFileReader = new PropertyFileReader(filePath);

		return propertyFileReader;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <U,T> U getData(T... t) {		
		return (U) properties.getProperty((String) t[0]);
	}



	public static void main(String[] args) {
		/*HashSet<IDataManager> set = new HashSet<IDataManager>();
		IDataManager frameworkConfiguration1 = new PropertyFileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\roughPropertyFile.properties");
		//IDataManager frameworkConfiguration2 = new PropertyFileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\roughPropertyFile.properties");

		System.out.printf(frameworkConfiguration1.getData("name"));
		set.add(frameworkConfiguration1);
		set.add(frameworkConfiguration2);
		System.out.println(set.size());*/

	}
}
