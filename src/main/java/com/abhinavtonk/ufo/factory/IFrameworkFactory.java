package com.abhinavtonk.ufo.factory;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.enums.FrameworkLoggingTool;
import com.abhinavtonk.ufo.enums.FrameworkReportingTool;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public interface IFrameworkFactory {

	ILogger getLogger(FrameworkLoggingTool frameworkLoggingTool);
	
	IReporter getReporter(FrameworkReportingTool frameworkReportingTool);
	
	IDataManager getDataManager(FrameworkDataSource frameworkDataSource, String sourcePath);
}
