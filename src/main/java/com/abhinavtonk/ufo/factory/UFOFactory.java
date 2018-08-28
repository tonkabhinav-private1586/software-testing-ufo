package com.abhinavtonk.ufo.factory;

import com.abhinavtonk.ufo.datamanaging.DatabaseReader;
import com.abhinavtonk.ufo.datamanaging.ExcelFileReader;
import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.datamanaging.PropertyFileReader;
import com.abhinavtonk.ufo.datamanaging.YamlFileReader;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.enums.FrameworkLogger;
import com.abhinavtonk.ufo.enums.FrameworkReporter;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.logging.Log4jLogger;
import com.abhinavtonk.ufo.reporting.HtmlReporter;
import com.abhinavtonk.ufo.reporting.IReporter;
import com.abhinavtonk.ufo.reporting.ReportNGReporter;
import com.abhinavtonk.ufo.reporting.TestNGReporter;

public class UFOFactory implements IUFOFactory{
	public FrameworkLogger frameworkLogger;
	public FrameworkReporter frameworkReporter;
	public FrameworkDataSource frameworkDataSource;

	@Override
	public ILogger getLogger(FrameworkLogger frameworkLogger) {
		switch(frameworkLogger){
		case LOG4J:
			return new Log4jLogger();

		default:
			return null;
		}
	}
	
	@Override
	public void setLogger(String frameworkLogger) {
		// TODO Auto-generated method stub
		if(frameworkLogger.equalsIgnoreCase("log4j")){
			this.frameworkLogger = FrameworkLogger.LOG4J;
		}
		// TODO
		//else if()
		
		
	}

	@Override
	public IReporter getReporter(FrameworkReporter frameworkReporter) {
		switch(frameworkReporter){
		case REPORT_NG_REPORTER:
			return new ReportNGReporter();

		case HTML_REPORTER:
			return new HtmlReporter();

		case TESTNG_REPORTER:
			return new TestNGReporter();

		default:
			return null;
		}
	}
	
	@Override
	public IDataManager getDataSource(FrameworkDataSource frameworkDataSource, String sourcePath) {
		switch(frameworkDataSource){
		case EXCEL_FILE:
			return new ExcelFileReader(sourcePath);

		case PROPERTIES_FILE:
			return new PropertyFileReader(sourcePath);

		case YAML_FILE:
			return new YamlFileReader(sourcePath);

		case DATABASE:
			return new DatabaseReader(sourcePath);
			
		default:
			return null;
		}
	}
	
	@Override
	public void setDataSource(String frameworkDataSource) {
		// TODO Auto-generated method stub
		if(frameworkDataSource.equalsIgnoreCase("properties file")){
			this.frameworkDataSource = FrameworkDataSource.PROPERTIES_FILE;
		}
		else if(frameworkDataSource.equalsIgnoreCase("excel file")){
			this.frameworkDataSource = FrameworkDataSource.EXCEL_FILE;
		}
		else if(frameworkDataSource.equalsIgnoreCase("yamlm file")){
			this.frameworkDataSource = FrameworkDataSource.YAML_FILE;
		}
		else if(frameworkDataSource.equalsIgnoreCase("db")){
			this.frameworkDataSource = FrameworkDataSource.DATABASE;
		}
	}



	@Override
	public void setReporter(String frameworkReporter) {
		// TODO Auto-generated method stub
		
	}





}
