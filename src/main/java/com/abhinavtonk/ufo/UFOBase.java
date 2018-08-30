package com.abhinavtonk.ufo;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.factory.UFOFactory;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public class UFOBase implements IUFOBase{
	private UFOFactory ufoFactory;

	private IDataManager frameworkProperties;	
	private ILogger logger;
	private IReporter reporter;

	UFOBase(){
		ufoFactory  = new UFOFactory();

		ufoFactory.setFrameworkDataSource("properties File");
		ufoFactory.setDataManagerFilePath(System.getProperty("user.dir")+ "\\src\\main\\resources\\ufo.properties");	
		ufoFactory.setDataManager(ufoFactory.getFrameworkDataSource(),ufoFactory.getDataManagerFilePath());
		
		// 1
		frameworkProperties = ufoFactory.getDataManager();

		ufoFactory.setFrameworkLogger(frameworkProperties.getData("logger"));
		ufoFactory.setFrameworkReporter(frameworkProperties.getData("reporter"));

		// 2
		logger = ufoFactory.getLogger();
		
		// 3
		reporter = ufoFactory.getReporter();
	}
	
/*	public void startUFO(){
		ufoFactory  = new UFOFactory();

		ufoFactory.setFrameworkDataSource("properties File");
		ufoFactory.setDataManagerFilePath(System.getProperty("user.dir")+ "\\src\\main\\resources\\ufo.properties");	
		ufoFactory.setDataManager(ufoFactory.getFrameworkDataSource(),ufoFactory.getDataManagerFilePath());
		frameworkProperties = ufoFactory.getDataManager();

		ufoFactory.setFrameworkLogger(frameworkProperties.getData("logger"));
		ufoFactory.setFrameworkReporter(frameworkProperties.getData("reporter"));

		logger = ufoFactory.getLogger();
		reporter = ufoFactory.getReporter();
	}*/

	public IDataManager getFrameworkProperties(){
		return frameworkProperties;
	}
	
	@Override
	public IDataManager getDataSourceHandle() {
		// TODO Auto-generated method stub
		return frameworkProperties.getDataSourceHandle(); // TODO
	}

	@Override
	public <U, T> U getData(T... t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void infoLog(String loggingMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debugLog(String loggingMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traceLog(String loggingMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warnLog(String loggingMsg) {
		// TODO Auto-generated method stub

	}

}
