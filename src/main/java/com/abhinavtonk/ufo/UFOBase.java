package com.abhinavtonk.ufo;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.enums.FrameworkFilePaths;
import com.abhinavtonk.ufo.enums.FrameworkProperties;
import com.abhinavtonk.ufo.factory.UFOFactory;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public class UFOBase implements IUFOBase{
	private UFOFactory ufoFactory;
	
	private IDataManager frameworkProperties;	
	private ILogger logger;
	private IReporter reporter;
	
	public void startUFO(){
		ufoFactory  = new UFOFactory();
		
		ufoFactory.setFrameworkDataSource(FrameworkProperties.DATA_SOURCE.getValue());
		
		// 1
		frameworkProperties = ufoFactory.getDataManager(ufoFactory.getFrameworkDataSource(), FrameworkFilePaths.FRAMEWORK_PROPERTIES_FILE_PATH.getValue());
		
		ufoFactory.setFrameworkLoggingTool(FrameworkProperties.LOGGER.getValue());
		ufoFactory.setFrameworkReportingTool(FrameworkProperties.REPORTER.getValue());
		
		// 2
		logger = ufoFactory.getLogger(ufoFactory.getFrameworkLoggingTool());
		
		// 3
		reporter = ufoFactory.getReporter(ufoFactory.getFrameworkReportingTool());
	}
	
	public IDataManager getFrameworkProperties() {
		return frameworkProperties;
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
