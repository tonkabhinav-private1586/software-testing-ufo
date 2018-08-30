package com.abhinavtonk.ufo.factory;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.enums.FrameworkLogger;
import com.abhinavtonk.ufo.enums.FrameworkReporter;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public interface IUFOFactory {

	void setFrameworkLogger(String frameworkLogger);
	FrameworkLogger getFrameworkLogger();
	
	void setFrameworkReporter(String frameworkReporter);
	FrameworkReporter getFrameworkReporter();
	
	void setFrameworkDataSource(String frameworkDataSource);
	FrameworkDataSource getFrameworkDataSource();
	
	void setLogger(FrameworkLogger frameworkLogger);
	ILogger getLogger();
	
	void setReporter(FrameworkReporter frameworkReporter);
	IReporter getReporter();
	
	void setDataManager(FrameworkDataSource frameworkDataSource, String dataManagerFilePath);
	IDataManager getDataManager();
	
	void setDataManagerFilePath(String dataManagerFilePath);
	String getDataManagerFilePath();
	
	
}
