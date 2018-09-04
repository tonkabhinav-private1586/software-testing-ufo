package com.abhinavtonk.ufo;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.enums.FrameworkFilePath;
import com.abhinavtonk.ufo.enums.FrameworkPropertiesKey;
import com.abhinavtonk.ufo.factory.FrameworkFactory;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public class FrameworkBase implements IFrameworkBase{
	private FrameworkFactory frameworkFactory;
	
	private IDataManager frameworkProperties;	
	private ILogger logger;
	private IReporter reporter;
	
	public void startUFO(){
		frameworkFactory  = new FrameworkFactory();
		
		frameworkFactory.setFrameworkDataSource(FrameworkPropertiesKey.DATA_SOURCE.getValue());
		
		// 1
		frameworkProperties = frameworkFactory.getDataManager(frameworkFactory.getFrameworkDataSource(), FrameworkFilePath.FRAMEWORK_PROPERTIES_FILE_PATH.getValue());
		
		frameworkFactory.setFrameworkLoggingTool(FrameworkPropertiesKey.LOGGER.getValue());
		frameworkFactory.setFrameworkReportingTool(FrameworkPropertiesKey.REPORTER.getValue());
		
		// 2
		logger = frameworkFactory.getLogger(frameworkFactory.getFrameworkLoggingTool());
		
		// 3
		reporter = frameworkFactory.getReporter(frameworkFactory.getFrameworkReportingTool());
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
