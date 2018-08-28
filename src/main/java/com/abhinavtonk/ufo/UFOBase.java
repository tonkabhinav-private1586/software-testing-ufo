package com.abhinavtonk.ufo;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.factory.UFOFactory;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public class UFOBase implements IUFOBase{
	public UFOFactory ufoFactory;
	
	public IDataManager frameworkProperties;
	
	private ILogger logger;
	private IReporter reporter;
	
	public void startUFO(){
		ufoFactory  = new UFOFactory();
		
		ufoFactory.setDataSource("properties File");
		frameworkProperties = ufoFactory.getDataSource(ufoFactory.frameworkDataSource, System.getProperty("user.dir")+ "\\src\\main\\resources\\ufo.properties");
		
		ufoFactory.setLogger(frameworkProperties.getData("logger"));
		logger = ufoFactory.getLogger(ufoFactory.frameworkLogger);
		
		ufoFactory.setReporter(frameworkProperties.getData("reporter"));
		reporter = ufoFactory.getReporter(ufoFactory.frameworkReporter);
	}

	@Override
	public IDataManager getDataSourceHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <U, T> U getData(T... t) {
		// TODO Auto-generated method stub
		return null;
	}

}
