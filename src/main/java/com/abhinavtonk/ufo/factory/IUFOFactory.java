package com.abhinavtonk.ufo.factory;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.enums.FrameworkLogger;
import com.abhinavtonk.ufo.enums.FrameworkReporter;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public interface IUFOFactory {

	ILogger getLogger(FrameworkLogger logger);
	void setLogger(String logger);
	
	IReporter getReporter(FrameworkReporter reporter);
	void setReporter(String reporter);
	
	IDataManager getDataSource(FrameworkDataSource dataSource, String sourcePath);
	void setDataSource(String dataSource);
}
