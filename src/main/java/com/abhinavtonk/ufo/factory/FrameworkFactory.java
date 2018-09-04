package com.abhinavtonk.ufo.factory;

import com.abhinavtonk.ufo.datamanaging.DatabaseReader;
import com.abhinavtonk.ufo.datamanaging.ExcelFileReader;
import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.datamanaging.PropertyFileReader;
import com.abhinavtonk.ufo.datamanaging.YamlFileReader;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.enums.FrameworkLoggingTool;
import com.abhinavtonk.ufo.enums.FrameworkReportingTool;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.logging.Log4jLogger;
import com.abhinavtonk.ufo.reporting.HtmlReporter;
import com.abhinavtonk.ufo.reporting.IReporter;
import com.abhinavtonk.ufo.reporting.ReportNGReporter;
import com.abhinavtonk.ufo.reporting.TestNGReporter;

public class FrameworkFactory implements IFrameworkFactory{

	public FrameworkLoggingTool frameworkLoggingTool;
	public FrameworkReportingTool frameworkReportingTool;
	public FrameworkDataSource frameworkDataSource;


	public FrameworkLoggingTool getFrameworkLoggingTool() {
		return frameworkLoggingTool;
	}

	public void setFrameworkLoggingTool(String frameworkLoggingTool) {
		if(frameworkLoggingTool.equalsIgnoreCase("log4j"))
			this.frameworkLoggingTool = FrameworkLoggingTool.LOG4J;

		//else if //TODO

	}

	public FrameworkReportingTool getFrameworkReportingTool() {
		return frameworkReportingTool;
	}

	public void setFrameworkReportingTool(String frameworkReportingTool) {
		if(frameworkReportingTool.equalsIgnoreCase("report ng reporter"))
			this.frameworkReportingTool = FrameworkReportingTool.REPORT_NG_REPORTER;

		else if(frameworkReportingTool.equalsIgnoreCase("html reporter"))
			this.frameworkReportingTool = FrameworkReportingTool.HTML_REPORTER;

		else if(frameworkReportingTool.equalsIgnoreCase("test ng reporter"))
			this.frameworkReportingTool = FrameworkReportingTool.TESTNG_REPORTER;
	}

	public FrameworkDataSource getFrameworkDataSource() {
		return frameworkDataSource;
	}

	public void setFrameworkDataSource(String frameworkDataSource) {
		if(frameworkDataSource.equalsIgnoreCase("excel file"))
			this.frameworkDataSource = FrameworkDataSource.EXCEL_FILE;
		
		else if(frameworkDataSource.equalsIgnoreCase("properties file"))
			this.frameworkDataSource = FrameworkDataSource.PROPERTIES_FILE;
		
		else if(frameworkDataSource.equalsIgnoreCase("yaml file"))
			this.frameworkDataSource = FrameworkDataSource.YAML_FILE;
		
		else if(frameworkDataSource.equalsIgnoreCase("database"))
			this.frameworkDataSource = FrameworkDataSource.DATABASE;
	}



	@Override
	public ILogger getLogger(FrameworkLoggingTool frameworkLoggingTool) {
		switch(frameworkLoggingTool){
		case LOG4J:
			return new Log4jLogger();

		default:
			return null;
		}
	}

	@Override
	public IReporter getReporter(FrameworkReportingTool frameworkReportingTool) {
		switch(frameworkReportingTool){
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
	public IDataManager getDataManager(FrameworkDataSource frameworkDataSource, String sourcePath) {
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

}
